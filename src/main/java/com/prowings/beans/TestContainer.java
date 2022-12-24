package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	
	public static void main(String[] args) {
		
		//instantiate container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s1 = (Student) ctx.getBean("std1");
		
		System.out.println(s1);

		Student s2= (Student) ctx.getBean("std2");
		
		System.out.println(s2);

	}

}
