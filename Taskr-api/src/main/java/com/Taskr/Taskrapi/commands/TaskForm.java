package com.Taskr.Taskrapi.commands;

import java.util.Date;

public class TaskForm {
    private String taskId;
    private String taskName;
    private String taskDescription;
    private String taskNotes;
    private int taskPriority;
    private Date taskCreatedDate;
    private Date taskCompletedDate;
    private Date taskCompletionDate;
    private int taskStatus;
    private int taskCreatedBy;
    private int taskAssignedTo;
    private boolean completed;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskNotes() {
        return taskNotes;
    }

    public void setTaskNotes(String taskNotes) {
        this.taskNotes = taskNotes;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Date getTaskCreatedDate() {
        return taskCreatedDate;
    }

    public void setTaskCreatedDate(Date taskCreatedDate) {
        this.taskCreatedDate = taskCreatedDate;
    }

    public Date getTaskCompletedDate() {
        return taskCompletedDate;
    }

    public void setTaskCompletedDate(Date taskCompletedDate) {
        this.taskCompletedDate = taskCompletedDate;
    }

    public Date getTaskCompletionDate() {
        return taskCompletionDate;
    }

    public void setTaskCompletionDate(Date taskCompletionDate) {
        this.taskCompletionDate = taskCompletionDate;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskCreatedBy() {
        return taskCreatedBy;
    }

    public void setTaskCreatedBy(int taskCreatedBy) {
        this.taskCreatedBy = taskCreatedBy;
    }

    public int getTaskAssignedTo() {
        return taskAssignedTo;
    }

    public void setTaskAssignedTo(int taskAssignedTo) {
        this.taskAssignedTo = taskAssignedTo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

