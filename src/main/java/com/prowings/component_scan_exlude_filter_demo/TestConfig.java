package com.prowings.component_scan_exlude_filter_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.prowings.exclude.D;

@Configuration
@ComponentScan(basePackages =  "com.prowings",
excludeFilters =  @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.prowings.exclude.*"))
public class TestConfig {

	public static void main(String[] args) {
		
		System.out.println("inside main of Cofig");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TestConfig.class);
		ctx.refresh();
		
	}
	
}
