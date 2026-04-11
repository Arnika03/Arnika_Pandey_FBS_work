package com.inheritance;
//inheritance
class Employee{
	
	int id;
	String name;
	double salary;
	
	Employee() {
		
		this.id = 0;
		this.name = "Not Given";
		this.salary = 0.00;
	}
	
	Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	void display()
	{
		System.out.println("EmployeeId = " + this.id);
		System.out.println("Employee Name = " + this.name);
		System.out.println("Employee salary = " + this.salary);
	}
		
	
}

class Admin extends Employee{
	double allowance;
	
	Admin() {
		super();
		this.allowance = 0.00;
	}

	Admin(int id, String name, double salary,double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Admin Allowance = " + this.allowance);
	}
		
	
}

class SalesManager extends Employee{
	
	double incentive;
	double target;
	
	SalesManager() {
		super();
		this.incentive = 0.00;
		this.target = 0.00;
		
	}
	
	SalesManager(int id, String name, double salary ,double incentive,double target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
		
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}
	
	void display() {
		super.display();
		System.out.println("SalesManager Incentive = " + this.incentive);
		System.out.println("SalesManager Target = " + this.target);
	}
	
		
}

class HR extends Employee{
	double commission;

	HR() {
		super();
		this.commission = 0.00;
	}

	HR(int id, String name, double salary,double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		super.display();
		System.out.println("HR Commission = " + this.commission);
	}
		
}



public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(46,"Rupali",20000);
		e1.display();
		
		Admin a1 = new Admin(17,"Rutuja",13000,3000);
		a1.display();
		
		SalesManager sm1 = new SalesManager(201,"Ritu",70000,15000,3000000);
		sm1.display();
		
		HR h1 = new HR(63,"Aaru",30000,5000);
		h1.display();
		
		Admin a2 = new Admin(68,"Purti",45000,9000);
		a2.display();
		
		

	}

}//main ends here
