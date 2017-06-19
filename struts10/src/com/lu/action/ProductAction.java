package com.lu.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.lu.bean.Product;
import com.opensymphony.xwork2.ActionContext;

public class ProductAction {
    private Product product;
 
    public String show() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
 
        System.out.println("request:\t" + request);
        System.out.println("response:\t" + response);
 
        product = new Product();
        product.setName("iphone7");
        return "show";
    }
 
    public String add() {
 
        Map m = ActionContext.getContext().getSession();
        m.put("name", product.getName());
        return "show";
    }
//    public String add(){
//        System.out.println("product.name:"+p.getName());
//        System.out.println("product.color:"+p.getColor());
//        return "show";
//    }
    
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
}
