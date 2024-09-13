package org.java.assignment5_4;

import java.util.Scanner;

public class Student {
	String name;
	int age;
	String department;
	static String institute_Name="CDAC Mumbai";
	Scanner sc=new Scanner(System.in);
	public Student() {
		
	}

	public Student(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public void acceptRecord()
	{
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter department:");
		department=sc.nextLine();
	}
	public void printRecord() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Department : "+department);
		System.out.println("Institute Name : "+Student.institute_Name);
	}

}
