package com.isabel.medicaldictionary.ui.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun DiseaseSearchScreen(
    diseases: List<String>,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var query by remember { mutableStateOf("") }

    // Filtreeritud nimekiri käivitub ainult siis, kui query >= 3
    val filteredDiseases = if (query.length >= 3) {
        diseases.filter { it.contains(query, ignoreCase = true) }
    } else {
        null
    }

    Column(modifier = modifier.padding(16.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Search disease") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        if (query.length in 1..2) {
            Text(
                text = "Type at least 3 characters to search",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f), // heledam tekst
                modifier = Modifier.padding(12.dp)
            )
        }


        LazyColumn {
            val listToShow = filteredDiseases ?: diseases // kui filtered null, näita kogu nimekirja
            items(listToShow) { disease ->
                Text(
                    text = disease,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onItemClick(disease) }
                        .padding(12.dp)
                )
            }
        }
    }
}
