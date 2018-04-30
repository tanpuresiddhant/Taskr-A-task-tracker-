package com.Taskr.Taskrapi.controllers;

import com.Taskr.Taskrapi.commands.TaskForm;
import com.Taskr.Taskrapi.converters.TaskToTaskForm;
import com.Taskr.Taskrapi.model.Task;
import com.Taskr.Taskrapi.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * This is controller for the task page.
 */
@Controller
public class TaskController {

    private TaskService taskService;

    private TaskToTaskForm taskToTaskForm;

    @Autowired
    public void setTaskToTaskForm(TaskToTaskForm taskToTaskForm) {
        this.taskToTaskForm = taskToTaskForm;
    }

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping("/task")
    public String redirToList() {
        return "redi    rect:/task/list";
    }

    //@RequestMapping(value = "/task/list", method = RequestMethod.GET)
    @RequestMapping("/task/list")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.listAll());
        return "task/list";
    }

    @RequestMapping("/task/show/id/{id}")
    public String getTask(@PathVariable String id, Model model) {
        model.addAttribute("task", taskService.getById(id));
        return "task/show";
    }

    @RequestMapping("/task/show/name/{name}")
    public String getTaskByName(@PathVariable String name, Model model) {
        model.addAttribute("tasks", taskService.getByName(name));
        return "task/list";
    }

    @RequestMapping("task/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        Task task = taskService.getById(id);
        TaskForm taskForm = taskToTaskForm.convert(task);

        model.addAttribute("taskForm", taskForm);
        return "task/taskform";
    }

    @RequestMapping("/task/new")
    public String newTask(Model model) {
        model.addAttribute("taskForm", new TaskForm());
        System.out.print("hello");
        return "task/taskform";
    }

    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public String saveOrUpdateTask(@Valid TaskForm taskForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "task/taskform";
        }

        Task savedTask = taskService.saveOrUpdateTaskForm(taskForm);

        return "redirect:/task/show/id/" + savedTask.getTaskId();
    }

    @RequestMapping("/task/delete/{id}")
    public String delete(@PathVariable String id) {
        taskService.delete(id);
        return "redirect:/task/list";
    }
}
