package com.marshall.omeganotes.data.repository

import com.marshall.omeganotes.data.model.Note
import com.marshall.omeganotes.data.room.dao.NoteDao
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {
    fun getAllNotes() = flow { emit(noteDao.getAllNotes()) }
    suspend fun addNote(note: Note) = noteDao.insertNote(note)
    suspend fun updateNote(note: Note) = noteDao.updateNote(note)
    suspend fun deleteNote(note: Note) = noteDao.deleteNote(note)

}