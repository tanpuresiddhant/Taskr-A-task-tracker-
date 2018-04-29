package com.Taskr.Taskrapi.services;

import com.Taskr.Taskrapi.commands.TaskForm;
import com.Taskr.Taskrapi.model.Task;

import java.util.List;

public interface TaskService {

        List<Task> listAll();

        Task getById(String id);

        Task saveOrUpdate(Task task);

        void delete(String id);

        Task saveOrUpdateTaskForm(TaskForm taskForm);
}
