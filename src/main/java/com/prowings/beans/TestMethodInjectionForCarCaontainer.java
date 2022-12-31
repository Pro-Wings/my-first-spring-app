package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjectionForCarCaontainer {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("CarApplicationContext.xml");

		Car car1 = ctx.getBean("car", Car.class);

		Car car2 = ctx.getBean("car", Car.class);
		
		
		System.out.println(car1);

		System.out.println(car1 == car2);
		
		System.out.println(car1.getEngine() == car2.getEngine());
	
		System.out.println(car1.getEngine().getType());
	}
	

}
