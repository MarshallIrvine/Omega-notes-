package com.marshall.omeganotes.data.db.dao

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
    fun getAllEvents()

    @Insert
    fun insertEvent(task: Task)

    @Update
    fun updateEvent(event: Event)

    @Delete
    fun deleteEvent(event: Event)
}
