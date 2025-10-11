package com.isabel.medicaldictionary

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.room.Room
import com.isabel.medicaldictionary.data.AppDatabase
import com.isabel.medicaldictionary.data.DiseaseInfo
import com.isabel.medicaldictionary.data.DiseaseInfo2
import com.isabel.medicaldictionary.ui.main.DiseaseDetailActivity
import com.isabel.medicaldictionary.ui.main.DiseaseSearchScreenWithFavorites
import com.isabel.medicaldictionary.ui.theme.MedicalDictionaryTheme

class MainActivity : ComponentActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "medical_dictionary_db"
        ).build()

        // Liidame mõlema allika haiguste nimekirjad
        val allDiseases = (DiseaseInfo.getDiseaseList() + DiseaseInfo2.getDiseaseList()).distinct().sorted()


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
