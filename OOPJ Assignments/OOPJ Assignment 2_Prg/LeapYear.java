package com.java.prg;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		y=sc.nextInt();
		if(y%4==0)
		{
			System.out.println(y+" "+"Leap Year");
		}
		else if(y%100==0 && y%400==0)
		{
			System.out.println(y+" "+"Leap Year");
		}
		else
		{
			System.out.println(y+" "+"Not Leap Year");
		}
		

	}

}
