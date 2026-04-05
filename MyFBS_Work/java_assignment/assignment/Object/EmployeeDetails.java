package object;

class Employee {
	int id;
	String name;
	double salary;

	// Default Constructor
	public Employee() {
		this.id = 01;
		this.name = "Arnika";
		this.salary = 75000.00;
	}

	// Parameterized Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	//display method
	void display() {
		System.out.println("Employee Id : " + id + "\nEmployee Name : " + name + "\nEmployee Salary : " + salary);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [ Id : " + id + "\nName : " + name + "\nSalary : " + salary + "]";
	}

}//Employee class ends here

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1;
		e1 = new Employee();// 1st object
		System.out.println("Display Method output\n");
		e1.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(e1);// tostring
		System.out.println(e1.hashCode());// hashcode

		System.out.println();

		Employee e2 = new Employee(07, "Aaru", 65000.00);// 2nd object
		System.out.println("Display Method output\n");
		e2.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(e2);// tostring
		System.out.println(e2.hashCode());// hashcode

	}

}//main class ends here
