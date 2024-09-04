package com.java.prg;

import java.util.Scanner;

public class AreaOfShapes {

	public static void main(String[] args) {
		int shape;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		System.out.println("1.Circle\n2.Rectangle\n3.Square\n4.Traingle");
		shape = sc.nextInt();
		switch(shape)
		{
		 
		case 1:
			double a,r;
			System.out.println("Enter Radius of circle:");
			r=sc.nextDouble();
			a=3.14*r*r;
			System.out.println("Area of Circle is:"+a);
			break;
		case 2:
			float l,w,a1;
			System.out.println("Enter length:");
			l=sc.nextFloat();
			System.out.println("Enter Width:");
			w=sc.nextFloat();
			a1=l*w;
			System.out.println("Area of Rectangle is:"+a1);
			break;
		case 3:
			float s,a3;
			System.out.println("Enter Sides:");
			s=sc.nextFloat();
			a3=s*s;
			System.out.println("Area of Square is:"+a3);
			break;
		case 4:
			float b,h,a4;
			System.out.println("Enter Base:");
			b=sc.nextFloat();
			System.out.println("Enter Height:");
			h=sc.nextFloat();
			a4=1/2*b*h;
			System.out.println("Area of Rectangle is:"+a4);
			break;
		default:System.out.println("Invalid choie");
		}
		
			
			
		
	}

}
