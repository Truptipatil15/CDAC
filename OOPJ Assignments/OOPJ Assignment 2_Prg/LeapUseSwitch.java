package com.java.prg;

import java.util.Scanner;

public class LeapUseSwitch {

	public static void main(String[] args) {
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		y=sc.nextInt();
		switch(y% 4)
		{
		case 0:
			switch(y%100)
			{
			case 0:
				switch(y%400)
				{
				case 0 :System.out.println(y+" is leap Year");
				break;
				default:System.out.println(y+" is not leap Year");
				break;
				}
				break;
				default:System.out.println(y+" is leap Year");
				break;
			}
			break;
		    default:System.out.println(y+" is not leap Year");
		    break;
		}
	

	}

}
