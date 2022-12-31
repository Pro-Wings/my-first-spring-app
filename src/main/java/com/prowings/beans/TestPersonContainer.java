package com.prowings.beans;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonContainer {
	
	public static void main(String[] args) {
		
		//instantiate container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("PersonApplicationContext.xml");
		
		Person p1 = ctx.getBean("person", Person.class);
		Person p2 = ctx.getBean("person", Person.class);
		
		System.out.println(p1 == p2);
		System.out.println(p1.dept == p2.dept);
		
		System.out.println(p1);
	}

}
