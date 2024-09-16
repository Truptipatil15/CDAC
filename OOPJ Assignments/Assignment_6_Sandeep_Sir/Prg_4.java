package com.java.day6;

import java.util.Scanner;

public class Prg_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int size = sc.nextInt();
		int[] arr= new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter arr["+i+"]");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
			 if(arr[i]>arr[j])
			 {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 }
			}		
		}
		
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
				
			}
		}
		temp[j]=arr[arr.length-1];
		
		int[] arr1 = new int[j];
        for (int i = 0; i < j; i++) {
            arr1[i] = temp[i];
        }
        
        System.out.println("Array After Removing Duplicates:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
	}

}
