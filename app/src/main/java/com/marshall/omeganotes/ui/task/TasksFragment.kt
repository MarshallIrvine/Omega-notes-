package com.marshall.omeganotes.ui.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.marshall.omeganotes.databinding.FragmentTasksBinding
import com.marshall.omeganotes.ui.viewmodel.TasksViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TasksFragment : Fragment() {
    private var _binding: FragmentTasksBinding? = null
    private val binding get() = _binding!!
    private val taskViewModel  by activityViewModels<TasksViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTasksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        taskViewModel.observeTasks()
        taskViewModel.tasks.observe(viewLifecycleOwner, Observer {
            Toast.makeText(this.context, it.size.toString(), Toast.LENGTH_LONG).show()
        })
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}