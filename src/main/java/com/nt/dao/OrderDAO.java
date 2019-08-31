package com.nt.dao;

import java.util.List;

import com.nt.model.CartInfo;
import com.nt.model.OrderDetailInfo;
import com.nt.model.OrderInfo;
import com.nt.model.PaginationResult;

public interface OrderDAO {
	
	 public void saveOrder(CartInfo cartInfo);
	 
	    public PaginationResult<OrderInfo> listOrderInfo(int page,
	            int maxResult, int maxNavigationPage);
	    
	    public OrderInfo getOrderInfo(String orderId);
	    
	    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
