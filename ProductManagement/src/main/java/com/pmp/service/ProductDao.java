package com.pmp.service;

import java.util.List;

import com.pmp.entity.Product;

public interface ProductDao {
	Product insertProduct(Product p);
	void deleteProduct(int id);
	void updateProduct(Product p,int id);
	Product getProductById(int id);
	List<Product> getAllProducts();
	

}
