package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfigContext {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationConfigApplicationContext2.xml");

		Animal a1 = ctx.getBean("animal", Animal.class);
		
		System.out.println(a1);
		
		ctx.close();
		
		
		
	}

}
