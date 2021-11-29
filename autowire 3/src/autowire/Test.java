package autowire;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Message emp1=context.getBean("emp1",Message.class);
		System.out.println(emp1);
		// TODO Auto-generated method stub

	}

}
