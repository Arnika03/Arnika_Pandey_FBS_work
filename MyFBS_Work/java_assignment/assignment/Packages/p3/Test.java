package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;


public class Test {

	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
		employee[0] = new HR(63, "Aaru", 30000, 5000);
		employee[1] = new SalesManager(201, "Ritu", 70000, 15000, 3000000);
		employee[2] = new Admin(68, "Purti", 45000, 9000);
		employee[3] = new HR(65, "Roohi", 40000, 7000);
		employee[4] = new Admin(17, "Rutuja", 13000, 3000);
		
		for(Employee e : employee){
			System.out.println(e); //toString
			System.out.println("Calculated Salary : " + e.calSal());
			System.out.println("-------------------------------");
		}
	}
}
