package com.abc;

abstract class Employee {

	private int id;
	private String name;
	private double salary;

	//Default Constructor
	Employee() {

		this.id = 101;
		this.name = "Arnika";
		this.salary = 65000.00;
	}

	//Parameterized Constructor
	Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//Display method
	void display() {
		System.out.println("EmployeeId = " + this.id);
		System.out.println("Employee Name = " + this.name);
		System.out.println("Employee salary = " + this.salary);
	}

	abstract double calculateSalary(); 
	
}// Employee ends here

class Admin extends Employee {
	private double allowance;

	//Admin Default Constructor
	Admin() {
		super();
		this.allowance = 12000.00;
	}

	//Admin Parameterized Constructor
	Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	//Admin Getter and Setter
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	//Admin display method
	@Override
	void display() {
		super.display();
		System.out.println("Admin Allowance = " + this.allowance);
	}

	@Override
	double calculateSalary() {
		return getSalary() + getAllowance();
	}

}// Admin class ends here

class SalesManager extends Employee {

	private double incentive;
	private double target;
	
	//SalesManager Default cons
	SalesManager() {
		super();
		this.incentive = 5000.00;
		this.target = 245000;

	}

	//SalesManager Parameterized cons
	SalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;

	}

	//SalesManager Getter and Setter
	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	//SalesManager display method
	@Override
	void display() {
		super.display();
		System.out.println("SalesManager Incentive = " + this.incentive);
		System.out.println("SalesManager Target = " + this.target);
	}

	@Override
	double calculateSalary() {
		return getSalary() + getIncentive();
	}

}// SalesManager ends here

class HR extends Employee {
	private double commission;

	//HR Default Constructor
	HR() {
		super();
		this.commission = 7000.00;
	}

	//HR Parameterized
	HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	//HR Getter and Setter
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	//HR Display Method
	@Override
	void display() {
		super.display();
		System.out.println("HR Commission = " + this.commission);
	}

	@Override
	double calculateSalary() {
		return getSalary() + getCommission();
	}

}// HR class ends here

public class EmployeeDetails {

	public static void main(String[] args) {

		Employee e1;

		e1 = new Admin(17, "Rutuja", 13000, 3000);
		e1.display();

		System.out.println("Total Salary =" + e1.calculateSalary());

		System.out.println();

		e1 = new SalesManager(201, "Ritu", 70000, 15000, 3000000);
		e1.display();

		System.out.println("Total Salary =" + e1.calculateSalary());

		System.out.println();

		e1 = new HR(63, "Aaru", 30000, 5000);
		e1.display();

		System.out.println("Total Salary =" + e1.calculateSalary());

		System.out.println();

		e1 = new Admin(68, "Purti", 45000, 9000);
		e1.display();
		System.out.println("Total Salary =" + e1.calculateSalary());


	}

}// main class ends here
