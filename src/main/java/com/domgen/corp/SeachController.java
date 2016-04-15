package com.domgen.corp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domgen.constants.ApplicationInfoFile;

@Controller
public class SeachController implements ApplicationInfoFile{
	@RequestMapping(value = "lookup", params="items",method = RequestMethod.POST)
	
	public String search( Model model){
		
		model.addAttribute("search", googleSearch);
		
		return "form/search";
	}
}
