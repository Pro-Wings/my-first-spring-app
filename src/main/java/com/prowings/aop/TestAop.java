package com.prowings.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AopConfig.class);
		ctx.refresh();
		
		EmployeeManager emr = ctx.getBean(EmployeeManager.class);
		
		emr.getEmployeeById(102);
		
	}

}
