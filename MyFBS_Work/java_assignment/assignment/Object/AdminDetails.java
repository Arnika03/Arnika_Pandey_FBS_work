package object;

class Admin{
	int id;
	String name;
	double salary;
	double allowance;
	
	//Default Constructor
	public Admin() {
		this.id = 12;
		this.name = "Prachi";
		this.salary = 62000;
		this.allowance = 10000;
	}

	//Parameterized Constructor
	public Admin(int id, String name, double salary, double allowance) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}

	//Getter and setter
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

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}//Getter and setter ends here
	
	//display method
		void display() {
			System.out.println("Admin Id : " + id + "\nAdmin Name : " + name + "\nAdmin Salary : " + salary + "\nAdmin Allowance : " + allowance);
		}

		@Override
		public String toString() {
			return "Admin [ Id : " + id + "\nName : " + name + "\nSalary : " + salary + "\nAllowance : " +allowance + "]";
		}
	
}

public class AdminDetails {

	public static void main(String[] args) {
		Admin a1;
		a1 = new Admin();// 1st object
		System.out.println("Display Method output\n");
		a1.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(a1);// tostring
		System.out.println(a1.hashCode());// hashcode

		System.out.println();

		Admin a2 = new Admin(07, "Advit", 65000.00, 7000.00);// 2nd object
		System.out.println("Display Method output\n");
		a2.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(a2);// tostring
		System.out.println(a2.hashCode());// hashcode


	}

}
