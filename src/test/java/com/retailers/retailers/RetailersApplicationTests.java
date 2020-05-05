package com.retailers.retailers;

import com.retailers.retailers.controller.TaskController;
import com.retailers.retailers.model.Task;
import com.retailers.retailers.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RetailersApplicationTests {

    @Autowired
    TaskController taskController;

    @Test
    public void createTask() {
        Task task = new Task();
        task.setTaskName("169全家不限量");
        task.setTaskDescribe("168=30/月");
        task.setSalary("10");
//        task.setNumber(100);
//        task.setImage("1111");
//        task.setStartTime("2020-05-05 17:40:00");
//        task.setEndTime("2020-05-05 18:40:00");
        task.setOrgId(1);
        System.out.println(taskController.createTask(task));
    }
}
