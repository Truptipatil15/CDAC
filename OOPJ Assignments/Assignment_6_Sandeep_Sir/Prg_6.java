package com.java.day6;

public class Prg_6 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7};
		int N=7;
		int totalSum=0;
		int arrSum=0;
		
		System.out.println("Array Elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<=N;i++)
		{
			totalSum +=i;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arrSum +=arr[i];
		}
		
		int missNum=totalSum-arrSum;
		System.out.println("Missing Element:"+missNum);
	}

}
