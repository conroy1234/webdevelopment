package com.domgen.dto;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.inject.Scope;

public class Product {

@Named	
private String name;
private String price;
private String discription;

	public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getDiscription() {
	return discription;
}

public void setDiscription(String discription) {
	this.discription = discription;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}