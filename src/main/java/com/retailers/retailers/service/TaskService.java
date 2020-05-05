package com.retailers.retailers.service;

import com.retailers.retailers.combination.Client;
import com.retailers.retailers.combination.Corp;
import com.retailers.retailers.mapping.OrganizationMapping;
import com.retailers.retailers.mapping.TaskMapping;
import com.retailers.retailers.model.Organization;
import com.retailers.retailers.model.Task;
import com.retailers.retailers.util.GUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author PC
 * @data 2020/5/5
 */
@Service
public class TaskService {

    @Resource
    private TaskMapping taskMapping;

    public String createTask(Task task) {
        String guid = GUIDUtils.getGuid();
        task.setTaskId(guid);
        taskMapping.saveTask(task);
        return guid;
    }
}
