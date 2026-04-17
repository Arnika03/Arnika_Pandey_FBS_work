package com.abc;

import java.util.Scanner;

abstract class Electricity {
	String customerName;
	double unitConsumed;

	// -------------------Default Constructor--------------------//
	public Electricity() {
		this.customerName = "Arpita";
		this.unitConsumed = 5;
	}

	// -----------------------Parameterized Constructor--------------------//
	public Electricity(String customerName, double unitConsumed) {
		this.customerName = customerName;
		this.unitConsumed = unitConsumed;
	}

	// ---------------Getter & Setter--------------------//
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

	void showUsage() {
		System.out.println("Customer Name : " + getCustomerName());
		System.out.println("Unit Consumed : " + getUnitConsumed());
		System.out.println("__________________________________________\n");

	}

	// --------------------abstract BillCalculation method------------------------//
	abstract double calculateBill();

	final void generateBill() {
		double bill = calculateBill();
		// -- Add 5% tax
		bill = bill + (bill * 0.05);
		// -- Add fixed charge of ₹50
		bill = bill + 50;
		// -- Print the final bill amount
		System.out.println("Final bill amount : " + bill);
	}

}// ElectricityBill class ends here

class ResidentialBill extends Electricity {

	public ResidentialBill(String customerName, double unitConsumed) {
		super(customerName, unitConsumed);
	}

	@Override
	double calculateBill() {
		double bill;

		if (unitConsumed >= 0 && unitConsumed <= 100) {
			bill = unitConsumed * 2.5;
		} else if (unitConsumed <= 300) {
			bill = unitConsumed * 3.5;
		} else {
			bill = unitConsumed * 5;
		}

		if (unitConsumed > 500) {
			bill = bill + 150;
		}
		return bill;
	}

}// ResidentialBill class ends here

class CommercialBill extends Electricity {

	public CommercialBill(String customerName, double unitConsumed) {
		super(customerName, unitConsumed);
	}

	@Override
	double calculateBill() {
		double billCharge = unitConsumed * 6.5;
		double bill = billCharge;

		if (unitConsumed < 200 && bill < 1500) {
			bill = 1500;
		}

		if (unitConsumed > 1000) {
			bill = bill + (billCharge * 0.08);
		}

		return bill;
	}

}// CommercialBill class ends here

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select customer type : ");
		System.out.println("1. Residential");
		System.out.println("2. Commercial");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Customer Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Unit Consumed : ");
		double units = sc.nextDouble();

		Electricity e;

		if (choice == 1) {
			e = new ResidentialBill(name, units);
		} else {
			e = new CommercialBill(name, units);
		}
		e.generateBill();
		sc.close();

	}

}
