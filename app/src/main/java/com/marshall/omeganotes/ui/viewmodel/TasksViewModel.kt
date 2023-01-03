package com.marshall.omeganotes.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marshall.omeganotes.data.model.Task
import com.marshall.omeganotes.domain.task.TaskUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(private val taskUseCase: TaskUseCase): ViewModel() {
    private var _tasks = MutableLiveData<List<Task>>()
    val tasks get() = _tasks

    fun observeTasks() {
        viewModelScope.launch {
            taskUseCase.getAllTasksUseCase.invoke().collect {
                _tasks.postValue(it)
            }
        }

    }

    fun add(task: Task) {
        taskUseCase.addNewTaskUseCase.invoke(task)
    }

    fun update(task: Task) {
        taskUseCase.updateTaskUseCase.invoke(task)
    }

    fun delete (task: Task) {
        taskUseCase.deleteTaskUseCase.invoke(task)
    }

}