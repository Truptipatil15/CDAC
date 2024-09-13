package org.java.assignment5_2;

public class Car extends Vehicle {

	String model;
	public Car() {
		
	}
    public Car(String name,int year,String model) {
		super(name,year);
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Model : :"+this.model);
	}
}

