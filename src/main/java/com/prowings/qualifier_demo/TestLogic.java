package com.prowings.qualifier_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLogic {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(StudentConfig.class);
		
		ctx.refresh();
		
		Student s1 = ctx.getBean(Student.class);
		
		s1.getSubject().printSubjectInfo();
		
		System.out.println(s1);
		
		DbProps prop = ctx.getBean(DbProps.class);
		
		System.out.println(prop);
	}

}
