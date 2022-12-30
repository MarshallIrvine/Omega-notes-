package com.marshall.omeganotes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val idNote: Int = 0,
    val content: String
)
