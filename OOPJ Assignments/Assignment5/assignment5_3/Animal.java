package org.java.assignment5_3;

public class Animal {

	String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void sleep()
	{
		System.out.println("Sleep method call");
	}
	public void eat()
	{
		System.out.println("Eat method call");
	}
}
