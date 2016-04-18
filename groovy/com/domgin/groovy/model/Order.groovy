package com.domgin.groovy.model

import com.domgin.groovy.constants.IJavaInterface

class Order extends Customer implements IJavaInterface{
	String item
	int quantity;
	double price;	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
