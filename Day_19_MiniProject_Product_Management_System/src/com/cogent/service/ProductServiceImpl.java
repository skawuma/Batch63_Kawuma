package com.cogent.service;

import java.util.List;

import com.cogent.bean.ProductBean;
import com.congent.dao.ProductDao;
import com.congent.dao.ProductDaoImpl;

/**
 * @author samuelkawuma
 *Oct 14, 2022
 *10:56:27 AM
 */

public class ProductServiceImpl implements ProductService {
	ProductDao productdao = new ProductDaoImpl();

	@Override
	public void addProduct(ProductBean productbean) {
		productdao.addProduct(productbean);
		

	}

	@Override
	public void deleteProductById(Double pId) {
	
		productdao.deleteProductById(pId);

	}

	@Override
	public void deleteProductByCat(String pcat) {
	productdao.deleteProductByCat(pcat);

	}

	@Override
	public ProductBean findCheapestProductInCat() {
		
		return productdao.findCheapestProductInCat();
	}

	@Override
	public List<ProductBean> findProductByCat(String pcat) {
		
		return productdao.findProductByCat(pcat);
	}

	@Override
	public ProductBean findProductById(Double pId) {
		// TODO Auto-generated method stub
		return productdao.findProductById(pId);
	}

	@Override
	public List<ProductBean> findExpiredProducts() {
		// TODO Auto-generated method stub
		return  productdao.findExpiredProducts();
	}

	@Override
	public void updateProduct(ProductBean productbean) {
	     productdao.updateProduct(productbean);

	}

}

