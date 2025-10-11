package com.isabel.medicaldictionary.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.isabel.medicaldictionary.data.*
import com.isabel.medicaldictionary.ui.theme.MedicalDictionaryTheme

// ====================== Andmeallikad ======================
fun getAllDiseases(): List<String> {
    return (DiseaseInfo.getDiseaseList() + DiseaseInfo2.getDiseaseList()).distinct().sorted()
}

fun getDiseaseSummaryAny(name: String): Pair<String, List<Reference>> {
    return when {
        DiseaseInfo.getDiseaseList().contains(name) -> DiseaseInfo.getDiseaseSummary(name)
        DiseaseInfo2.getDiseaseList().contains(name) -> DiseaseInfo2.getDiseaseSummary(name)
        else -> Pair("No summary available.", emptyList())
    }
}

// ====================== MainActivity ======================
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val allDiseases = getAllDiseases()

        setContent {
            MedicalDictionaryTheme {
                DiseaseSearchScreenWithFavorites(
                    diseases = allDiseases,
                    onItemClick = { disease ->
                        val intent = Intent(this, DiseaseDetailActivity::class.java)
                        intent.putExtra("disease_name", disease)
                        startActivity(intent)
                    }
                )
            }
        }
    }
}

// ====================== Esileht: otsing + lemmikud ======================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiseaseSearchScreenWithFavorites(
    diseases: List<String>,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var query by remember { mutableStateOf("") }
    var menuExpanded by remember { mutableStateOf(false) }

    // laeme lemmikud ja jälgime muutusi
    var favorites by remember { mutableStateOf(FavoritesManager.getFavorites(context).toMutableSet()) }

    val filteredDiseases = diseases.filter { it.contains(query, ignoreCase = true) || query.isEmpty() }

    val sites = listOf(
        "PubMed" to "https://pubmed.ncbi.nlm.nih.gov/",
        "Ciberleninka" to "https://cyberleninka.ru/",
        "NCBI" to "https://www.ncbi.nlm.nih.gov/"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("All Diseases") },
                actions = {
                    // Menüü
                    Box {
                        IconButton(onClick = { menuExpanded = !menuExpanded }) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                        DropdownMenu(
                            expanded = menuExpanded,
                            onDismissRequest = { menuExpanded = false }
                        ) {
                            sites.forEach { (siteName, baseUrl) ->
                                DropdownMenuItem(
                                    text = { Text(siteName, fontWeight = FontWeight.Bold) },
                                    onClick = {
                                        menuExpanded = false
                                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(baseUrl))
                                        context.startActivity(intent)
                                    }
                                )
                            }
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            // 🔍 Otsing
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Search disease") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )

            // 💖 Lemmikud
            if (favorites.isNotEmpty()) {
                Text(
                    text = "Favorites",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
                LazyColumn(modifier = Modifier.heightIn(max = 200.dp)) {
                    items(favorites.toList()) { disease ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = disease,
                                modifier = Modifier
                                    .weight(1f)
                                    .clickable { onItemClick(disease) },
                                style = MaterialTheme.typography.bodyLarge
                            )
                            IconButton(onClick = {
                                FavoritesManager.removeFavorite(context, disease)
                                favorites = FavoritesManager.getFavorites(context).toMutableSet()
                            }) {
                                Icon(Icons.Default.Favorite, contentDescription = "Remove favorite")
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // 📋 Haiguste nimekiri
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(filteredDiseases) { disease ->
                    val isFav = favorites.contains(disease)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = disease,
                            modifier = Modifier
                                .weight(1f)
                                .clickable { onItemClick(disease) },
                            style = MaterialTheme.typography.bodyLarge
                        )
                        IconButton(onClick = {
                            if (isFav) {
                                FavoritesManager.removeFavorite(context, disease)
                            } else {
                                FavoritesManager.addFavorite(context, disease)
                            }
                            favorites = FavoritesManager.getFavorites(context).toMutableSet()
                        }) {
                            Icon(
                                imageVector = if (isFav) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite toggle"
                            )
                        }
                    }
                }
            }
        }
    }
}

// ====================== DetailActivity ======================
class DiseaseDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val diseaseName = intent.getStringExtra("disease_name") ?: "Unknown"
        val (summary, references) = getDiseaseSummaryAny(diseaseName)

        setContent {
            MedicalDictionaryTheme {
                DiseaseDetailScreen(diseaseName, summary, references)
            }
        }
    }
}

// ====================== Detail-leht koos menüü ja lemmikuga ======================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiseaseDetailScreen(
    diseaseName: String,
    summary: String,
    references: List<Reference>,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val sites = listOf(
        "PubMed" to "https://pubmed.ncbi.nlm.nih.gov/?term=",
        "Ciberleninka" to "https://cyberleninka.ru/search?q=",
        "NCBI" to "https://www.ncbi.nlm.nih.gov/search/all/?term="
    )
    val keywords = listOf("alternative", "herbs", "amino acids", "vitamins", "minerals", "supplements", "nutrients")
    var menuExpanded by remember { mutableStateOf(false) }
    var expandedSite by remember { mutableStateOf<String?>(null) }
    var isFavorite by remember { mutableStateOf(FavoritesManager.isFavorite(context, diseaseName)) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(diseaseName) },
                actions = {

                    // 📚 Menüü keywordidega
                    Box {
                        IconButton(onClick = { menuExpanded = !menuExpanded }) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                        DropdownMenu(
                            expanded = menuExpanded,
                            onDismissRequest = { menuExpanded = false }
                        ) {
                            sites.forEach { (siteName, baseUrl) ->
                                DropdownMenuItem(
                                    text = { Text(siteName, fontWeight = FontWeight.Bold) },
                                    onClick = {
                                        expandedSite = if (expandedSite == siteName) null else siteName
                                    }
                                )
                                if (expandedSite == siteName) {
                                    keywords.forEach { keyword ->
                                        val queryUrl = "${diseaseName.replace(" ", "+")}+$keyword"
                                        DropdownMenuItem(
                                            text = { Text("   $keyword") },
                                            onClick = {
                                                menuExpanded = false
                                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("$baseUrl$queryUrl"))
                                                context.startActivity(intent)
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Text(text = summary, style = MaterialTheme.typography.bodyLarge)

            Spacer(modifier = Modifier.height(16.dp))

            if (references.isNotEmpty()) {
                Text(
                    text = "References:",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
                references.forEach { ref ->
                    Text(
                        text = "${ref.title} (${ref.pmid})",
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                val url = "https://pubmed.ncbi.nlm.nih.gov/${ref.pmid}/"
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                context.startActivity(intent)
                            }
                            .padding(vertical = 4.dp),
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }
    }
}
