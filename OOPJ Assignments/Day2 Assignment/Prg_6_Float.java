package com.java.day2;

public class Prg_6_Float {

	public static void main(String[] args) {
		System.out.println("Bytes required for float"+Float.BYTES);
		
		System.out.println("Min Value of float:"+Float.MIN_VALUE);
		
		System.out.println("Max value of float:"+Float.MAX_VALUE);
		
		        //d convert Float to string
				float n1=345.6f;
				String str=Float.toString(n1);
				System.out.println("Convert Float to String:"+str);
				
				//e convert string to Float
				String strNumber="678.6";
				float n2=Float.parseFloat(strNumber);
				System.out.println("Convert String to int:"+n2);
				
				//f convert string to int
				/*String strNumber1="Ab12Cd3";
				float n3=Float.parseFloat(strNumber1);
				System.out.println("Convert String to int:"+n3);  //NumberFormat Exeption
				*/
				
				//g convert Float to corresponsding wrapper class
				float i3=3456.67f;
				Float it=Float.valueOf(i3);
				System.out.println("convert Float to corresponding wrapper class:"+it);
				
				//h convert String to corresponsding wrapper class
				String str3="456.56";
				Float it1=Float.valueOf(str3);
				System.out.println("convert String to corresponding wrapper class:"+it1);
				
				//i Add of Two Float
				float a1=112.3f;
				float a2=984.5f;
				float result=Float.sum(a1, a2);
				System.out.println("Addition is:"+result);
				
				//j Find min and max
				System.out.println("Min value is:"+Float.min(a1,a2));
				System.out.println("Max value is:"+Float.max(a1,a2));
				
				//k convert to square root
				float f=-25.0f;
				System.out.println("Square root is:"+Math.sqrt(f));

				// l divisoin of two float
				float n3 =0.0f;
				float n4=0.0f;
				System.out.println("Divisoin of float:"+n3/n4);
				
				//m convert float to other primitive data type
				float num1=567.8f;
				int f2=(int)num1;
				System.out.println("Convert float to int:"+f2);



	}

}
