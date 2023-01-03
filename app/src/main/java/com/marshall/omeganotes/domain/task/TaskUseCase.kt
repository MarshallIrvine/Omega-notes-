package com.marshall.omeganotes.domain.task

data class TaskUseCase(
    val addNewTaskUseCase: AddNewTaskUseCase,
    val getAllTasksUseCase: GetAllTasksUseCase,
    val updateTaskUseCase: UpdateTaskUseCase,
    val deleteTaskUseCase: DeleteTaskUseCase
)
