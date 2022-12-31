package com.prowings.beans;

public abstract class Car {
	
	Engine engine;
	int make;
	String type;
	
	protected abstract Engine createEngine();


	public Engine getEngine()
	{
		return createEngine();
	}
	
	public int getMake() {
		return make;
	}
	
	public void setMake(int make) {
		this.make = make;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Car [engine=" + engine + ", make=" + make + ", type=" + type + "]";
	}


	
	
	
}
