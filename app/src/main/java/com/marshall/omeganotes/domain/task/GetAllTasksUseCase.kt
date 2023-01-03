package com.marshall.omeganotes.domain.task


import com.marshall.omeganotes.data.model.Task
import com.marshall.omeganotes.data.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    operator fun invoke(): Flow<List<Task>> = taskRepository.getAllTasks()


}