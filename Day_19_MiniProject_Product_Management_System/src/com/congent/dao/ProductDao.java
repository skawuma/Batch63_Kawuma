package com.congent.dao;

import java.util.List;

import com.cogent.bean.ProductBean;

/**
 * @author samuelkawuma
 *Oct 14, 2022
 *10:14:09 AM
 */

public interface ProductDao {
	
	public void addProduct(ProductBean productbean);
	public void deleteProductById(Double pId);
	public void deleteProductByCat(String pcat);
	public ProductBean findCheapestProductInCat();
	public List <ProductBean >findProductByCat(String pcat);
	public ProductBean findProductById(Double pId);
	public  List<ProductBean>findExpiredProducts();
	public void updateProduct(ProductBean productbean);
	
	

}

