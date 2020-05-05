package com.retailers.retailers.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author PC
 * @data 2020/5/5
 */
@Getter
@Setter
public class Task {

    private String taskId;
    private String taskName;
    private String taskDescribe;
    private String salary;
    private int number;
    private String image;
    private String startTime;
    private String endTime;
    private int orgId;
    private String storTime;
}
