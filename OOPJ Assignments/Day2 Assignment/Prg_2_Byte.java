package com.java.day2;

public class Prg_2_Byte {

	public static void main(String[] args) {
		
		//b how many bytes used to represent byte
		System.out.println("Bytes Represent to byte:"+Byte.BYTES);
		
		//c Min value of byte
		System.out.println("Min value of byte:"+Byte.MIN_VALUE);
		//c Max value of byte
		System.out.println("Max value of byte:"+Byte.MAX_VALUE);
		
		//d Convert Byte to String 
		byte number=23;
		String strNumber=Byte.toString(number);
		System.out.println("Convert Using tostring:"+strNumber);
		
		//e Convert String to Byte
		String strNumber1="123";
		byte b1=Byte.parseByte(strNumber);
		System.out.println("Convert to String to Byte:"+strNumber1);
		
		//f Convert String to Byte
		 /*String strNumber2="Ab12Cd3";
		byte b2=Byte.parseByte(strNumber2);             //NumberFormatExeption
		System.out.println("Convert to String to Byte:"+strNumber2);  
        */
		
		//g Convert Byte to Wrapper Class
		byte number1=120;
		Byte a=Byte.valueOf(number1);
		System.out.println("Convert Corresponding Wrapper class:"+a);
		
		//h Convert String to Wrapper Class
		String strnumber3="120";
		Byte a1=Byte.valueOf(strnumber3);
		System.out.println("String Convert Corresponding Wrapper class:"+a1);

		//i convert byte to any other primitive
		byte b2=123;
		int i=(int)b2;
		System.out.println("Convert byte to other primitive :"+i);
		
	}

}
