package com.linnelservices.restws.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

import com.linnelservices.restws.entity.Product;


@Path("/productservice")
public interface ProductService {

	@PreAuthorize("isAuthenticated()")// Method Level Security
	@Secured("ROLE_USER")
	@GET
	@Path("/products")
	public abstract List<Product> getProducts();
	
	@PreAuthorize("isAuthenticated()")// Method Level Security
	@Secured("ROLE_ADMIN")
	@POST
	@Path("/products")
	long addProduct(Product product);
}
