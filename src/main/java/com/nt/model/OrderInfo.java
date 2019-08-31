package com.nt.model;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderInfo {
	
	    private String id;
	    private Date orderDate;
	    private int orderNum;
	    private double amount;
	 
	    private String customerName;
	    private String customerAddress;
	    private String customerEmail;
	    private String customerPhone;
	 
	    private List<OrderDetailInfo> details;
	    
	    public OrderInfo() {
	    	 
	    }
	 
	    // Using for Hibernate Query.
	    public OrderInfo(String id, Date orderDate, int orderNum, //
	            double amount, String customerName, String customerAddress, //
	            String customerEmail, String customerPhone) {
	        this.id = id;
	        this.orderDate = orderDate;
	        this.orderNum = orderNum;
	        this.amount = amount;
	 
	        this.customerName = customerName;
	        this.customerAddress = customerAddress;
	        this.customerEmail = customerEmail;
	        this.customerPhone = customerPhone;
	    }

}
