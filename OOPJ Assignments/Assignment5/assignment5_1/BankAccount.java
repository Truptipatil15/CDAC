package org.java.assignment5_1;

public class BankAccount {
	String accountHolderName;
  long accountNumber;
  double balance;
  
  public BankAccount() {
	
}
  public BankAccount(String accountHolderName,long accountNumber,  double balance)
  {
	  this.accountHolderName=accountHolderName;
	  this.accountNumber=accountNumber;
	  this.balance=balance;
  }
  
  public void deposite(double amount)
  {
	  balance+=amount;
  }
  public void withdraw(double amount)
  {
	  balance-=amount;
  }
  
  
  public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

public String getAccountHolderName() {
	return accountHolderName;
  }

public void setBalance(double balance) {
	this.balance = balance;
}
  public double getBalance() {
	return balance;
}
}
