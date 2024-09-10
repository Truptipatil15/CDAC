package com.java.day4_4;

public class Prg_4 {

	public static void main(String[] args) {
		DiscountCalculatorUtil dc=new DiscountCalculatorUtil();
		int choice=0;
		
		do {
			switch(choice)
			{
			case 1:
				dc.acceptRecord();
				break;
			case 2:
				dc.printRecord();
				break;
			case 0:
				System.out.println("Exit Programming");
				break;
			}
		}while((choice=DiscountCalculatorUtil.menuList())!=0);
	}

}
