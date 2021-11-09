package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

	// use ctrl+space for suggestion of the word below
	ApplicationContext	context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Message mes = (Message)context.getBean("myappbean");
	
	mes.show();
	}

}