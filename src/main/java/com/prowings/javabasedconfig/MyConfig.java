package com.prowings.javabasedconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.prowings.javabasedconfig")
public class MyConfig {
	
	@Bean(name = "emp1")
	public Employee getEmployee1()
	{
		return new Employee(10, "Ram");
	}

	@Bean
	public Employee getEmployee2()
	{
		return new Employee(20, "Sham");
	}

}
