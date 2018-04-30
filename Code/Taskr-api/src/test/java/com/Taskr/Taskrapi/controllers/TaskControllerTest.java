package com.Taskr.Taskrapi.controllers;

import com.Taskr.Taskrapi.services.TaskService;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = TaskController.class)
public class TaskControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private TaskService userServiceMock;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void setTaskToTaskForm() throws Exception {

    }

    @Test
    public void setTaskService() throws Exception {
    }

    @Test
    public void redirToList() throws Exception {
    }

    @Test
    public void listTasks() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/list"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html;charset=UTF-8"))
                .andExpect(view().name("task/list"))
                .andExpect(MockMvcResultMatchers.view().name("task/list"))
                .andExpect(content().string(Matchers.containsString("Task")))
                .andDo(print());
    }

    @Test
    public void getTask() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/show/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void getTaskByName() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/show/name/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void edit() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/edit/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void newTask() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/new"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void saveOrUpdateTask() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/edit/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void delete() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/task/delete/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

}