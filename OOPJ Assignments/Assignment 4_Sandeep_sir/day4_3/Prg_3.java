package com.java.day4_3;

public class Prg_3 {

	public static void main(String[] args) {
		BMITrackerUtil util=new BMITrackerUtil();
		int choice=0;
		
		do {
			switch(choice)
			{
			case 0:System.out.println("Exit Program");
			break;
			case 1:
				util.acceptRecord();
			case 2:
				util.printRecord();
			default:System.out.println("Invalid");
			}
		}while((choice=BMITrackerUtil.menuList())!=0);

	}

}
