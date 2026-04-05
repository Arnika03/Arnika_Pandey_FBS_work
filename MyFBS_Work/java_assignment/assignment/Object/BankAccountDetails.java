package object;

class BankAccount {
	int accountNumber;
	String holderName;
	double currentBalance;
	double interestRate;

	// Default Constructor
	BankAccount() {

	}

	// parameterized Constructor
	BankAccount(int accountNumber, String holderName, double currentBalance, double interestRate) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.currentBalance = currentBalance;
		this.interestRate = interestRate;
	}

	// Getter and Setter
	int getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getHolderName() {
		return holderName;
	}

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	double getCurrentBalance() {
		return currentBalance;
	}

	void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}// Getter and setter ends here

	// display method
	void display() {
		System.out.println("Account Number : " + accountNumber + "\nHolderName : " + holderName + "\nCurrent Balance : "
				+ currentBalance + "\nInterest Rate : " + interestRate);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BankAccount Information \n[Account Number : " + accountNumber + "\nHolderName : " + holderName
				+ "\nCurrent Balance : " + currentBalance + "\nInterest Rate : " + interestRate + "]";
	}

}//BankAccount class ends here

public class BankAccountDetails {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount(101, "Purti", 50000, 5.5);
		b1.display();
		System.out.println();
		System.out.println(b1);
		System.out.println(b1.hashCode());
		
		

	}

}//main class ends here
