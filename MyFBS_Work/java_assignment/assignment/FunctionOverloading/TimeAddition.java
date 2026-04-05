package overloading;

class Time {
	int hr, min, sec;

	// Parameterized Constructor
	public Time(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	// method to display time in this formate
	void display() {
		System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
	}

	Time add(Time t1, Time t2) {
		int sec = t1.sec + t2.sec;
		int carryMin = sec / 60;
		sec = sec % 60;

		int min = t1.min + t2.min + carryMin;
		int carryHr = min / 60;
		min = min % 60;

		int hr = t1.hr + t2.hr + carryHr;
		hr = hr % 24;

		return new Time(hr, min, sec);
		
		//More Optimize way
//		int sec = this.sec + t.sec;
//		int carryMin = sec / 60;
//		sec = sec % 60;
//
//		int min = this.min + t.min + carryMin;
//		int carryHr = min / 60;
//		min = min % 60;
//
//		int hr = this.hr + t.hr+ carryHr;
//		hr = hr % 24;
//
//		return new Time(hr, min, sec);

	}

	Time add(Time t, int hours) {
		int hr = t.hr + hours;
		hr = hr % 24;

		return new Time(hr, t.min, t.sec);
	}

}// Time class ends here

public class TimeAddition {

	public static void main(String[] args) {

		Time t1 = new Time(05, 45, 32);
		Time t2 = new Time(12, 57, 48);

		System.out.println("Time 1 : ");
		t1.display();

		System.out.println("Time 2 : ");
		t2.display();

		////1st method
		Time result = new Time(0, 0, 0);
		result = result.add(t1,t2);
		System.out.println("1st Method After adding two timing : ");

		result.display();
		
		
		//Part of more Optimize way
//		Time result = t1.add(t2);
//		System.out.println("1st Method After adding two timing : ");
//
//		result.display();
		
		//2nd method
		Time result1 = new Time(0, 0, 0);
		result1 = t1.add(t1, 5);
		System.out.println("2nd Method After adding hours : ");
		
		result1.display();
		

	}

}//main class ends here
