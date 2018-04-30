package com.Taskr.Taskrapi.controllers;


import com.Taskr.Taskrapi.commands.UserForm;
import com.Taskr.Taskrapi.converters.UserToUserForm;
import com.Taskr.Taskrapi.model.User;
import com.Taskr.Taskrapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
/**
 * This is a controller for the user page.
 */
@Controller
public class UserController {
    private UserService userService;

    private UserToUserForm userToUserForm;

    @Autowired
    public void setUserToUserForm(UserToUserForm userToUserForm) {
        this.userToUserForm = userToUserForm;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String redirToList() {
        return "redirect:/user/list";
    }

    //@RequestMapping(value = "/user/list", method = RequestMethod.GET)
    @RequestMapping({"/user/list", "/user"})
    public String listUsers(Model model) {
        model.addAttribute("Users", userService.listAll());
        return "user/list";
    }

    @RequestMapping("/user/show/{id}")
    public String getUser(@PathVariable String id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "user/show";
    }

    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        User user = userService.getById(id);
        UserForm userForm = userToUserForm.convert(user);

        model.addAttribute("userForm", userForm);
        return "user/signup";
    }

    @RequestMapping("/user/signup")
    public String newUser(Model model) {
        model.addAttribute("userForm", new UserForm());
        System.out.print("hello");
        return "user/signup";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String saveOrUpdateUser(@Valid UserForm userForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "user/signup";
        }

        User savedUser = userService.saveOrUpdateUserForm(userForm);

        return "redirect:/user/show/" + savedUser.getUserId();
    }

    @RequestMapping("/user/delete/{id}")
    public String delete(@PathVariable String id) {
        userService.delete(id);
        return "redirect:/user/list";
    }
}