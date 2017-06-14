package com.lu.action;

import com.lu.bean.Product;

public class ProductAction {
    private Product product;
 
    public String show() {
        product = new Product(); //准备数据
        product.setName("iphone7");
        return "show";
    }
    
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
}
