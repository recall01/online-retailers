package com.retailers.retailers.mapping;

import com.retailers.retailers.model.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapping {

    void saveTask(Task task);
}
