//package com.Taskr.Taskrapi.services;
//
//import com.Taskr.Taskrapi.controllers.TaskController;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.Assert.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(TaskController.class)
//public class TaskServiceImplTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private TaskService taskService;
//
//
//    @Test
//    public void listAllServiceTest() throws Exception {
//        when(taskService.listAll()).thenReturn("Hello Mock");
//        this.mockMvc.perform(get("/task/list")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello Mock")));
//    }
//}