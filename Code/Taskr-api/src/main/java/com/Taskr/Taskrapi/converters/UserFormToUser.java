package com.Taskr.Taskrapi.converters;

import com.Taskr.Taskrapi.commands.UserForm;
import com.Taskr.Taskrapi.model.User;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


/**
 * This class is for converting User Form to User for storing it into repository
 * and generating model view.
 */
@Component
public class UserFormToUser implements Converter<UserForm, User> {

    @Override
    public User convert(UserForm userForm) {
        User user = new User();
        if (userForm.getUserId() != null && !StringUtils.isEmpty(userForm.getUserId())) {
            user.setUserId(new ObjectId(userForm.getUserId()));
        }
        user.setFirstName(userForm.getFirstName());

        user.setLastName(userForm.getLastName());
        user.setEmail(userForm.getEmail());

        return user;
    }
}
