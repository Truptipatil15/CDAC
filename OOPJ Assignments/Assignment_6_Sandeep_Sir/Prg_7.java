package com.java.day6;

import java.util.Scanner;

public class Prg_7 {
  
	int[] arr;
	Scanner sc=new Scanner(System.in);
	public Prg_7(int size) {
		arr=new int[size];
	}


	public void acceptRecord()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
	}
	
	public void printRecord()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Prg_7 p=new Prg_7(2);
		Prg_7 p1=new Prg_7(3);
		
		
		p.acceptRecord();
		p.printRecord();
		
		p1.acceptRecord();
		p1.printRecord();

		

	}

}
