package com.prowings.qualifier_demo;

import org.springframework.stereotype.Component;

@Component
public class English implements Subject{

	public void printSubjectInfo() {
		
		System.out.println("This is English!!!");
		
	}

}
