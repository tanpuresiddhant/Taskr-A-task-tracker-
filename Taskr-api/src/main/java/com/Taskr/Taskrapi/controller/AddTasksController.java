package com.Taskr.Taskrapi.controller;
import java.util.ArrayList;
import java.util.List;

import com.Taskr.Taskrapi.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/tasks")
public class AddTasksController {

    List<Task> task = new ArrayList<Task>();

    @GetMapping(value = "/all")
    public List<Task> getResource(){
        return task;
    }

    @PostMapping(value="/save")
    public String postTasks(@RequestBody List<Task> tasks){
        task.addAll(tasks);
        return "Post Successfully!";
    }
}
