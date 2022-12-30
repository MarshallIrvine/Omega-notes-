package com.marshall.omeganotes.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.marshall.omeganotes.data.room.dao.EventDao
import com.marshall.omeganotes.data.room.dao.NoteDao
import com.marshall.omeganotes.data.room.dao.TaskDao
import com.marshall.omeganotes.data.model.Event
import com.marshall.omeganotes.data.model.Note
import com.marshall.omeganotes.data.model.Task

@Database(entities = [Task::class, Note::class, Event::class], version = 1)
abstract class OmegaDatabase : RoomDatabase() {
    abstract fun getNoteDao(): NoteDao
    abstract fun getTaskDao(): TaskDao
    abstract fun getEventDao(): EventDao

    companion object {
        @Volatile
        var INSTANCE: OmegaDatabase? = null

        fun getOmegaDatabase(context: Context): OmegaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    OmegaDatabase::class.java,
                    "omega_db"
                )
                    .build()
                INSTANCE = instance
                instance
            }
        }

    }
}