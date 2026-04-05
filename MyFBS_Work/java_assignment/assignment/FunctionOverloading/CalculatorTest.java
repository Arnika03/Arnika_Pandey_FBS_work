package overloading;

class Calculator {

	// Addition (add function overload)
	void add(int a, int b) {
		System.out.println("Fun 1");
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println("Fun 2");
		System.out.println(a + b);
	}

	void add(int b, double a) {
		System.out.println("Fun 3");
		System.out.println(a + b);
	}

	void add(double b, int a) {
		System.out.println("Fun 4");
		System.out.println(a + b);
	}

	// Substraction (sub Function overload)
	void sub(int a, int b) {
		System.out.println("Fun 1");
		System.out.println(a - b);
	}

	void sub(double a, double b) {
		System.out.println("Fun 2");
		System.out.println(a - b);
	}

	void sub(int b, double a) {
		System.out.println("Fun 3");
		System.out.println(a - b);
	}

	void sub(double b, int a) {
		System.out.println("Fun 4");
		System.out.println(a - b);
	}

	// Multiplication (mul Function overload)
	void mul(int a, int b) {
		System.out.println("Fun 1");
		System.out.println(a * b);
	}

	void mul(double a, double b) {
		System.out.println("Fun 2");
		System.out.println(a * b);
	}

	void mul(int b, double a) {
		System.out.println("Fun 3");
		System.out.println(a * b);
	}

	void mul(double b, int a) {
		System.out.println("Fun 4");
		System.out.println(a * b);
	}

	// Division (div Function overload)
	void div(int a, int b) {
		System.out.println("Fun 1");
		System.out.println(a / b);
	}

	void div(double a, double b) {
		System.out.println("Fun 2");
		System.out.println(a / b);
	}

	void div(int b, double a) {
		System.out.println("Fun 3");
		System.out.println(a / b);
	}

	void div(double b, int a) {
		System.out.println("Fun 4");
		System.out.println(a / b);
	}

}// Calculator class ends here

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		System.out.println("Addition");
		System.out.println("________________________");
		c1.add(10, 13);
		c1.add(23, 16.4);
		c1.add(12.3, 14.7);
		c1.add(21.9, 27);
		System.out.println("________________________");

		System.out.println();

		Calculator c2 = new Calculator();
		System.out.println("Substraction");
		System.out.println("________________________");
		c2.sub(16, 13);
		c2.sub(23, 12.4);
		c2.sub(14.3, 11.3);
		c2.sub(27.9, 21);
		System.out.println("________________________");

		System.out.println();

		Calculator c3 = new Calculator();
		System.out.println("Multiplication");
		System.out.println("________________________");
		c3.mul(12, 3);
		c3.mul(23, 3.4);
		c3.mul(7.3, 4.6);
		c3.mul(2.9, 8.3);
		System.out.println("________________________");
		
		System.out.println();

		Calculator c4 = new Calculator();
		System.out.println("Division");
		System.out.println("________________________");
		c4.div(12, 3);
		c4.div(24, 3.4);
		c4.div(7.3, 14);
		c4.div(20.9, 8.3);
		System.out.println("________________________");

	}

}
