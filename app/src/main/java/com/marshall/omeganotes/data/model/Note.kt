package com.marshall.omeganotes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class Note(
    @PrimaryKey(autoGenerate = true)
    override val id: Int = 0,
    val content: String
): OmegaEntity
