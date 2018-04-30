package com.Taskr.Taskrapi.controllers;
import com.Taskr.Taskrapi.services.UserService;
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
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = UserController.class)
public class UserControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private UserService userServiceMock;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void setUserToUserForm() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/edit/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void redirToList() throws Exception {

        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/list"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html;charset=UTF-8"))
                .andExpect(view().name("user/list"))
                .andExpect(MockMvcResultMatchers.view().name("user/list"))
                .andExpect(content().string(Matchers.containsString("User")))
                .andDo(print());
    }

    @Test
    public void edit() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/edit/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void newUser() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/signup/"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void saveOrUpdateUser() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/edit/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void delete() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/delete/"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void listUsers() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user/list"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html;charset=UTF-8"))
                .andExpect(view().name("user/list"))
                .andExpect(MockMvcResultMatchers.view().name("user/list"))
                .andExpect(content().string(Matchers.containsString("User")))
                .andDo(print());
    }

    @Test
    public void getUser() throws Exception {
        assertThat(this.userServiceMock).isNotNull();
        mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html;charset=UTF-8"))
                .andExpect(view().name("user/list"))
                .andExpect(MockMvcResultMatchers.view().name("user/list"))
                .andExpect(content().string(Matchers.containsString("User")))
                .andDo(print());
    }


}