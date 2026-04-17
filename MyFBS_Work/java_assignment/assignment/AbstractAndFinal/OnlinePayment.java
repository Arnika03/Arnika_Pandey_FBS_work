package com.abc;

abstract class Payment {
	int paymentId;
	double amount;
	String payerName;

	enum Status {
		PENDING, SUCCESS, FAILED
	};

	// Parameterized Constructor
	public Payment(int paymentId, double amount, String payerName) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = Status.PENDING;
	}

	Status status;

	// Normal method
	void printSummary() {
		System.out.println("Payment Id : " + paymentId);
		System.out.println("Amount : " + amount);
		System.out.println("Payer Name : " + payerName);
		System.out.println("Payment Status : " + status);
	}

	// final method
	final void process() {
		if (!validate()) {
			status = Status.FAILED;
			sendNotification();
			return;
		}
		try {
			deductAmount();
			status = Status.SUCCESS;
			sendNotification();
		} catch (Exception e) {
			status = Status.FAILED;
			System.out.println(e.getMessage());
			sendNotification();
		}
	}

	// abstract method
	abstract boolean validate();

	abstract void deductAmount();

	abstract void sendNotification();

}// Payment class ends here

class CardPayment extends Payment {
	String cardNumber;
	String cvv;
	double balance;
	String message;

	public CardPayment(int paymentId, double amount, String payerName, String cardNumber, String cvv, double balance) {
		super(paymentId, amount, payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.balance = balance;
//		this.message = message;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public double getBalance() {
		return balance;
	}

	public String getMessage() {
		return message;
	}

	@Override
	boolean validate() {

		if (cardNumber == null || cardNumber.length() != 16)
			return false;
		if (cvv == null || cvv.length() != 3)
			return false;
		if (amount <= 0)
			return false;
		if (payerName == null || payerName.isEmpty())
			return false;
		return true;

	}

	@Override
	void deductAmount() {

		if (balance < amount) {
			throw new RuntimeException("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Amount deducted : " + amount);
		System.out.println("Remaining balance: " + balance);
	}

	@Override
	void sendNotification() {
		if (status == Status.SUCCESS) {
			message = "Payment of " + amount + " successful for " + payerName;
		} else {
			message = "Payment failed for " + payerName;
		}
		System.out.println("Sending Notification.....");
		System.out.println(message);

	}

	void display(String cvv) {
		System.out.println("Card Number : " + cardNumber);
		System.out.println("CVV : " + cvv);
	}

}// CardPayment class ends here

class UPIPayment extends Payment {
	String upiId;
	double balance;
	String message;

	public UPIPayment(int paymentId, double amount, String payerName, String upiId, double balance) {
		super(paymentId, amount, payerName);
		this.upiId = upiId;
		this.balance = balance;
//		this.message = message;
	}

	public String getUpiId() {
		return upiId;
	}

	public double getBalance() {
		return balance;
	}

	public String getMessage() {
		return message;
	}

	@Override
	boolean validate() {
		if (upiId == null || !upiId.contains("@"))
			return false;
		if (amount < 1 || amount > 100000)
			return false;
		return true;
	}

	@Override
	void deductAmount() {

		if (balance < amount) {
			throw new RuntimeException("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Amount deducted : " + amount);
		System.out.println("Remaining balance: " + balance);
	}

	@Override
	void sendNotification() {
		if (status == Status.SUCCESS) {
			message = "Payment of " + amount + " successful for " + payerName;
		} else {
			message = "Payment failed for " + payerName;
		}
		System.out.println("Sending Notification.....");
		System.out.println(message);

	}

	void display() {
		System.out.println("Upi Id : " + upiId);
	}

}

public class OnlinePayment {

	public static void main(String[] args) {
		Payment p;

		p = new CardPayment(3213, 50000, "Arnika Pandey", "0472369284767465", "334", 500000);
		p.process();
		p.printSummary();

		System.out.println("__________________________________________\n");

		p = new UPIPayment(3424, 80000, "Purti Pandey", "purti@42342", 300000);
		p.process();
		p.printSummary();

		System.out.println("__________________________________________\n");

		p = new CardPayment(568, 200000, "Roohi Sharma", "8129738964612892", "387", 250000);
		p.process();
		p.printSummary();

		System.out.println("__________________________________________\n");

		p = new UPIPayment(4689, 95000, "Rupa Toge", "rupa562348", 342000);
		p.process();
		p.printSummary();

		System.out.println("__________________________________________\n");

		p = new CardPayment(809, 60000, "Avani Pandey", "465878496963", "879", 657000);
		p.process();
		p.printSummary();

		System.out.println("__________________________________________\n");

		p = new UPIPayment(896, 150000, "Ravi Mishra", "ravi@8754", 400000);
		p.process();
		p.printSummary();

		System.out.println("__________________________________________\n");

		p = new CardPayment(6742, 65000, "Payal Tripathi", "547329740956573736529", "67", 458000);
		p.process();
		p.printSummary();

	}

}
