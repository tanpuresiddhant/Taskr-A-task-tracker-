package com.Taskr.Taskrapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }
}
