package com.java.day4_3;

import java.util.Scanner;

public class BMITrackerUtil {
	BMITracker bmiTracker;
	static Scanner sc=new Scanner(System.in);
	
	public BMITrackerUtil() {
	
		this.bmiTracker =new BMITracker(0,0);
	}


	public void acceptRecord()
	{
		System.out.println("Enter Weight:");
		this.bmiTracker.setWeight(sc.nextDouble());
		System.out.println("Enter Height:");
		this.bmiTracker.setHeight(sc.nextDouble());
	
	}
	
	public void printRecord()
	{
		System.out.println("BMI Calculation is:"+bmiTracker.BMICalculation());
		System.out.println("BMI Classifiation:"+bmiTracker.BMIClassify());
	}
	
	public static int menuList()
	{
		System.out.println("1.Enter Detail");
		System.out.println("2.Display ");
        System.out.println("0.Exit");
        System.out.println("Enter Choice");
		return sc.nextInt();
	}

}
