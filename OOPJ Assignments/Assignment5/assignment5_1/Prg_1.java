package org.java.assignment5_1;

public class Prg_1 {
public static void main(String[] args) {
	BankAccountUtil util=new BankAccountUtil();
	int choice;
	//System.out.println("Enter your Choice");
	//util.menulist();
	while((choice=BankAccountUtil.menulist())!=0)
	{
	  switch(choice)
		{
		  case 1:
			   util.showRecord();
			  break;
		  case 2:
			util.depositeAmount();
			break;
		case 3:util.withdrawAmount();
		       break;
		case 0:System.out.println("Exit");
		break;
		}
	}
}
}
