package org.assignment.ADS2;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1="";
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String str2=str;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			str1=ch+str1;
		}
     System.out.println("Reversed String:"+str1);
     if(str1.equals(str2))
     {
    	 System.out.println("String are palindrome");
     }
     else
     {
    	 System.out.println("Strings are not palindrome");
     }
	}
  
}
