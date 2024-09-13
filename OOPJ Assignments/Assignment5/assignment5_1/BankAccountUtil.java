package org.java.assignment5_1;

import java.util.Scanner;

public class BankAccountUtil {

	SavingsAccount s;
	static Scanner sc=new Scanner(System.in);
	public BankAccountUtil() {
		this.s=new SavingsAccount(" ",0,0);
	}
	
	public void depositeAmount()
	{
		System.out.println("Enter Name:");
		sc.nextLine();
		this.s.setAccountHolderName(sc.nextLine());
		System.out.println("Enter deposite amount:");
		this.s.deposite(sc.nextDouble());
	}
	
	public void showRecord()
	{
		System.out.println("-------------------------------------------------");
		System.out.println("All Records Are:");
		System.out.println(s.getAccountHolderName());
		System.out.println(s.balance);
	}
	
	public void withdrawAmount()
	{
		System.out.println("-------------------------------------------------");
		System.out.println("Enter Withdraw Amount:");
		s.withdraw(sc.nextDouble());
	}
	
	public static int menulist()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("0.Exit");
		System.out.println("1.show Details");
		System.out.println("2.Deposit Amount:");
		System.out.println("3.Withdraw Amount:");
		System.out.println("Enter Choice:");
		return sc.nextInt();
		
	}
	
}
