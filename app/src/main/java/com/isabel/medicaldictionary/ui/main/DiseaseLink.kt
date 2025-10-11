package com.isabel.medicaldictionary.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "disease_links")
data class DiseaseLink(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "diseaseName")
    val diseaseName: String,
    @ColumnInfo(name = "siteName")
    val siteName: String,
    @ColumnInfo(name = "url")
    val url: String
)
