package com.Taskr.Taskrapi;
import static org.assertj.core.api.Assertions.assertThat;

import com.Taskr.Taskrapi.controllers.TaskController;
import com.Taskr.Taskrapi.controllers.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private TaskController controller;

    @Autowired
    private UserController controller1;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void contexLoads1() throws Exception {
        assertThat(controller1).isNotNull();
    }
}
