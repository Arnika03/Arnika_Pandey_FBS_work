package com.statick;

class LibraryUser {
	String userName;
	int daysLate;
	static double finePerDay;

	// -------------------------Static Block------------------------//
	static {
		finePerDay = 5;
	}

	// -------------------------Default Constructor------------------------//
	public LibraryUser() {
		this.userName = "Sanju";
		this.daysLate = 3;
	}

	// -------------------------Parameterized Constructor------------------------//
	public LibraryUser(String userName, int daysLate) {
		this.userName = userName;
		this.daysLate = daysLate;
	}

	// -------------------------Getter and Setter------------------------//
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getDaysLate() {
		return daysLate;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}

	public static double getFinePerDay() {
		return finePerDay;
	}

	public static void setFinePerDay(double finePerDay) {
		LibraryUser.finePerDay = finePerDay;
	}

	// -------------------------Fine calculation method------------------------//
	double calculateTotalFine() {
		return daysLate * finePerDay;
	}

	// -------------------------Display Method------------------------//
	void display() {
		System.out.println("User Name : " + getUserName());
		System.out.println("Days Late : " + getDaysLate());
		System.out.println("Fine Per Day : " + getFinePerDay());
		System.out.println("Total Fine : " + calculateTotalFine());
		System.out.println("-----------------------");

	}

}//LibraryUser class ends here

public class LibraryFineCalculation {

	public static void main(String[] args) {
		LibraryUser l1 = new LibraryUser();
		l1.display();

		LibraryUser l2 = new LibraryUser("raha", 6);
		l2.display();

	}

}//main class ends here
