package com.java.day4_3;

public class BMITracker {
	
	double weight;
	double height;
	public BMITracker(double weight, double height) {
		
		this.weight = weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "BMITracker [weight=" + weight + ", height=" + height + "]";
	}
	
	public double BMICalculation()
	{
		double bmiCalculation=weight/(height*height);
		return bmiCalculation;
	}
	
	public String BMIClassify()
	{
		if(BMICalculation()<18.5)
			return "Underweight";
		else if(BMICalculation()>=18.5 && BMICalculation()<=24.9)
			return "Normal Weight";
		else if(BMICalculation()>=25 && BMICalculation()<=29.9)
			return "Overweight";
		else
			return "You are obese";
	}
}
