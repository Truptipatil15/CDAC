package com.java.prg;
/*
 (12,1,2)-Winter
 (3,4,5)-Spring
 (6,7,8)-Summer
 (9,10,11)-autumn
 */
import java.util.Scanner;

public class SeasonCheck {

	public static void main(String[] args) {
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Month:");
		month=sc.nextInt();
		switch(month)
		{
		case 12: case 1: case 2:
			System.out.println("Winter Season");
			break;
		case 3: case 4: case 5:
			System.out.println("Spring Season");
			break;
		case 6: case 7: case 8:
			System.out.println("Summer Season");
			break;
		case 9: case 10: case 11:
			System.out.println("Autum Season");
			break;
		default:System.out.println("Invalid");
		}

	}

}
