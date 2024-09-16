package com.java.day6;

import java.util.Scanner;

public class Prg_1 {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Default value of array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array value From User:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		
	}

}
