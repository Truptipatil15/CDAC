package com.java.day4_2;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	CompoundInterestCalculator cal;
	
	
	public CompoundInterestCalculatorUtil() {
		this.cal=new CompoundInterestCalculator(0, 0, 0, 0);
	}
	static Scanner sc=new Scanner(System.in);

	public void acceptRecord()
	{
		
		System.out.println("Enter Initial Amount:");
		this.cal.setPrincipal(sc.nextDouble());
		System.out.println("Enter Annual Interest Rate:");
		this.cal.setAnnualInterestRate(sc.nextDouble());
		System.out.println("Enter No. Of time interest compounded:");
		this.cal.setNoOfCompundInterest(sc.nextDouble());
	    System.out.println("Enter Years:");
	    this.cal.setYear(sc.nextInt());
	  
	}
	
	public void printRecord()
	{
	
		double futureValue=cal.futureValueCalculation();
		double totalValue=cal.totalValueEarmed();
		
		System.out.println("Future Value is:"+futureValue);
		System.out.println("Total Value Earned:"+totalValue);
	}
	
	public static int menuList()
	{
		System.out.println("1. Enter all details:");
		System.out.println("2. Display Detail");
		System.out.println("0. Exit");
		System.out.println("Enter Choice");
		return sc.nextInt();
		
	}

}
