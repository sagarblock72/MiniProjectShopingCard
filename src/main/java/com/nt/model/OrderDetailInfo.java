package com.nt.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailInfo {
	
	private String id;
	 
    private String productCode;
    private String productName;
 
    private int quanity;
    private double price;
    private double amount;
 
    public OrderDetailInfo() {
 
    }
    
    public OrderDetailInfo(String id, String productCode, //
    		String productName, int quanity, double price, double amount) {
   this.id = id;
   this.productCode = productCode;
   this.productName = productName;
   this.quanity = quanity;
   this.price = price;
   this.amount = amount;
}

}
