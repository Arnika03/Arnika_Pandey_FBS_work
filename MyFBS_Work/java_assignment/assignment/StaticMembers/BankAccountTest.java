package com.statick;

import java.util.Scanner;

class BankAccount {
	int accountNumber;
	String accHolderName;
	double currentBalance;
	static double interestRate;

	// ---------------Static block--------------------//
	static {
		interestRate = 12.3;
	}

	// -------------------Default Constructor--------------------//
	public BankAccount() {
		super();
		this.accountNumber = 101;
		this.accHolderName = "Arnika";
		this.currentBalance = 25000;
	}

	// -----------------------Parameterized Constructor--------------------//
	public BankAccount(int accountNumber, String accHolderName, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.currentBalance = currentBalance;
	}

	// ---------------Gettter & Setter--------------------//
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}

	// ---------------Deposite && Withdraw Method-------------------------//
	void deposite(double amount) {
		currentBalance += amount;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Total amount after deposite : " + currentBalance);
	}

	void withdraw(double amount) {
		if (amount <= currentBalance) {
			currentBalance -= amount;
			System.out.println("Remaining amount after withdraw : " + currentBalance);
		} else {
			System.out.println("Insufficient Balance!!!");
		}
	}

	// --------------------Display method------------------------//
	void display() {
		
		System.out.println("Bank Account Number : " + getAccountNumber());
		System.out.println("Account holder Name : " + getAccHolderName());
		System.out.println("Current Balance : " + getCurrentBalance());
		System.out.println("Interest Rate : " + BankAccount.getInterestRate());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++\n");

	}

}// BankAccount class ends here

public class BankAccountTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount(102, "Ruchi", 30000);
		b1.deposite(2000);
		b1.withdraw(10000);
		b1.display();


		BankAccount b2 = new BankAccount(103, "Prachi", 32000);
		b2.deposite(2000);
		b2.withdraw(35000);
		b2.display();
		sc.close();

	}

}// BankAccountTest class ends here
