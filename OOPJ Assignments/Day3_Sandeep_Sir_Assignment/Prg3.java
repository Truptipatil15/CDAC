//BMI (Body Mass Index) Tracker


package com.java.day3;

import java.util.Scanner;

class BMITracker
{
	double weight;
	double height;
	double BMI;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		// TODO Auto-generated method stub
		System.out.println("Enter weight in kilograms");
		 weight=sc.nextDouble();
		System.out.println("Enter Height in meter");
		 height=sc.nextDouble();
		
	}
	public void calculateBmi() {
		// TODO Auto-generated method stub
		BMI=weight/(height*height);
		
	}
	public String classifyBmi() {
		// TODO Auto-generated method stub
		if(BMI<18.5)
			return "Underweight";
		else if(BMI>=18.5 && BMI<=24.9)
			return "Normal Weight";
		else if(BMI>=25 && BMI<=29.9)
			return "Overweight";
		else
			return "You are obese";
		
		
	}
	public void printRecord() {
		// TODO Auto-generated method stub
		System.out.println("BMI Value:"+BMI);
		System.out.println("Classification:" + classifyBmi());
		
	}
	
}

public class Prg3 {

	public static void main(String[] args) {
		BMITracker bmi=new BMITracker();
		bmi.acceptRecord();
		bmi.calculateBmi();
		bmi.classifyBmi();
		bmi.printRecord();
		
			
	}

}
