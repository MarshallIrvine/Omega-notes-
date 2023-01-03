package com.marshall.omeganotes.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "task")
data class Task(
    @PrimaryKey(autoGenerate = true)
    override val id: Int = 0,
    val title: String,
    val description: String?,
    @ColumnInfo(name = "state")
    val isDone: Boolean = false,
    @ColumnInfo(name = "priority")
    val priorityLevel: Int,
    val createdAt: Date = Date()
): OmegaEntity
