package com.prowings.beans;

public class ConstructorAmbiguity {
	
	int i;
	int j;	
	
	public ConstructorAmbiguity(double k, double l) {
		super();
		System.out.println("double double");
		this.i = (int) k;
		this.j = (int) l;
	}
	
	public ConstructorAmbiguity(int i, int j) {
		super();
		System.out.println("int int");
		this.i = i;
		this.j = j;
	}

	
	public ConstructorAmbiguity(String i, String j) {
		super();
		System.out.println("String String");
		this.i = Integer.parseInt(i);
		this.j = Integer.parseInt(j);
	}


}
