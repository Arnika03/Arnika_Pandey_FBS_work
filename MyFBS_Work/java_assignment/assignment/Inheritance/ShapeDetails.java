package com.inheritance;

//inheritance
class Shape {
	double area;

	// Default Constructor
	Shape() {
		this.area = 0.00;
	}

	// Parameterized Constructor
	Shape(double area) {
		this.area = area;
	}

	// Getters and Setters
	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}

	// Display Method
	void display() {
		System.out.println("Area :" + area);
	}

}// Shape class ends here

class Circle extends Shape {
	double radius;

	// Default Constructor
	Circle() {
		super();
		this.radius = 0.00;
	}

	// Parameterized Constructor
	Circle(double area, double radius) {
		super(area);
		this.radius = radius;
	}

	// Getters and Setters
	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	// Display Method
	void display() {
		super.display();
		System.out.println("Circle Radius :" + radius);
		System.out.println("*********************************\n");
	}

	// Method overriding
	void calculateArea() {
		area = 3.14 * radius * radius;
	}
}// Circle ends here

class Triangle extends Shape {
	double base;
	double height;

	// Default Constructor
	Triangle() {
		super();
		this.base = 0.00;
		this.height = 0.00;
	}

	// Parameterized Constructor
	Triangle(double area, double base, double height) {
		super(area);
		this.base = base;
		this.height = height;
	}

	// Getters and Setters
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

	// Display Method
	void display() {
		super.display();
		System.out.println("Triangle Base :" + base);
		System.out.println("Triangle Height :" + height);
		System.out.println("*********************************\n");
	}

	// Method overriding
	void calculateArea() {
		area = 3.14 * base * height;
	}

}// Triangle class ends

class Rectangle extends Shape {
	double length;
	double breadth;

	// Default Constructor
	Rectangle() {
		super();
		this.length = 0.00;
		this.breadth = 0.00;
	}

	// Parameterized Constructor
	Rectangle(double area, double length, double breadth) {
		super(area);
		this.length = length;
		this.breadth = breadth;
	}

	// Getters and Setters
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

	// Display Method
	void display() {
		super.display();
		System.out.println("Rectangle Length :" + length);
		System.out.println("Rectangle Breadth :" + breadth);
		System.out.println("*********************************\n");
	}

	// Method overriding
	void calculateArea() {
		area = length * breadth;
	}

}// Rectangle class ends here

//Main starts here
public class ShapeDetails {

	public static void main(String[] args) {

		// Circle
		Circle c1 = new Circle();
		c1.radius = 7.5;
		c1.calculateArea();
		c1.display();
		System.out.println("Circle Area :"+c1.area);

		Triangle t1 = new Triangle();
		t1.base = 10;
		t1.height = 5;
		t1.calculateArea();
		t1.display();
		System.out.println("Triangle Area :"+t1.area);

		Rectangle r1 = new Rectangle();
		r1.length = 7;
		r1.breadth = 15;
		r1.calculateArea();
		r1.display();
		System.out.println("Rectangle Area :"+r1.area);
	}
}
