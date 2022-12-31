package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnimalCatagory {
	@Value("dogs")
	String catagoryName;

	public AnimalCatagory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalCatagory(String catagoryName) {
		super();
		this.catagoryName = catagoryName;
	}

	public String getCatagoryName() {
		return catagoryName;
	}

	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	@Override
	public String toString() {
		return "AnimalCatagory [catagoryName=" + catagoryName + "]";
	}
	
	

}
