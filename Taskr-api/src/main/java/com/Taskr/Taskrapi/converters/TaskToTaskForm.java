package com.Taskr.Taskrapi.converters;

import com.Taskr.Taskrapi.commands.TaskForm;
import com.Taskr.Taskrapi.model.Task;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

@Component
public class TaskToTaskForm implements Converter<Task, TaskForm>  {
    @Override
    public TaskForm convert(Task task) {
        TaskForm taskForm = new TaskForm();
        taskForm.setTaskId(task.getTaskId().toHexString());
        taskForm.setTaskName(task.getTaskName());
        taskForm.setTaskDescription(task.getTaskDescription());
        taskForm.setTaskNotes(task.getTaskNotes());
        taskForm.setTaskPriority(task.getTaskPriority());
        taskForm.setTaskCreatedDate(task.getTaskCreatedDate());
        taskForm.setTaskCompletedDate(task.getTaskCompletedDate());
        taskForm.setTaskCompletionDate(task.getTaskCompletionDate());
        taskForm.setTaskStatus(task.getTaskStatus());
        taskForm.setTaskCreatedBy(task.getTaskCreatedBy());
        taskForm.setTaskAssignedTo(task.getTaskAssignedTo());
        taskForm.setCompleted(task.isCompleted());

        return taskForm;
    }
}
