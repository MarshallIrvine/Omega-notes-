package com.marshall.omeganotes.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.marshall.omeganotes.data.model.Task

@Dao
interface TaskDao {
    @Query("SELECT * FROM task ORDER BY createdAt")
    fun getAllTasks(): List<Task>

    @Insert
    suspend fun insertTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Update
    suspend fun updateTask(task: Task)

}