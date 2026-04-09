package com.statick;

class ElectricityBill {
	// instance attributesm( different for all customers)
	int customerId;
	String customerName;
	double unitConsumed;
	// static attribute(same for all customers)
	static double electricityRatePerUnit;

	// ---------------Static block--------------------//
	static {
		electricityRatePerUnit = 7.5;
	}

	// -------------------Default Constructor--------------------//
	public ElectricityBill() {
		this.customerId = 201;
		this.customerName = "Arpita";
		this.unitConsumed = 5;
	}

	// -----------------------Parameterized Constructor--------------------//
	public ElectricityBill(int customerId, String customerName, double unitConsumed) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.unitConsumed = unitConsumed;
	}

	// ---------------Gettter & Setter--------------------//
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(double unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public static double getElectricityRatePerUnit() {
		return electricityRatePerUnit;
	}

	public static void setElectricityRatePerUnit(double electricityRatePerUnit) {
		ElectricityBill.electricityRatePerUnit = electricityRatePerUnit;
	}

	// --------------------BillCalculation method------------------------//
	double calculateBillAmount() {
		return unitConsumed * electricityRatePerUnit;
	}

	// --------------------Display method------------------------//
	void display() {
		System.out.println("Customer Id : " + getCustomerId());
		System.out.println("Customer Name : " + getCustomerName());
		System.out.println("Unit Consumed : " + getUnitConsumed());
		System.out.println("Electricity Rate Per Unit : " + getElectricityRatePerUnit());
		System.out.println("Bill Amount : " +calculateBillAmount());
		System.out.println("__________________________________________\n");

	}

}// ElectricityBill class ends here

public class ElectricityBillCalculation {

	public static void main(String[] args) {
		ElectricityBill b1 = new ElectricityBill();
		b1.display();

		ElectricityBill b2 = new ElectricityBill(101, "Roohi", 13);
		b2.display();

	}

}// main class ends here
