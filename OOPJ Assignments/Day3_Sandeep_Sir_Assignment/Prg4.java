//Discount Calculation for Retail Sales

package com.java.day3;

import java.util.Scanner;

class DiscountCalculator{
	double originalPrice;
	double discount;
	double discountAmount;
	double finalPrice;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		
		System.out.println("Enter Original price:");
		originalPrice=sc.nextDouble();
		System.out.println("Enter Discount:");
		discount=sc.nextDouble();
		
	}
	public void calculateBmi() {
		// TODO Auto-generated method stub
		discountAmount = originalPrice * (discount / 100);
		finalPrice = originalPrice - discountAmount;
		
	}
	
	public void printRecord() {
		// TODO Auto-generated method stub
		System.out.println("Discount Amount:"+discountAmount);
		System.out.println("Final Prie:" + finalPrice);
		
	}
	
}
public class Prg4 {

	public static void main(String[] args) {
		DiscountCalculator dc=new DiscountCalculator();
		dc.acceptRecord();
		dc.calculateBmi();
		
		dc.printRecord();
		

	}

}
