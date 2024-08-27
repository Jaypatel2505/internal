package com.exception;

import java.util.Scanner;

/*
 * ATM:
 * Deposit : 2000
 * Withdraw : 5000
 * If you deposit 3000rs more. You can withdraw 5000rs
 * 
 * Throw:
 * 1. Must use with user defined exception
 * 2. Must inherit exception into some user defined class to make it user defined exception
 * 3. throw is written inside method
 * 4. throw must be followed by "new" keyword and "constructor".
 * 
 * Throws:
 * 1. throws written after method declaration.
 * 2. we can throws user defines as well as system defined exception class.
 * 3. multiple class can be used with throws using ","
 */
class JayException extends Exception{
	double amount;
	public JayException(double amount) {
		this.amount = amount;
	}
}
class ATM{
	double ballance;
	public void deposit(double amount) {
		ballance+=amount;		//	Balance = balance + amount;
		System.out.println("Total ballance is: "+ballance);
	}
	public void withdraw(double amount) throws JayException, ArrayIndexOutOfBoundsException{
		if (amount<=ballance) {
			ballance = amount;
			System.out.println("Amount withdrawn is :"+amount+"rs successfully. Reamining ballance is"+ballance+"rs");
		} else {
			double needs = amount - ballance;
			throw new JayException(needs);
		}
	}
}
public class UserDefinedException {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner scanner = new Scanner(System.in);
		double amount;
		
		System.out.println("Enter the amount to be deposited:");
		amount = scanner.nextDouble();
		
		atm.deposit(amount);
		
		System.out.println("Enter the amount to be withdrawn:");
		amount = scanner.nextDouble();
		
		try {
			atm.withdraw(amount);
		} catch (JayException e) {
			//	e.printStackTrace();
			System.out.println("If you deposite "+e.amount+"rs more you can withdrawn "+amount+"rs");
		}
		//scanner.close(); 			// For handle scanner close warning while definition(Line no : 47)
	}
}
