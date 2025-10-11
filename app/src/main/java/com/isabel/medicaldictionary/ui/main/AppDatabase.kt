package com.isabel.medicaldictionary.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Disease::class, DiseaseLink::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun diseaseDao(): DiseaseDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "medical_dictionary_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
