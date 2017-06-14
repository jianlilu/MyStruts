package com.lu.action;

import com.lu.bean.Product;

public class ProductAction {
    private Product p;
 
    public String show() {
        p = new Product(); //准备数据
        p.setName("iphone7");
        return "show";
    }
    public String add(){
        System.out.println("product.name:"+p.getName());
        System.out.println("product.color:"+p.getColor());
        return "show";
    }
    
    public Product getProduct() {
        return p;
    }
 
    public void setProduct(Product product) {
        this.p = product;
    }
}
