package com.java.day4_2;

public class CompoundInterestCalculator {
	double principal;
	double annualInterestRate;
	double noOfCompundInterest;
	int year;
	
	public CompoundInterestCalculator(double principal, double annualInterestRate, double noOfCompundInterest,
			int year) {
		super();
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.noOfCompundInterest = noOfCompundInterest;
		this.year = year;
		
		
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getNoOfCompundInterest() {
		return noOfCompundInterest;
	}

	public void setNoOfCompundInterest(double noOfCompundInterest) {
		this.noOfCompundInterest = noOfCompundInterest;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", noOfCompundInterest=" + noOfCompundInterest + ", year=" + year + "]";
	}
	
	
	public double futureValueCalculation()
	{
		double futureValue=principal*(Math.pow(1+annualInterestRate/noOfCompundInterest,( noOfCompundInterest*year)));
		return futureValue;
	}
	public double totalValueEarmed()
	{
		double totalValue=futureValueCalculation()-principal;
		return totalValue;
	}

}
