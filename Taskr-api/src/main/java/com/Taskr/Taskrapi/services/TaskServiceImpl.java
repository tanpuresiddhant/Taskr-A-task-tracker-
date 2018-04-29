package com.Taskr.Taskrapi.services;

import com.Taskr.Taskrapi.commands.TaskForm;
import com.Taskr.Taskrapi.converters.TaskFormToTask;
import com.Taskr.Taskrapi.model.Task;
import com.Taskr.Taskrapi.repositories.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;
    private TaskFormToTask taskFormToTask;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskFormToTask taskFormToTask) {
        this.taskRepository = taskRepository;
        this.taskFormToTask = taskFormToTask;
    }

    @Override
    public List<Task> listAll() {
        List<Task> tasks = new ArrayList<>();
        taskRepository.findAll().forEach(tasks::add);
        return tasks;
    }

    @Override
    public Task getById(String id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task saveOrUpdate(Task task) {
        taskRepository.save(task);
        return task;
    }

    @Override
    public void delete(String id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task saveOrUpdateTaskForm(TaskForm taskForm) {
        Task savedTask = saveOrUpdate(taskFormToTask.convert(taskForm));
        System.out.println("Saved task Id: " + savedTask.getTaskId());
        return savedTask;
    }
}
