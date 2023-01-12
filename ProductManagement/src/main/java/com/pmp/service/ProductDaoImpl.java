package com.pmp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmp.entity.Product;
import com.pmp.repository.ProductRepository;
@Service
public class ProductDaoImpl implements ProductDao{
	@Autowired
	ProductRepository productRepo;

	
	public Product insertProduct(Product p) {
		
		return  productRepo.save(p);
	}
	public void deleteProduct(int id) {
		 productRepo.deleteById(id);
		
	}


	public void updateProduct(Product params, int id) {
		Product p= productRepo.findById(id).get();
		p.setProductName(params.getProductName());
		p.setProductCost(params.getProductCost());
		 productRepo.save(p);
	}

	public Product getProductById(int id) {
		
		return  productRepo.findById(id).get();
	}
	
	public List<Product> getAllProducts() {
		
		return  productRepo.findAll();
	}

}
