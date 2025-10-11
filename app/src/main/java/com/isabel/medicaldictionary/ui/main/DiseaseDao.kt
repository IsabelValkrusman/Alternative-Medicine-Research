package com.isabel.medicaldictionary.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DiseaseDao {

    // Õige tabeli nimi: disease
    @Query("SELECT * FROM disease WHERE name = :name ")
    suspend fun getDiseaseByName(name: String): Disease?

    @Query("SELECT * FROM disease_links WHERE diseaseName = :name")
    suspend fun getLinksByDisease(name: String): List<DiseaseLink>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDisease(disease: Disease)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLinks(links: List<DiseaseLink>)


}
