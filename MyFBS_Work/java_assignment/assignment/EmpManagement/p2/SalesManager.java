package p2;

import p1.Employee;

public class SalesManager extends Employee {

	private double incentive;
	private double target;

	public SalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;

	}

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

	@Override
	public String toString() {

		return super.toString() + "\nIncentive : " + getIncentive() + "\nTarget : " + getTarget();
	}

	@Override
	public double calSal() {

		if (target > 200000) {
			return getSalary() + getIncentive() + 2000;
		} else {
			return getSalary() + getIncentive();
		}
	}

}// SalesManager ends here
