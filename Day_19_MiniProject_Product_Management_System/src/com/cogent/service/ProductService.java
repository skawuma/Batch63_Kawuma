package com.cogent.service;

import java.util.List;

import com.cogent.bean.ProductBean;

/**
 * @author samuelkawuma
 *Oct 14, 2022
 *10:48:56 AM
 */

public interface ProductService {
	public void addProduct(ProductBean productbean);
	public void deleteProductById(Double pId);
	public void deleteProductByCat(String pcat);
	public ProductBean findCheapestProductInCat();
	public List <ProductBean >findProductByCat(String pcat);
	public ProductBean findProductById(Double pId);
	public  List<ProductBean>findExpiredProducts();
	public void updateProduct(ProductBean productbean);
	

}

