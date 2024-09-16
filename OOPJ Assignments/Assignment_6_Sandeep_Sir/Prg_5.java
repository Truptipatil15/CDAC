package com.java.day6;

import java.util.Scanner;

public class Prg_5 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        
        
        System.out.println("Enter First Array:");
        for(int i=0;i<array1.length;i++)
        {
        	System.out.println("Enter arr["+i+"]");
        	array1[i]=sc.nextInt();
        }

        for(int i=0;i<array1.length;i++)
        {
        	System.out.print(array1[i]+" ");
        
        }
        System.out.println();
      
        System.out.println("Enter Second array");
        for(int i=0;i<array2.length;i++)
        {
        	System.out.println("Enter arr["+i+"]");
        	array2[i]=sc.nextInt();
        }

        for(int i=0;i<array2.length;i++)
        {
        	System.out.print(array2[i]+" ");
        
        }
        
        System.out.println();
        System.out.print("Intersection: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; 
                }
            }
        }
    }
}
