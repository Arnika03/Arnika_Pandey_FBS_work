package com.statick;

class Employee {
	int id;
	String name;
	double basicSalary;
	static double bonusRate;

	// Static block
	static {
		bonusRate = 10;
	}

	// Default Constructor
	public Employee() {
		this.id = 01;
		this.name = "Arnika";
		this.basicSalary = 75000.00;
	}

	// Parameterized Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.basicSalary = salary;
	}

	// Getter and Setter
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return basicSalary;
	}

	void setSalary(double salary) {
		this.basicSalary = salary;
	}

	// TotalSalaryCalculation method
	double calculateEMpSalary() {
		return basicSalary + (basicSalary * bonusRate / 100);
	}

	// UpdateBonusRate method
	static void updateBonusRate(double newbonusRate) {
		bonusRate = newbonusRate;
	}

	// display method
	void display() {
		System.out.println("Employee Id : " + getId() + "\nEmployee Name : " + getName() + "\nEmployee Salary : "
				+ getSalary() + "\nTotal Salary : " + calculateEMpSalary());
		System.out.println("------------------------------");
	}

}

public class SalaryCalculation {

	public static void main(String[] args) {

		System.out.println("Before Updation ->\n");
		Employee e1 = new Employee(101, "Arnika", 75000);
		e1.display();
		Employee e2 = new Employee(102, "Ritika", 45000);
		e2.display();

		System.out.println("\nAfter Updation ->\n");
		Employee.updateBonusRate(15);
		e1.display();
		e2.display();

	}

}
