package com.java.day4_5;

import com.java.day4_4.DiscountCalculatorUtil;

public class Prg_5 {

	public static void main(String[] args) {
		TollBoothRevenueManagerUtil dc=new TollBoothRevenueManagerUtil();
		int choice=0;
		
		do {
			switch(choice)
			{
			case 1:
				dc.setTroll();
				break;
			case 2:
				dc.acceptRecord();
				break;
			case 3:
				dc.printRecord();
			case 0:
				System.out.println("Exit Programming");
				break;
			}
		}while((choice=TollBoothRevenueManagerUtil.menuList())!=0);
	}

}
