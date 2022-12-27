package com.prowings.beans;

public class Employee {
	
	int id;
	String name;
	String dept;
	Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String dept, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

	
	

}
