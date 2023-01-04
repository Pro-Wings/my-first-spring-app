package com.prowings.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	@Value("10")
	int id;
	@Autowired
	AnimalCatagory animalCatagory;
	
	public Animal() {
		super();
		
		System.out.println("no arg for Animal invoked!!!");
		// TODO Auto-generated constructor stub
	}
	
	public Animal(AnimalCatagory animalCatagory) {
		super();
		System.out.println("constructor invoked for animalcatagory!!!");
		this.animalCatagory = animalCatagory;
	}

	public Animal(int id, AnimalCatagory animalCatagory) {
		super();
		this.id = id;
		this.animalCatagory = animalCatagory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnimalCatagory getAnimalCatagory() {
		return animalCatagory;
	}
	
	public void setAnimalCatagory(AnimalCatagory animalCatagory) {
		System.out.println("setter invoked for animalcatagory!!!");
		this.animalCatagory = animalCatagory;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", animalCatagory=" + animalCatagory + "]";
	}

	@PostConstruct
	public void init()
	{
		System.out.println("init invoked in animal!!");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy invoked in animal!!");
	}
	
	@Bean
	public static Engine getEngine() //factory method
	{
		Engine e = new Engine();
		e.setCapaacity(123);
		e.setType("IC Engine");
		return e;
	}
	
}
