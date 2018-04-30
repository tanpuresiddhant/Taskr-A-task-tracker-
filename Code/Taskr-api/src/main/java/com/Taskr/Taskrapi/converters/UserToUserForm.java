package com.Taskr.Taskrapi.converters;


import com.Taskr.Taskrapi.commands.UserForm;
import com.Taskr.Taskrapi.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * This class is for converting user to user form for storing it into repository
 * and generating model view.
 */
@Component
public class UserToUserForm implements Converter<User, UserForm> {
    @Override
    public UserForm convert(User user) {
        UserForm userForm = new UserForm();
        userForm.setUserId(user.getUserId().toHexString());
        userForm.setFirstName(user.getFirstName());

        userForm.setLastName(user.getLastName());
        userForm.setEmail(user.getEmail());

        return userForm;
    }
}

