package overloading;

class Shape {
	double area;

	Shape() {
		super();
		this.area = 0.00;
	}

	Shape(double area) {
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}

	void display() {
		System.out.println("Area : " + area);
	}

}// Shape class ends here

class Triangle {
	double base;
	double height;

	Triangle() {
		this.base = 0.00;
		this.height = 0.00;
	}

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	void display() {
		System.out.println("Base : " + base);
		System.out.println("Height : " + height);
	}

}// Triangle class ends here

class Rectangle {
	double length;
	double breadth;

	Rectangle() {
		this.length = 6.5;
		this.breadth = 18;
	}

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	void display() {
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
	}

}// Rectangle class ends here

class Circle {
	double radius;

	Circle() {
		this.radius = 8;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	void display() {
		System.out.println("Radius : " + radius);
	}

}// Circle class end here

class AreaCalculator {

	double calculateArea(Triangle t) {

		double area = (t.getBase() * t.getHeight()) / 2;
		return area;

	}

	double calculateArea(Rectangle r) {

		double area = r.getLength() * r.getBreadth();
		return area;
	}

	double calculateArea(Circle c) {
		double area = 3.14 * c.getRadius() * c.getRadius();
		return area;
	}

}// AreaCalculator class ends here

public class TotalAreaCalculation {

	public static void main(String[] args) {

		// Create Object
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(7);

		Rectangle r = new Rectangle();
		r.setLength(4);
		r.setBreadth(6);

		Circle c = new Circle();
		c.setRadius(4.5);

		// Create AreaCalculator object
		AreaCalculator ac = new AreaCalculator();

		// calculate area using method overloading
		double tArea = ac.calculateArea(t);
		double rArea = ac.calculateArea(r);
		double cArea = ac.calculateArea(c);

		// Display result
		System.out.println("Triangle Details : ");
		t.display();
		System.out.println("Area = " + tArea);

		System.out.println();

		System.out.println("Rectangle Details : ");
		r.display();
		System.out.println("Area = " + rArea);

		System.out.println();

		System.out.println("Circle Details : ");
		c.display();
		System.out.println("Area = " + cArea);

	}

}