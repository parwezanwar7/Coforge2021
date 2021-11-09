package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");// applicationContext is my resource
// this line will create an object of message internally by ioc
		Message mes = (Message) context.getBean("annotationbasedapp");

		mes.show();

	}

}