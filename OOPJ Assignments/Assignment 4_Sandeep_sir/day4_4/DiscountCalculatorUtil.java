package com.java.day4_4;

import java.util.Scanner;

public class DiscountCalculatorUtil {

	DiscountCalculator discountCalculator;
	static Scanner sc=new Scanner(System.in);
	
	public DiscountCalculatorUtil()
	{
		this.discountCalculator=new DiscountCalculator(0, 0);
	}
	
	
	public void acceptRecord()
	{
		System.out.println("Enter Original Amount");
		this.discountCalculator.setOriginalPrice(sc.nextDouble());
		System.out.println("Enter Discount");
		this.discountCalculator.setDiscountRate(sc.nextDouble());
		
	}
	public void printRecord()
	{
		System.out.println("Discount Amount Calculation:"+discountCalculator.discountAmountCalculation());
		System.out.println("Final Price Calculation:"+discountCalculator.finalPriceCalculation());
	}
	
	public static int menuList()
	{
		System.out.println("1.Enter details");
		System.out.println("2.Display details");
		System.out.println("0.Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		return sc.nextInt();
	}
}
