package com.retailers.retailers.controller;

import com.retailers.retailers.model.Result;
import com.retailers.retailers.model.Task;
import com.retailers.retailers.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PC
 * @data 2020/5/5
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    /**
     * 新增任务
     * **/
    @PostMapping("task")
    public Result createTask(@RequestBody Task task){
        return new Result(taskService.createTask(task));
    }



}
