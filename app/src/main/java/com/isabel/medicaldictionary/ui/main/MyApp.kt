package com.isabel.medicaldictionary

import android.app.Application
import com.isabel.medicaldictionary.data.AppDatabase
import com.isabel.medicaldictionary.data.Disease
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val db = AppDatabase.getDatabase(this)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val diseaseName = "Acne"
                val existing = db.diseaseDao().getDiseaseByName(diseaseName)
                if (existing == null) {
                    val acne = Disease(
                        name = diseaseName,
                        summary = "Short summary about Acne..." // või jätad tühjaks, hiljem saab täita
                    )
                    db.diseaseDao().insertDisease(acne)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
