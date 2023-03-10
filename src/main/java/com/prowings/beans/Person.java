package com.prowings.beans;

public class Person {
	
	Address address;

	Department dept;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Address address) {
		super();
		this.address = address;
		System.out.println("address constructor invoked");
	}

	
	public Person(Address address, Department dept) {
		super();
		this.address = address;
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("address setter invoked");
	}

	
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
		System.out.println("dept setter invoked");
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", dept=" + dept + "]";
	}

	
	
	

}
