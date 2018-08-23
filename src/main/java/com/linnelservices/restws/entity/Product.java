package com.linnelservices.restws.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
public class Product {

	private Long id;
	
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
