package com.marshall.omeganotes.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.marshall.omeganotes.data.model.Event
import com.marshall.omeganotes.data.model.Task

@Dao
interface EventDao {
    @Query("SELECT * FROM event")
    fun getAllEvents(): List<Event>

    @Insert
    suspend fun insertEvent(event: Event)

    @Update
    suspend fun updateEvent(event: Event)

    @Delete
    suspend fun deleteEvent(event: Event)
}
