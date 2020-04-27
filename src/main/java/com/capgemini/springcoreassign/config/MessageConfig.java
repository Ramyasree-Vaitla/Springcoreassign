package com.capgemini.springcoreassign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.capgemini.sprigcoreassign.bean.MessageBean;
import com.capgemini.sprigcoreassign.bean.UserBean;

public class MessageConfig {
	

	@Bean
	public MessageBean getMessageBean() {
		
		MessageBean messagebean = new MessageBean();
		messagebean.setId(102);
		
		return messagebean;
	}
	
	@Bean
	public UserBean getUserBean() {
		
		UserBean userbean = new UserBean();
		userbean.setId(101);
		userbean.setName("Ramyasree");
		return userbean;
		
	}
	
	@Bean
	@Primary
	public UserBean getUserBean1() {
		
		UserBean userbean1 = new UserBean();
		userbean1.setId(10);
		userbean1.setName("chinnarii");
		return userbean1;
		
	}


}


