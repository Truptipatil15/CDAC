package org.java.assignment5_2;

public class Vehicle {

	String make;
	int year;
	
	public Vehicle() {

	}
	public Vehicle(String make,int year)
	{
		this.make=make;
		this.year=year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDetails()
	{
		System.out.println("Make : "+this.make);
		System.out.println("Year : :"+this.year);
	}
}
