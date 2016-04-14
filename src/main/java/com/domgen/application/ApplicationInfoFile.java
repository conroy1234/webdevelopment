package com.domgen.application;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("Session")
public interface ApplicationInfoFile {

	String welcome_display="SPRING APPLICATION CONFIGERATION";
	String name="thes is the begining of my spring project";
	String welcome_messahe="WELCOME TO SPRING MVC THIS IS BEGINING OF MY LEARNING";
	String forward_to_index_page="index";

	
}
