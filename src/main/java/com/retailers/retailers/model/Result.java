package com.retailers.retailers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author PC
 * @data 2020/5/5
 */
@Getter
@AllArgsConstructor
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result() {
        this(200,"success",null);
    }

    public Result(T data) {
        this(200,"success",data);
    }
}
