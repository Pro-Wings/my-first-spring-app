package com.prowings.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(MyConfig.class);
		ctx.refresh();
		
		Employee emp = ctx.getBean("emp1",Employee.class);
		ctx.close();
		
		System.out.println(emp);
	}

}
