package com.marshall.omeganotes.domain.task


import com.marshall.omeganotes.data.repository.TaskRepository
import javax.inject.Inject

class GetAllTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    operator fun invoke() = taskRepository.getAllTasks()
}