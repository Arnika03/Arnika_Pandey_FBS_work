package com.inheritance;

class BankAccount{
	long accountNumber;
	String accountHolderName;
	double balance;
	
	//Default Constructor
	public BankAccount() {
		this.accountNumber = 0L;
		this.accountHolderName = "Not Given";
		this.balance = 0.00;
	}
	
	//Parameterized Constructor
	public BankAccount(long accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	//Getter && Setter
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Display Maethod
	void display() {
		System.out.println("Accpount Number : " +getAccountNumber());
		System.out.println("Account Holder Name : " +getAccountHolderName());
		System.out.println("Balance : "+getBalance());
	}
}//BankAccount class ends here

class SavingAccount extends BankAccount{
	double interestRate;
	double minimumBalance;
	double withdrawalLimit;
	
	//SavingAccount Default Constructor
	public SavingAccount() {
		super();
		this.interestRate = 0.00;
		this.minimumBalance = 0.00;
		this.withdrawalLimit = 0.00;
	}
	
	//SavingAccount Parameterized Constructor
	public SavingAccount(long accountNumber, String accountHolderName, double balance, double interestRate, double minimumBalance, double withdrawalLimit) {
		super(accountNumber, accountHolderName, balance );
		this.interestRate = interestRate;
		this.minimumBalance = minimumBalance;
		this.withdrawalLimit = withdrawalLimit;
	}
	
	//SavingAccount Getter && Setter
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public double getWithdrawalLimit() {
		return withdrawalLimit;
	}
	public void setWithdrawalLimit(double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}	

	//SavingAccount Display Maethod
	void display() {
		super.display();
		System.out.println("Interest Rate : " +getInterestRate());
		System.out.println("Minimum Balance : " +getMinimumBalance());
		System.out.println("Withdrawal Limit : "+getWithdrawalLimit());
		System.out.println("*************************************\n");
	}
	
}//SavingsAccount class ends here

class CurrentAccount extends BankAccount{
	double overdraftLimit;
	String businessType;
	double transactionLimit;
	
	//CurrentAccount Default Counstructor
	public CurrentAccount() {
		super();
		this.overdraftLimit = 0.00;
		this.businessType = "Not Given";
		this.transactionLimit = 0.00;
	}
	
	//CurrentAccount Parameterized Constructor 
	public CurrentAccount(long accountNumber, String accountHolderName, double balance, double overdraftLimit, String businessType, double transactionLimit) {
		super(accountNumber, accountHolderName, balance );
		this.overdraftLimit = overdraftLimit;
		this.businessType = businessType;
		this.transactionLimit = transactionLimit;
	}
	
	//CurrenyAccount Getter && Setter
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public double getTransactionLimit() {
		return transactionLimit;
	}
	public void setTransactionLimit(double transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
	
	//CurrentAccount Display Maethod
	void display() {
		super.display();
		System.out.println("Overdraft Limit : " +getOverdraftLimit());
		System.out.println("Business Type : " +getBusinessType());
		System.out.println("Transaction Limit : "+getTransactionLimit());
		System.out.println("*************************************\n");
	}	
}//CurrentAccount class ends here

class FixedDepositAccount extends BankAccount{
	double depositAmount;
	double interestRate;
	int tenure;
	
	//FixedDepositeAccount Default Constructor
	public FixedDepositAccount() {
		super();
		this.depositAmount = 0.00;
		this.interestRate = 0.00;
		this.tenure = 0;
	}
	
	//FixedDepositeAccount Parameterized Constructor
	public FixedDepositAccount(long accountNumber, String accountHolderName, double balance, double depositAmount, double interestRate, int tenure) {
		super(accountNumber, accountHolderName, balance);
		this.depositAmount = depositAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
	}
	
	//FixedDepositeAccount Getter && Setter
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	//FixedDepositeAccount Display Maethod
	void display() {
		super.display();
		System.out.println("DepositAmount : " +getDepositAmount());
		System.out.println("Interest Rate : " +getInterestRate());
		System.out.println("Tenure : "+getTenure());
		System.out.println("*************************************\n");
	}		
	
}//FixedDepositAccount class ends here

public class BankDetails {

	public static void main(String[] args) {
		SavingAccount sa1 = new SavingAccount(12345678901L, "Arnika Pandey", 25000.0, 3.5, 1000.0, 50000.0);
		sa1.display();
		
		CurrentAccount ca1 = new CurrentAccount(98765432101L, "ABC Enterprises", 100000.0, 50000.0, "Retail", 200000.0);
		ca1.display();
		
		FixedDepositAccount fda1 = new FixedDepositAccount(45678912301L, "Purti Pandey", 0.0, 100000.0, 6.5, 5 );
		fda1.display();
		
	}

}//main ends here
