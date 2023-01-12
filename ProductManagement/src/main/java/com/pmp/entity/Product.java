package com.pmp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int productId;
	@Column
	String productName;
	@Column
	double productCost;
	

}
