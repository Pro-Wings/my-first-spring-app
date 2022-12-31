package com.prowings.beans;

public class Engine {
	
	String type;
	int capaacity;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapaacity() {
		return capaacity;
	}
	public void setCapaacity(int capaacity) {
		this.capaacity = capaacity;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", capaacity=" + capaacity + "]";
	}
	
	

}
