package com.Taskr.Taskrapi.services;

import com.Taskr.Taskrapi.commands.UserForm;
import com.Taskr.Taskrapi.converters.UserFormToUser;
import com.Taskr.Taskrapi.model.User;
import com.Taskr.Taskrapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * To create user service implementation from user service interface which contains standard user related methods.
 */
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserFormToUser userFormToUser;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserFormToUser userFormToUser) {
        this.userRepository = userRepository;
        this.userFormToUser = userFormToUser;
    }

    @Override
    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User getById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User saveOrUpdate(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User saveOrUpdateUserForm(UserForm userForm) {
        User savedUser = saveOrUpdate(userFormToUser.convert(userForm));
        System.out.println("Saved user Id: " + savedUser.getUserId());
        return savedUser;
    }
}

