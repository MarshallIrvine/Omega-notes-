package com.marshall.omeganotes.data.repository

import com.marshall.omeganotes.data.model.Event
import com.marshall.omeganotes.data.room.dao.EventDao
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class EventRepository @Inject constructor(private val eventDao: EventDao) {
    fun getAllEvents() = flow { emit(eventDao.getAllEvents()) }
    suspend fun addEvent(event: Event) = eventDao.insertEvent(event)
    suspend fun updateEvent(event: Event) = eventDao.updateEvent(event)
    suspend fun deleteEvent(event: Event) = eventDao.deleteEvent(event)
}