package com.lu.bean;

//Model层使用一个简单的Product用于存放数据
public class Product {
	 
    int id;
    String name;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
