package com.marshall.omeganotes.domain.task

import com.marshall.omeganotes.data.model.Task
import com.marshall.omeganotes.data.repository.TaskRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(task: Task) {
        CoroutineScope(Dispatchers.IO).launch {
            taskRepository.deleteTask(task)
        }
    }
}