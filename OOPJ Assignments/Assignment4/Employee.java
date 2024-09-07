//Q.Write Employee Class create instance call method and display its details 

package com.java.Ass;

import java.util.Scanner;

class Program{
	private int empId;
	private String empName;
	private String city;
	private float salary;
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.print("Enter Employee Id: ");
		this.empId=sc.nextInt();
		
		System.out.print("Enter Employee Name: ");
		this.empName=sc.next();
		
		System.out.print("Enter Employee City: ");
		this.city=sc.next();
		
		System.out.print("Enter Employee Salary: ");
		this.salary=sc.nextFloat();
		}

	public void printRecord() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Employee Details:"); 
		System.out.println("\nEmployee Id:"+this.empId);
		System.out.println("Employee Name:"+this.empName);
		System.out.println("Employee City:"+this.city);
		System.out.println("Employee Salary:"+this.salary);

	}

	
}
public class Employee {

	public static void main(String[] args) {
		Program emp=new Program();
		emp.acceptRecord();
		emp.printRecord();

	}
	
}
