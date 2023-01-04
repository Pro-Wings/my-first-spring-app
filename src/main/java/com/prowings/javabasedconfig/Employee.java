package com.prowings.javabasedconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	
	int id;
	String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init invoked!!!");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy invoked!!!");
	}

}
