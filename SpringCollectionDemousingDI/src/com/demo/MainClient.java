package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		
		
		JavaCollection collec1= (JavaCollection)con.getBean("collectiondemo");
		
		
		System.out.println(collec1.getAddressList());
		
		System.out.println(collec1.getAddressMap());
		
		System.out.println(collec1.getAddressSet());
		
		System.out.println(collec1.getAddressproperties());
		
		

	}

}