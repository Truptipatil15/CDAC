package org.java.assignment5_1;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount() {
		
	}
   public SavingsAccount(String accountHolderName,long accountNumber,double balance) {
	   this.accountHolderName=accountHolderName;
	   this.accountNumber=accountNumber;
	   this.balance=balance;
		
	}
   public void withdraw(double amount)
   {
	   if(getBalance()-amount<100)
       {
	     System.out.println("Minimum balance 100 is required");
      }
   
      else
    	  super.withdraw(amount);
     
     }
   }
   
	

