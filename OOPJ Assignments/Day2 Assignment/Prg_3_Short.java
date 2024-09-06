package com.java.day2;

public class Prg_3_Short {
	public static void main(String[] args) {
		
		System.out.println("Bytes represent to short:"+Short.BYTES);
		
		System.out.println("Min Value of Short:"+Short.MIN_VALUE);
		System.out.println("Min Value of Short:"+Short.MAX_VALUE);
		
		//d short convert to string
		short number=234;
		String str1=Short.toString(number);
		System.out.println("Convert short to string:"+str1);
		
		//e Convert string to short
		String strNumber="456";
		short s1=Short.parseShort(strNumber);
		System.out.println("Convert string to short:"+s1);
		
		/*//f Convert string to short
		String strNumber1="Ab12Cd3";                              //NumberFormmat Exeption
		short s2=Short.parseShort(strNumber1);
		System.out.println("Convert string to short:"+s2);
	    */	
		
		//g convert short to corresponding wrapper class
		short number2=5678;
		Short s3=Short.valueOf(number2);
		System.out.println("Convert short to Corresponding wrapper class:"+s3);
		
		//h convert string to corresponding wrapper class
		String strNumber1="2399";
		Short s4=Short.valueOf(strNumber1);
		System.out.println("Convert String to Corresponding wrapper class:"+s4);
		
		//Convert short to other primitive
		short s5=3456;
		int a=(int)s5;
		System.out.println("Convert short to int:"+a);
		
		double f=346.5;
		short bt=(short)f;
		System.out.println("Convert float to byte:"+bt);
		
		
		
	}

}
