package com.java.day4_1;

public class LoanAmortizationCalculator {
	double principalAmt;
    double interest;
    int loanTerm;
    
	public LoanAmortizationCalculator(double principalAmt, double interest, int loanTerm) {
		
		this.principalAmt = principalAmt;
		this.interest = interest;
		this.loanTerm = loanTerm;
	}

	public double getPrincipalAmt() {
		return principalAmt;
	}

	public void setPrincipalAmt(double principalAmt) {
		this.principalAmt = principalAmt;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	
	public double calculateMonthlyPayment() {
		double month_interest=(interest/100)/12;
		double numberMonth=loanTerm*12;
		
	   return principalAmt *  (month_interest * Math.pow(1 + month_interest, numberMonth)) / 
	            (Math.pow(1 + month_interest, numberMonth) - 1);
		
	}
	
	public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTerm * 12;
    }
	
	@Override
	public String toString() {
		return "LoanAmortizationCalculator [principalAmt=" + principalAmt + ", interest=" + interest + ", loanTerm="
				+ loanTerm + "]";
	}
    
}
