package object;

class Date {
	int day, month, year;
	String dow;

	// Default Constructor
	Date() {
		this.day = 02;
		this.month = 02;
		this.year = 2002;
		this.dow = "Saturday";
	}

	// Parameterized Constructor
	Date(int day, int month, int year, String dow) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow = dow;
	}

	// Getter and Setter
	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	String getDOW() {
		return dow;
	}

	void setDOW(String dow) {
		this.dow = dow;
	}// Getter and Setter ends here

	// Display Method
//	void display() {
//		System.out.println("Day :" + day);
//		System.out.println("Month :" + month);
//		System.out.println("Year :" + year);
//		System.out.println("DOW :" + dow);
//	}

	// Tostring method
	@Override
	public String toString() {
		
		return "Date ="  +day+ "/" +month+ "/" +year+ "   \nDayOfWeek = "+dow; 
	}

}//Date class ends here

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(03, 03, 2002, "Wednesday");//object 1st
//		d1.display();
		System.out.println(d1);//tostring
		Date d2 = new Date();//object 2nd
//		d2.display();
		System.out.println(d2);//tostring
		System.out.println(d1.hashCode());// HashCode printing object 1st
		System.out.println(d2.hashCode());// HashCode printing object 2nd

	}

}//main class ends here
