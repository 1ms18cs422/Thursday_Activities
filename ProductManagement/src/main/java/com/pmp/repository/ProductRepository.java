package com.pmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmp.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>

{

}
