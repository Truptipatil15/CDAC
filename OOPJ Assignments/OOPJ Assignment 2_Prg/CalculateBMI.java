package com.java.prg;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kilograms");
		double weight=sc.nextDouble();
		System.out.println("Enter Height in meter");
		double height=sc.nextDouble();
		
		double BMI=weight/(height*height);
		
		if(BMI<18.5)
			System.out.println("Underweight");
		else if(BMI>=18.5 && BMI<=24.9)
			System.out.println("Normal Weight");
		else if(BMI>=25 && BMI<=29.9)
			System.out.println("Overweight");
		else
			System.out.println("You are obese");

	}

}
