package com.marshall.omeganotes.data.di

import android.content.Context
import com.marshall.omeganotes.data.model.Task
import com.marshall.omeganotes.data.room.OmegaDatabase
import com.marshall.omeganotes.data.room.dao.EventDao
import com.marshall.omeganotes.data.room.dao.NoteDao
import com.marshall.omeganotes.data.room.dao.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OmegaModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): OmegaDatabase {
        return OmegaDatabase.getOmegaDatabase(context = context)
    }

    @Provides
    @Singleton
    fun provideEventDao(omegaDatabase: OmegaDatabase): EventDao {
        return omegaDatabase.getEventDao()
    }

    @Provides
    @Singleton
    fun provideNoteDao(omegaDatabase: OmegaDatabase): NoteDao {
        return omegaDatabase.getNoteDao()
    }

    @Provides
    @Singleton
    fun provideTaskDao(omegaDatabase: OmegaDatabase): TaskDao {
        return omegaDatabase.getTaskDao()
    }



}