package com.java.day2;

public class Prg_1_boolean {

	public static void main(String[] args) {
		//b convert boolean to String
		boolean b=true;
		String s=Boolean.toString(b);
		System.out.println(s);
		
		//c Convert String to Boolean
		String strStatus="true";
		boolean b1=Boolean.parseBoolean(strStatus);
		System.out.println(b);
		
		//d Convert String to Boolean
		String strStaus1="1";
		boolean b2=Boolean.parseBoolean(strStaus1);
		System.out.println(b2);
		
		//e boolean value convert to wrapper class
		boolean status=true;
		Boolean s1=Boolean.valueOf(status);
		System.out.println(s1);
		
		//f String value convert to wrapper class
		String s3="true";
		Boolean b3=Boolean.valueOf(s3);
		System.out.println(b3);
		
		//g convert boolean value other primitive
		
		/*boolean b4=true;
		int i=(int) b4;     cannont cast from boolean to int
		
		int i2=3;
		boolean b5=(boolean)i2;   cannot cast int to boolean
		*/

	}

}
