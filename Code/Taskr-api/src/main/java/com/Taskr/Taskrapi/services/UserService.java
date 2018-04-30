package com.Taskr.Taskrapi.services;


import com.Taskr.Taskrapi.commands.UserForm;
import com.Taskr.Taskrapi.model.User;

import java.util.List;
/**
 * Interface to create user service which contains standard method.
 */
public interface UserService {

    List<User> listAll();

    User getById(String id);

    User saveOrUpdate(User task);

    void delete(String id);

    User saveOrUpdateUserForm(UserForm taskForm);
}

