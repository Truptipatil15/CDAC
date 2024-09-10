package com.java.day4_4;

public class DiscountCalculator {

	
	double originalPrice;
	double discountRate;
	
	public DiscountCalculator(double originalPrice, double discountRate) {
		super();
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	
	@Override
	public String toString() {
		return "DiscountCalculator [originalPrice=" + originalPrice + ", discountRate=" + discountRate + "]";
	}

	public double discountAmountCalculation()
	{
		double discountAmount=originalPrice*(discountRate/100);
		return discountAmount;
	}
	
	public double finalPriceCalculation()
	{
		double finalCalculation=originalPrice-discountRate;
		return finalCalculation;
	}
	
}
