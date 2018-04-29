package com.Taskr.Taskrapi.converters;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.Taskr.Taskrapi.model.Task;
import com.Taskr.Taskrapi.commands.TaskForm;

@Component
public class TaskFormToTask implements Converter<TaskForm, Task> {

    @Override
    public Task convert(TaskForm taskForm){
        Task task = new Task();
        if (taskForm.getTaskId() != null  && !StringUtils.isEmpty(taskForm.getTaskId())) {
            task.setTaskId(new ObjectId(taskForm.getTaskId()));
        }
        task.setTaskName(taskForm.getTaskName());
        task.setTaskDescription(taskForm.getTaskDescription());
        task.setTaskNotes(taskForm.getTaskNotes());
        task.setTaskPriority(taskForm.getTaskPriority());
        task.setTaskCreatedDate(taskForm.getTaskCreatedDate());
        task.setTaskCompletedDate(taskForm.getTaskCompletedDate());
        task.setTaskCompletionDate(taskForm.getTaskCompletionDate());
        task.setTaskStatus(taskForm.getTaskStatus());
        task.setTaskCreatedBy(taskForm.getTaskCreatedBy());
        task.setTaskAssignedTo(taskForm.getTaskAssignedTo());
        task.setCompleted(taskForm.isCompleted());

        return task;
    }
}
