package com.abc;

import java.util.Scanner;

abstract class InsurancePolicy {
	String policyHolderName;
	double basePremium;

	public InsurancePolicy(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}// Parameterized Constructor

	abstract double calculatePremium();

	void printPolicyDetails() {
		System.out.println("\n----- Policy Details -----");
		System.out.println("Policy Holder Name" + policyHolderName);
		System.out.println("Base Premium : " + basePremium);
		System.out.println("Final Premum : " + calculatePremium());
		System.out.println("--------------------------");

	}

}// InsurancePolicy class ends here

class CarInsurance extends InsurancePolicy {
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;

	public CarInsurance(String policyHolderName, double basePremium, int carAgeInYears, boolean hadAccidentInLastYear,
			double carValue) {
		super(policyHolderName, basePremium);
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}// Parameterized Constructor

	@Override
	double calculatePremium() {
		double premium = basePremium;
		// Age Based
		if (carAgeInYears <= 3) {
			premium += premium * 0.1;
		} else if (carAgeInYears <= 7) {
			premium += premium * 0.2;
		} else {
			premium += premium * 0.3;
		}
		// AccidentBased
		if (hadAccidentInLastYear) {
			premium += premium * 0.25;
		} else {
			premium -= premium * 0.1;
		}
		// High value condition
		if (carValue > 1000000) {
			premium += 2000;
		}
		return premium;

	}

}// CarInsurance class ends here

class HealthInsurance extends InsurancePolicy {
	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;

	public HealthInsurance(String policyHolderName, double basePremium, int age, boolean isSmoker,
			boolean hasPreExistingDisease) {
		super(policyHolderName, basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}// Parameterized Constructor

	@Override
	double calculatePremium() {
		double primeum = basePremium;
		if (age < 30) {
			primeum += primeum * 0.1;
		} else if (age <= 45) {
			primeum += primeum * 0.25;
		} else {
			primeum += primeum * 0.4;
		}
		// AccidentBased
		if (isSmoker) {
			primeum += primeum * 0.3;
		} else {
			primeum -= primeum * 0.05;
		}
		// High value condition
		if (hasPreExistingDisease) {
			primeum += primeum * 0.2;
		}
		return primeum;
	}

}// HealthInsurance class ends here

public class InsurancePremiumCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select policy type : ");
		System.out.println("1. Car Insurance");
		System.out.println("2. Health Insurance");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Policy Holder Name : ");
		String name = sc.nextLine();
		System.out.println("Base Premium : ");
		double premium = sc.nextDouble();

		InsurancePolicy i;

		if (choice == 1) {
			System.out.println("Car Age InYears : ");
			int carAge = sc.nextInt();
			sc.nextLine();
			System.out.println("Had Accident In Last Year (true/false) : ");
			boolean accident = sc.nextBoolean();
			System.out.println("Car Value : ");
			double value = sc.nextDouble();

			i = new CarInsurance(name, premium, carAge, accident, value);

		} else if (choice == 2) {
			System.out.println("Age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Is Smoker (true/false) : ");
			boolean smoker = sc.nextBoolean();
			System.out.println("Has Pre Existing Disease (true/false): ");
			boolean disease = sc.nextBoolean();

			i = new HealthInsurance(name, premium, age, smoker, disease);

		} else {
			System.out.println("Invalid Choice!!!");
			sc.close();
			return;
		}

		i.printPolicyDetails();
		sc.close();
	}

}
