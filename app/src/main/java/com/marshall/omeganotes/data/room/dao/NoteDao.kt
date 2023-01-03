package com.marshall.omeganotes.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.marshall.omeganotes.data.model.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note ORDER BY id")
    fun getAllNotes(): List<Note>

    @Insert
    suspend fun insertNote(note: Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}