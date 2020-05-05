package com.retailers.retailers.controller;

import com.retailers.retailers.model.Order;
import com.retailers.retailers.model.Result;
import com.retailers.retailers.model.Task;
import com.retailers.retailers.service.OrderService;
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
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 完成任务,生成订单详情
     * **/
    @PostMapping("order")
    public Result createOrder(@RequestBody Order order){
        return new Result(orderService.createOrder(order));
    }
    


}
