package com.nt.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.nt.entity.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductInfo {
	
	  private String code;
	    private String name;
	    private double price;
	 
	    private boolean newProduct=false;
	 
	    // Upload file.
	    private CommonsMultipartFile fileData;
	 
	    public ProductInfo() {
	    }
	 
	    public ProductInfo(Product product) {
	        this.code = product.getCode();
	        this.name = product.getName();
	        this.price = product.getPrice();
	    }
	 
	    // Hibernate query.
	    public ProductInfo(String code, String name, double price) {
	        this.code = code;
	        this.name = name;
	        this.price = price;
	    }

}
