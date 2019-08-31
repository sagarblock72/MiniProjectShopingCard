package com.nt.dao;

import com.nt.entity.Product;
import com.nt.model.PaginationResult;
import com.nt.model.ProductInfo;

public interface ProductDAO {
	
public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);

}
