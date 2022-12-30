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
    fun insertTask(task: Task)

    @Delete
    fun deleteTask(task: Task)

    @Update
    fun updateTask(task: Task)

}