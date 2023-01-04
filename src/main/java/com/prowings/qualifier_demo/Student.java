package com.prowings.qualifier_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int roll;
	String name;
	
	@Autowired
	@Qualifier("english")
	Subject subject;
	
	@Autowired
//	@Qualifier("permnantAddress")
	Adress addr;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, Subject subject, Adress addr) {
		super();
		this.roll = roll;
		this.name = name;
		this.subject = subject;
		this.addr = addr;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Adress getAddr() {
		return addr;
	}
	public void setAddr(Adress addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + ", addr=" + addr + "]";
	}
	
	

}
