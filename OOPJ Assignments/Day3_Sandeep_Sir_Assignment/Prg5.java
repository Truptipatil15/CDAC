//Toll Booth Revenue Management

package com.java.day3;

import java.util.Scanner;

class TollBoothRevenueManager{
	double carToll;
	double truckToll;
	double motorCycleToll;
	int carCount;
	int trucount;
	int motorCycleCount;
	
	Scanner sc=new Scanner(System.in);
	
	public void setTroll() {
		System.out.println("Enter Car toll:");
		carToll=sc.nextDouble();
		System.out.println("Enter Truck toll:");
		truckToll=sc.nextDouble();
		System.out.println("Enter Motor Cycle toll:");
		motorCycleToll=sc.nextDouble();
		
	}
	public void acceptRecord() {
		
		System.out.println("Enter Number of Car:");
		carCount=sc.nextInt();
		System.out.println("Enter Number of Truck:");
		trucount=sc.nextInt();
		System.out.println("Enter Number of Motor Cycle ");
		motorCycleCount=sc.nextInt();
		
	}
	public double calculateRevenue() {
		double carRevenue=carCount*carToll;
		double truckRevenue=trucount*truckToll;
		double motarCylceRevenue=motorCycleCount*carToll;
		return carRevenue+truckRevenue+motarCylceRevenue;
		
	}
	
	
	public void printRecord() {
		int totalVechicle=carCount+trucount+motorCycleCount;
		double totalNoRevenue=calculateRevenue();
		System.out.println("Total Vechicle:"+totalVechicle);
		System.out.printf("Total Revenue:%.2f",totalNoRevenue);
	}
	
	

}

public class Prg5 {
public static void main(String[] args) {
	TollBoothRevenueManager TBR=new TollBoothRevenueManager();
	TBR.setTroll();
	TBR.acceptRecord();
	TBR.calculateRevenue();
	
	TBR.printRecord();
}
}
