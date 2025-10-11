package com.isabel.medicaldictionary.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.isabel.medicaldictionary.data.DiseaseInfo
import com.isabel.medicaldictionary.data.DiseaseInfo2

// ====================== Haiguste nimekiri ======================
fun getDiseaseList(): List<String> {
    return (DiseaseInfo.getDiseaseList() + DiseaseInfo2.getDiseaseList())
        .distinct()
        .sorted()
}

class DiseaseListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiseaseScreenWithSearchAndMenu()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiseaseScreenWithSearchAndMenu() {
    val context = LocalContext.current
    val diseases = getDiseaseList()

    var query by remember { mutableStateOf("") }
    val filteredDiseases = if (query.length >= 3) {
        diseases.filter { it.contains(query, ignoreCase = true) }
    } else {
        diseases
    }

    // Menüü andmed
    val sites = listOf(
        "PubMed" to "https://pubmed.ncbi.nlm.nih.gov/?term=example",
        "Ciberleninka" to "https://cyberleninka.ru/search?q=example",
        "NCBI" to "https://www.ncbi.nlm.nih.gov/search/all/?term=example"
    )
    var menuExpanded by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("All Diseases") },
                actions = {
                    IconButton(onClick = { menuExpanded = true }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                    DropdownMenu(
                        expanded = menuExpanded,
                        onDismissRequest = { menuExpanded = false }
                    ) {
                        sites.forEach { (name, url) ->
                            DropdownMenuItem(
                                text = { Text(name) },
                                onClick = {
                                    menuExpanded = false
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                    context.startActivity(intent)
                                }
                            )
                        }
                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            // Otsinguriba
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Search disease (min 3 letters)") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            // Haiguste nimekiri
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(filteredDiseases) { disease ->
                    Text(
                        text = disease,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                // Avab DiseaseDetailActivity
                                val intent = Intent(context, DiseaseDetailActivity::class.java)
                                intent.putExtra("disease_name", disease)
                                context.startActivity(intent)
                            }
                            .padding(12.dp),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}
