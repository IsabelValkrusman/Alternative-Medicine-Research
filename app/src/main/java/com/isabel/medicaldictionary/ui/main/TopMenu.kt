package com.isabel.medicaldictionary.ui.main

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopMenu() {
    val context = LocalContext.current
    var menuExpanded by remember { mutableStateOf(false) }

    val sites = listOf(
        "PubMed" to "https://pubmed.ncbi.nlm.nih.gov/?term=example",
        "Ciberleninka" to "https://cyberleninka.ru/search?q=example",
        "NCBI" to "https://www.ncbi.nlm.nih.gov/search/all/?term=example"
    )

    Box {
        IconButton(onClick = { menuExpanded = !menuExpanded }) {
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
}
