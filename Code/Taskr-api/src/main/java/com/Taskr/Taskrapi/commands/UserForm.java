package com.Taskr.Taskrapi.commands;

/**
 * This class is for creating user form from the user.
 * It helps to generate the model view of users.
 */
public class UserForm {

    private String userId;
    private String firstName;
    private String lastName;

    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
