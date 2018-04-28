package com.Taskr.Taskrapi.model;

import java.util.Date;

public class Task {
    private int taskId;
    private String taskName;
    private String taskDescription;
    private String taskNotes;
    private int taskPriority;
    private Date taskCreatedDate;
    private Date taskCompletedDate;
    private Date taskCompletionDate;
    private int taskStatus;
    private int taskCreatedby;
    private int taskAssignedTo;
    private boolean completed;


    @Override
    public String toString() {
        return "Task{" +

                "taskId=" + taskId +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskNotes='" + taskNotes + '\'' +
                ", taskPriority=" + taskPriority +
                ", taskCreatedDate=" + taskCreatedDate +
                ", taskCompletedDate=" + taskCompletedDate +
                ", taskChangedDate=" + taskCompletionDate +
                ", taskStatus=" + taskStatus +
                ", taskCreatedby=" + taskCreatedby +
                ", taskAssignedTo=" + taskAssignedTo +
                '}';
    }


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
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

    public void setTaskCompletionDate(Date taskChangedDate) {
        this.taskCompletionDate = taskChangedDate;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskCreatedby() {
        return taskCreatedby;
    }

    public void setTaskCreatedby(int taskCreatedby) {
        this.taskCreatedby = taskCreatedby;
    }

    public int getTaskAssignedTo() {

        return taskAssignedTo;
    }

    public void setTaskAssignedTo(int taskAssignedTo) {
        this.taskAssignedTo = taskAssignedTo;
    }
}
