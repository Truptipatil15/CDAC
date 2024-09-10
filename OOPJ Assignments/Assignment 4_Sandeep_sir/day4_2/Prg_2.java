package com.java.day4_2;

import java.util.Scanner;

public class Prg_2 {
	public static void main(String[] args) {
		
	CompoundInterestCalculatorUtil util=new CompoundInterestCalculatorUtil();
	int choice=0;
	
	do {
		
		
		switch(choice)
		{
		
		
		case 1:
			util.acceptRecord();
			break;
		case 2:
			util.printRecord();
			break;
		case 0:System.out.println("Exit Program");
	       break;
		default:System.out.println("");
		
		}
		
	}while((choice=CompoundInterestCalculatorUtil.menuList())!=0);
}
}
