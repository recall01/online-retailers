package com.retailers.retailers.service;

import com.retailers.retailers.mapping.OrderMapping;
import com.retailers.retailers.mapping.TaskMapping;
import com.retailers.retailers.model.Order;
import com.retailers.retailers.model.Task;
import com.retailers.retailers.util.GUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author PC
 * @data 2020/5/5
 */
@Service
public class OrderService {

    @Resource
    private OrderMapping orderMapping;

    public String createOrder(Order order) {
        String guid = GUIDUtils.getGuid();
        order.setOrderId(guid);
        orderMapping.saveOrder(order);
        return guid;
    }
}
