package com.linnelservices.restws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.linnelservices.restws.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	List<Product> products = new ArrayList<Product>();
	
	private long productId = 123;
	
	public ProductServiceImpl(){
		
		Product product = new Product();
		product.setId(++productId);
		product.setDescription("Java Web Service Course!");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public long addProduct(Product product) {
		
		product.setId(++productId);
		products.add(product);
		
		return productId;
	}

}
