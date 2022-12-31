package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorAmbiguityTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ConstructorAmbiguityApplicationContext.xml");

		ConstructorAmbiguity obj = ctx.getBean("obj",ConstructorAmbiguity.class);
		
		
		
	}

}
