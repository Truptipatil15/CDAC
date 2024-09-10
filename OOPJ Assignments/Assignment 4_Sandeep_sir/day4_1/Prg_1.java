package com.java.day4_1;

import java.util.Scanner;

public class Prg_1 {

	public static void main(String[] args) {
		LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
        Scanner sc = new Scanner(System.in);
        int choice=0;

        do {
            switch (choice) {
                case 1:
                    util.acceptRecord();
                    break;
                case 2:
                    util.printRecord();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while ((choice=LoanAmortizationCalculatorUtil.menuList())!= 0);
    }
        
        
	

}
