package com.marshall.omeganotes.data.di.task_module

import com.marshall.omeganotes.data.repository.TaskRepository
import com.marshall.omeganotes.data.room.OmegaDatabase
import com.marshall.omeganotes.data.room.dao.TaskDao
import com.marshall.omeganotes.domain.task.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TaskModule {

    @Provides
    fun provideTaskUseCase(taskRepository: TaskRepository): TaskUseCase {
        return TaskUseCase(
            AddNewTaskUseCase(taskRepository = taskRepository),
            GetAllTasksUseCase(taskRepository = taskRepository),
            UpdateTaskUseCase(taskRepository = taskRepository),
            DeleteTaskUseCase(taskRepository = taskRepository)
        )
    }

    @Provides
    @Singleton
    fun provideTaskDao(omegaDatabase: OmegaDatabase): TaskDao {
        return omegaDatabase.getTaskDao()
    }

    @Provides
    @Singleton
    fun provideTaskRepository(taskDao: TaskDao): TaskRepository {
        return TaskRepository(taskDao)
    }
}