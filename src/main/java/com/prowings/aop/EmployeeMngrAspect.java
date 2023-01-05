package com.prowings.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeMngrAspect {

//	@AfterReturning("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog()
//	{
//		System.out.println("logging information : after returning------------");
//	}
//
//	@Before("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog2()
//	{
//		System.out.println("logging information : Before------------");
//	}
//
//	@AfterThrowing("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog3()
//	{
//		System.out.println("logging information : AfterThrowing------------");
//	}
//
//	@After("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog4()
//	{
//		System.out.println("logging information : After------------");
//	}

	@Around("execution(* EmployeeManager.getEmployeeById(..))")
	public void doLog5(ProceedingJoinPoint pjp) throws Throwable
	{
		int i = (Integer) pjp.getArgs()[0];
		System.out.println("logging information : call to getEmpById with : "+i);
		pjp.proceed();
		System.out.println(">>>>>>"+i);
		System.out.println("logging information : Employee fetched from DB with id : "+i);
		
		
	}

}
