package com.lu.bean;

//Model层使用一个简单的Product用于存放数据
public class Product {
	 
    int id;
    String name;
    String color;
    
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    
}
