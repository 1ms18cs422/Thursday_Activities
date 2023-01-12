package com.pmp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmp.entity.Product;
import com.pmp.service.ProductDaoImpl;


@RestController
public class ProductController {
	@Autowired
	ProductDaoImpl productDaoImpl;
	
	@PostMapping("/products")
	
	int saveProduct(@RequestBody Product product) 
	{
		productDaoImpl.insertProduct(product);
		return product.getProductId();
	}
	@DeleteMapping("/product/{productId}")
	void delProduct(@PathVariable("productId") int productId)
	{
		productDaoImpl.deleteProduct(productId);
	}
	
	@GetMapping("/product/{productId}")
	Product getProduct(@PathVariable("productId") int productId)
	{
		return productDaoImpl.getProductById(productId);
	}
	
	@PutMapping("/product/{productId}")
	void update(@RequestBody Product product,@PathVariable("productId") int productId)
	{
		productDaoImpl.updateProduct(product, productId);
	}

	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return productDaoImpl.getAllProducts();	
		}
}
