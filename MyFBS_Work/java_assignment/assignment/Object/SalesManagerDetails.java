package object;

class SalesManager{
	int id;
	String name;
	double salary;
	double incentive;
	double target;
	
	//Default Constructor
	SalesManager() {
		this.id = 21;
		this.name = "Ruchi";
		this.salary = 95000;
		this.incentive = 15000.00;
		this.target = 250000;
	}

	//Parameterized Constructor
	SalesManager(int id, String name, double salary, double incentive, double target) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}

	//getter and Setter
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
	}//getter and Setter ends here
	
	//display method
	void display() {
		System.out.println("SalesManager Id : " + id + "\nSalesManager Name : " + name + "\nSalesManager Salary : " + salary + 
				"\nSalesManager Incentive : " + incentive + "\nSalesManager Target : " + target);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SalesManager [ Id : " + id + "\nName : " + name + "\nSalary : " + salary + "\nIncentive : " 
				+ incentive + "\nTarget : " +target+ "]";
	}
	
}

public class SalesManagerDetails {

	public static void main(String[] args) {
		SalesManager sm1;
		sm1 = new SalesManager();// 1st object
		System.out.println("Display Method output\n");
		sm1.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(sm1);// tostring
		System.out.println(sm1.hashCode());// hashcode

		System.out.println();

		SalesManager sm2 = new SalesManager(07, "Aaru", 65000.00, 7000.00,375000);// 2nd object
		System.out.println("Display Method output\n");
		sm2.display();// display
		System.out.println();
		System.out.println("to string output\n");
		System.out.println(sm2);// tostring
		System.out.println(sm2.hashCode());// hashcode

	

	}

}
