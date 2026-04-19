package p2;

import p1.Employee;

public class HR extends Employee {
	private double commission;

	public HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCommission : " + getCommission();
	}

	public double calSal() {

		return getSalary() + getCommission();
	}

}// HR class ends here
