package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanCustomLifeCycle {
	
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("CustomBeanLifeCycleApplicationContext.xml");

		Vehicle v1 = ctx.getBean("vehicle", Vehicle.class);
		
		System.out.println(v1);
		
		ctx.close();
		
	}

}
