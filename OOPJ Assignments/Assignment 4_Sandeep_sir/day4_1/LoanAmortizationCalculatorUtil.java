package com.java.day4_1;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	LoanAmortizationCalculator loanAmortizationCalculator;
	static Scanner sc=new Scanner(System.in);
	
	LoanAmortizationCalculatorUtil()
	{
	   loanAmortizationCalculator=new LoanAmortizationCalculator(0, 0, 0);
	}
	public void acceptRecord() {
		
		
		System.out.println("Enter principal amount:");
		this.loanAmortizationCalculator.setPrincipalAmt(sc.nextDouble());	 
		System.out.println("Enter Annal Interest:");
		this.loanAmortizationCalculator.setInterest(sc.nextDouble());
		System.out.println("Enter Loan Term(In year)");
		this.loanAmortizationCalculator.setLoanTerm(sc.nextInt());

	}
	
	public void printRecord()
	{
		System.out.println(loanAmortizationCalculator.toString());
        double monthlyPayment = loanAmortizationCalculator.calculateMonthlyPayment();
        double totalPayment = loanAmortizationCalculator.calculateTotalPayment();

        System.out.printf("Monthly Payment: ₹ %.2f%n", monthlyPayment);
        System.out.printf("Total Payment over the loan term: ₹ %.2f%n", totalPayment);
	}
	
	public static int menuList() {
        System.out.println("1. Enter Loan Details");
        System.out.println("2. Display Loan Amortization Details");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
	
}
