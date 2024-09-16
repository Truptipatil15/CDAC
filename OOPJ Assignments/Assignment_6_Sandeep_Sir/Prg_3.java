package com.java.day6;

import java.util.Scanner;

public class Prg_3 {

	public static void main(String[] args) {
		int[] arr= new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		int max=arr[0];
		int min=arr[0];
		System.out.println("Array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			else if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		System.out.println("Maximum Element is:"+max);
		System.out.println("Minimum Element is:"+min);
		
	}

}
