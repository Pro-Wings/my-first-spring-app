package com.prowings.qualifier_demo;

public class Adress {
	
	int pin;
	String city;
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adress [pin=" + pin + ", city=" + city + "]";
	}
	
	

}
