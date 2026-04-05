package object;

class HR {
	int id;
	String name;
	double salary;
	double commission;

	// Default Constructor
	HR() {
		this.id = 14;
		this.name = "Muskan";
		this.salary = 45000.00;
		this.commission = 5000.00;
	}

	// Parameterized Constructor
	HR(int id, String name, double salary, double commission) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
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

	public double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}// Getter and Setter ends here

	// display method
	void display() {
		System.out.println("HR Id : " + id + "\nHR Name : " + name + "\nHR Salary : " + salary + "\nHR Commission : "
				+ commission);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HR [ Id : " + id + "\nName : " + name + "\nSalary : " + salary + "\nCommission : " + commission + "]";
	}

}//HR class ends here

public class HRDetails {

	public static void main(String[] args) {
		HR h1;
		h1 = new HR();// 1st object
		System.out.println("Display Method output\n");
		h1.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(h1);// tostring
		System.out.println(h1.hashCode());// hashcode

		System.out.println();

		HR h2 = new HR(07, "Aaru", 65000.00, 7000.00);// 2nd object
		System.out.println("Display Method output\n");
		h2.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(h2);// tostring
		System.out.println(h2.hashCode());// hashcode

	}

}//main class ends here
