package com.retailers.retailers.combination;

/**
 * @author PC
 * @data 2020/5/4
 */
public abstract class Corp {
    private String name;
    private String position;
    private int salary;
    public Corp(String name,String position,int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("姓名:").append(name)
                .append("职位:").append(position)
                .append("薪资:").append(salary);
        return sb.toString();
    }
}
