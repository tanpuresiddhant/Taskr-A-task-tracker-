package com.Taskr.Taskrapi.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is to create task objects.
 */
@Document
public class Task {

    @Id
    private ObjectId taskId;
    private String taskName;
    private String taskDescription;
    private String taskNotes;
    private int taskPriority;
    private Date taskCreatedDate;
    private Date taskCompletedDate;
    private Date taskCompletionDate;
    private int taskStatus;
    private String taskCreatedBy;
    private String taskAssignedTo;
    private boolean completed;


    public Task() {
        //Default empty constructor
    }

    public ObjectId getTaskId() {
        return taskId;
    }

    public void setTaskId(ObjectId taskId) {
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

    public String getTaskCreatedDateFormat() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        String reportDate = df.format(taskCreatedDate);

        // Print what date is today!
        //System.out.println("Report Date: " + reportDate);
        return reportDate;
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

    public String getTaskCreatedBy() {


        return taskCreatedBy;
    }

    public void setTaskCreatedBy(String taskCreatedBy) {
        this.taskCreatedBy = taskCreatedBy;
    }

    public String getTaskAssignedTo() {
        return taskAssignedTo;
    }

    public void setTaskAssignedTo(String taskAssignedTo) {
        this.taskAssignedTo = taskAssignedTo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
