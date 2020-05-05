package com.retailers.retailers.combination;

/**
 * @author PC
 * @data 2020/5/4
 */
public abstract class Corp {
    private int id;
    private String position;
    public Corp(int id,String position){
        this.position=position;
        this.id=id;
    }
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("职位:").append(position);
        return sb.toString();
    }
    public int getId(){
        return id;
    }
}
