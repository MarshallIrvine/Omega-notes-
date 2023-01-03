package com.marshall.omeganotes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "event")
data class Event(
    @PrimaryKey(autoGenerate = true)
    override val id: Int = 0,
    val location: String,
    val description: String?,
    val eventDate: Date,
): OmegaEntity
