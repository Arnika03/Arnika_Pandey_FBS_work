package overloading;

class Student {
	int rollNo;
	String name;
	double percentage;

	Student(int rollNo, String name, double percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

}// Student class ends here

class Employee {
	int id;
	String name;
	double annualSalary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.annualSalary = salary;
	}

}// Employee classends here

class Bank {
	// overload method for Student
	void approveLoan(Student s) {
		System.out.println("Student Name : " + s.name);
		if (s.percentage > 80) {
			System.out.println("Loan Ammount : 2,00,000rs");
		} else if (s.percentage >= 60) {
			System.out.println("Loan Ammount : 1,00,000rs");
		} else if (s.percentage >= 40) {
			System.out.println("Loan Ammount : 50,000rs");
		} else {
			System.out.println(" No loan approved");
		}
	}

	// overload method for Employee
	void approveLoan(Employee e) {
		System.out.println("Employee Name : " + e.name);
		if (e.annualSalary > 1200000) {
			System.out.println("Loan Ammount : 7,00,000rs");
		} else if (e.annualSalary >= 1000000) {
			System.out.println("Loan Ammount : 6,00,000rs");
		} else if (e.annualSalary >= 600000) {
			System.out.println("Loan Ammount : 5,00,000rs");
		} else if (e.annualSalary >= 400000) {
			System.out.println("Loan Ammount : 4,00,000rs");
		} else {
			System.out.println(" No loan approved");
		}
	}
}

public class LoanApprovalSystem {

	public static void main(String[] args) {
		// object for Student
		Student s = new Student(07, "Arnika", 73.8);
		// object for Employee
		Employee e = new Employee(56, "Purti", 700000);
		// object for Bank
		Bank b = new Bank();

		b.approveLoan(s);
		b.approveLoan(e);

	}

}
