package com.retailers.retailers.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PC
 * @data 2020/5/4
 */
public class Branch extends Corp {
    List<Corp> subordinateList = new ArrayList<>();
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }
    public void addSubordinate(Corp corp){
        this.subordinateList.add(corp);
    }
    public List<Corp> getSubordinateList(){
        return this.subordinateList;
    }
}
