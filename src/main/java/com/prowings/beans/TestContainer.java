package com.prowings.beans;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	
	public static void main(String[] args) {
		
		//instantiate container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s1 = (Student) ctx.getBean("std1");
		
		System.out.println(s1);
		
		
		Properties myProp = ctx.getBean("myConfiguration",Properties.class);
		
		System.out.println(myProp);
	}

}
