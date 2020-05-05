package com.retailers.retailers.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author PC
 * @data 2020/5/5
 */
@Getter
@Setter
public class Organization {

    private int id;
    private String name;
    private int isLeaf;
    private int father;

}
