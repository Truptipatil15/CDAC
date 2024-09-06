package com.java.day2;

public class Prg_8 {

	public static void main(String[] args) {
		//d Convert Byte to String 
		        byte number=23;
				String strNumber=Byte.toString(number);
				System.out.println("Convert Using tostring:"+strNumber);
				
				//h Convert String to Wrapper Class
				String strnumber3="120";
				Byte a1=Byte.valueOf(strnumber3);
				System.out.println("String Convert Corresponding Wrapper class:"+a1);
				
				//d short convert to string
				short number1=234;
				String str1=Short.toString(number1);
				System.out.println("Convert short to string:"+str1);
				
				//h convert string to corresponding wrapper class
				String strNumber1="2399";
				Short s4=Short.valueOf(strNumber1);
				System.out.println("Convert String to Corresponding wrapper class:"+s4);
				
				//d convert int to string
				int n1=345;
				String str=Integer.toString(n1);
				System.out.println("Convert int to String:"+str);
				
				//h convert String to corresponsding wrapper class
				String str3="456";
				Integer it1=Integer.valueOf(str3);
				System.out.println("convert String to corresponding wrapper class:"+it1);
				
				//d convert Float to string
				float n2=345.6f;
				String str2=Float.toString(n2);
				System.out.println("Convert Float to String:"+str2);
				
				//h convert String to corresponsding wrapper class
				String str4="456.56";
				Float it2=Float.valueOf(str4);
				System.out.println("convert String to corresponding wrapper class:"+it2);
				
				long l1=34578;
				String str5=Long.toString(l1);
				System.out.println("Convert Float to String:"+str5);
				
				String stStatus="67589";
				Long l3=Long.valueOf(stStatus);
				System.out.println("Convert long to string:"+l3);
				
				//d convert Float to string
				Double d1=345.6;
				String stStatus1=Double.toString(d1);
				System.out.println("Convert Double to String:"+stStatus1);
				
				//h convert String to corresponsding wrapper class
				String st="456.56";
				Double d2=Double.valueOf(st);
				System.out.println("convert String to corresponding wrapper class:"+d2);
				
				


					

	}

}
