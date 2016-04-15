package com.groovy.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domgin.groovy.constants.IConstants;
import com.domgin.groovy.model.Customer;
import com.domgin.groovy.model.Login;


@Controller
public class HomeController implements IConstants{
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public String home(Model model,@ModelAttribute("customer") Customer customer){
		
		model.addAttribute("customer", new Customer());
		return "form/customer";	
	}
	
	@RequestMapping(value="customer", params="LoginForm", method=RequestMethod.POST)
	public String customer(Model model,@ModelAttribute("customer") Customer customer){
		
		model.addAttribute("customer", new Customer());
		model.addAttribute("message", welcome_message);
	return "form/customer";	
	}
	
	@RequestMapping(value="/customerLogin", method=RequestMethod.POST)
	public String login(Model model,@ModelAttribute("login") Login login){
		
		model.addAttribute("login", new Login());
		model.addAttribute("username",login.getUsername());
		model.addAttribute("username",login.getPassword());
		
		if(login.getUsername()!="conroy123" && login.getPassword()!="security"){
			return "home";
		}else
		
	return "form/login";	
	}
}
