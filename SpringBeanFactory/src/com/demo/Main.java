package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {

		//Resource is Interface
		Resource resource = new ClassPathResource("bean.xml"); // ClassPathResource() is implementation class of Resource
        BeanFactory factory = new XmlBeanFactory(resource); // BeanFactory is interface & XmlBeanFactory() is implementation class of Resource
        Message message = (Message)factory.getBean("mybean"); // here Aggregation (Message message) is happening and is equal to object of mybean 
        System.out.println(message.getMessge());
	}

}