package com.prowings.beans;

public class Vehicle {
	
	int id;
	String companyName;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", companyName=" + companyName + "]";
	}
	
	public void myInit()
	{
		System.out.println("vehicle init method called!!!");
	}

	public void myDestroy()
	{
		System.out.println("vehicle destroy method called!!!");
	}

	
}
