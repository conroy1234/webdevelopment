/*package com.groovy.com;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domgin.groovy.model.Customer;
import com.domgin.groovy.model.Order;
import com.domgin.groovy.model.Project;

@Controller
public class ProcessCustomerController {
	
	List<String> orders= new ArrayList<String>();
	Order order = new Order();
	
		
	
	public List<String> getOrders() {
		order.setPrice(200);
		order.setItem("shoes");
		order.setQuantity(2);
		orders.add("Order detail:");
		orders.add("Item: "+order.getItem());
		orders.add("Price: "+order.getPrice());		
		orders.add("Quantity: "+order.getQuantity());
		
		return orders;
	}


	public void setOrders(List<String> orders) {
		this.orders = orders;
	}




	public Order getOrder() {
		return order;
	}




	public void setOrder(Order order) {
		this.order = order;
	}




@RequestMapping(value="form", params="customerDetails", method=RequestMethod.POST)
	public String process(Model model,@ModelAttribute("customer") Customer customer,Order order) {
		 
	
		model.addAttribute("customer", new Customer());
		model.addAttribute("orders", new Order());
		model.addAttribute("firstName", customer.getFirstName());
		model.addAttribute("lastName", customer.getLastName());
		model.addAttribute("address", customer.getAddress());
		model.addAttribute("number", customer.getNumber());
		
	return "form/customer";	
	}
	

	@RequestMapping(value="customer", params="LoginForm", method=RequestMethod.POST)
	public String customer(Model model, @ModelAttribute("customer") Customer customer){
		model.addAttribute("customer", new Customer());
		model.addAttribute("name", customer.getName());
		model.addAttribute("number", customer.getNumber());
		model.addAttribute("address", customer.getAddress());
		return "form/customer";
	}


	@RequestMapping(value="order", params="orderDetails", method=RequestMethod.POST)
	public String order(Model model,@ModelAttribute("order")Order order){
		 
		model.addAttribute("order", new Order());
		model.addAttribute("item", order.getItem());
		model.addAttribute("price",order.getPrice());
		model.addAttribute("quantity",order.getQuantity());		
			
		
	return "form/orders";	
	}
	
	
	
	
	@RequestMapping(value="form", params="projectDetails", method=RequestMethod.POST)
	public String project(Model model,@ModelAttribute("project") Project project) {
		 
	
		model.addAttribute("project", new Project());		
		model.addAttribute("projectName", project.getProjectName() );	
		
	return "form/customer";	
	}
	
}
*/