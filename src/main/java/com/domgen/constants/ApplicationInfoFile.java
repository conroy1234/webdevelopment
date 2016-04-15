package com.domgen.constants;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("Session")
public interface ApplicationInfoFile {

	String welcome_display="Welcom to my website thank you for visiting!<br/>";
	String name="thes is the begining of my spring project";
	String welcome_messahe="Welcom to my website thank you for visiting!<br/>";
	String forward_to_index_page="index";
	String age="38";
	String googleSearch="https://www.google.co.uk";

	
}
