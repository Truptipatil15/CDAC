package com.java.day6;

import java.util.Scanner;

public class Prg_2 {

	static Scanner sc=new Scanner(System.in);
     private static void acceptRecord(int[] arr) {
    	for(int i=0;i<arr.length;i++)
 		{
 			System.out.println("Enter arr["+i+"]:");
 			arr[i]=sc.nextInt();
 		}
		
	}
    
	private static void printRecord(int[] arr) {
		System.out.println("Array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	
	public static void main(String[] args) {
		int[] arr=new int[5];
	
		Prg_2.acceptRecord(arr);
		Prg_2.printRecord(arr);

	}

	
}
