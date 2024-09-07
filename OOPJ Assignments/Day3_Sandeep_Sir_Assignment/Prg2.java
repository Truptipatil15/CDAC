
//2. Compound Interest Calculator for Investment

package com.java.day3;

import java.util.Scanner;

class CompoundInterestCalculator
{
	private double initialAmt;
	private double annualInterest;
	private double noOfCompound;
	private int years;
	private double futureValue;
	private double totalInterest;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter Initial Investment Ammount:");
		initialAmt=sc.nextDouble();
		System.out.println("Enter Annual Interest Rate:");
		annualInterest=sc.nextDouble();
		System.out.println("Number of time interest compounded:");
		noOfCompound=sc.nextDouble();
		System.out.println("Enter year:");
		years=sc.nextInt();
		
	}
	public void calculateFutureValue() {
		 futureValue= initialAmt *Math.pow ((1 + annualInterest / noOfCompound),(noOfCompound * years));   
		 totalInterest=futureValue-initialAmt;
		
	}
	public void printRecord() {
		System.out.println("Future Value of investment:"+futureValue);
		System.out.println("Total Interest Earned:"+totalInterest);
	}
	
}


public class Prg2 {

	public static void main(String[] args) {
		CompoundInterestCalculator ci=new CompoundInterestCalculator();
		ci.acceptRecord();
		ci.calculateFutureValue();
		ci.printRecord();

	}

}
