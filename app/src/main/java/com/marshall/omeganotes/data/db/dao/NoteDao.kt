package com.marshall.omeganotes.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.marshall.omeganotes.data.model.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note ORDER BY idNote")
    fun getAllNotes(): List<Note>

    @Insert
    fun insertNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)
}