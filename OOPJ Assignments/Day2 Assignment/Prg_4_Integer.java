package com.java.day2;

public class Prg_4_Integer {

	public static void main(String[] args) {
		System.out.println("No.of Bytes represent int value:"+Integer.BYTES);
		
		System.out.println("Min Value of integer:"+Integer.MIN_VALUE);
		
		System.out.println("Max Value of integer:"+Integer.MAX_VALUE);
		
		//d convert int to string
		int n1=345;
		String str=Integer.toString(n1);
		System.out.println("Convert int to String:"+str);
		
		//e convert string to int
		String strNumber="6785";
		int n2=Integer.parseInt(strNumber);
		System.out.println("Convert String to int:"+n2);
		
		//f convert string to int
		/*String strNumber1="Ab12Cd3";
		int n3=Integer.parseInt(strNumber1);
		System.out.println("Convert String to int:"+n3);  //NumberFormat Exeption
		*/
		
		//g convert int to corresponsding wrapper class
		int i3=3456;
		Integer it=Integer.valueOf(i3);
		System.out.println("convert int to corresponding wrapper class:"+it);
		
		//h convert String to corresponsding wrapper class
		String str3="456";
		Integer it1=Integer.valueOf(str3);
		System.out.println("convert String to corresponding wrapper class:"+it1);
		
		//Add og Two int
		int a1=22;
		int a2=44;
		int result=Integer.sum(a1, a2);
		System.out.println("Addition is:"+result);
		
		//Find min and max
		System.out.println("Min value is:"+Integer.min(a1,a2));
		System.out.println("Max value is:"+Integer.max(a1,a2));
		
		//k convert int to binary,octal
		int num=7;
		System.out.println("Binary is:"+Integer.toBinaryString(num));
		System.out.println("Octal is:"+Integer.toOctalString(num));
		System.out.println("Hexadecimal is:"+Integer.toHexString(num));

		//l convert int to other primitive data type
		int num1=567;
		float f=(float)num1;
		System.out.println("Convert float to int:"+f);


	}

}
