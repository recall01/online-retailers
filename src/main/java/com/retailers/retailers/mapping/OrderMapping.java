package com.retailers.retailers.mapping;

import com.retailers.retailers.model.Order;
import com.retailers.retailers.model.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapping {

    void saveOrder(Order order);
}
