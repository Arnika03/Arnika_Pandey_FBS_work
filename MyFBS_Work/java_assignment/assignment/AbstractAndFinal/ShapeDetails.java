package com.abc;

abstract class Shape {

	// Abstract Method overriding
	abstract double calculateArea();

	abstract void draw();

	// Display Method
	void display() {
		System.out.println("Area :" + calculateArea());
	}

}// Shape class ends here

class Circle extends Shape {
	private double radius;

	// Default Constructor
	Circle() {
		super();
		this.radius = 0.00;
	}

	// Parameterized Constructor
	Circle(double radius) {
		super();
		this.radius = radius;
	}

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	double calculateArea() {
		return Math.PI * getRadius() * getRadius();
	}

	// Display Method
	void display() {
		System.out.println("============Circle==========");
		super.display();
		System.out.println("Circle Radius :" + radius);

	}

	// Method overriding

}// Circle ends here

class Triangle extends Shape {
	private double base;
	private double height;

	// Default Constructor
	Triangle() {
		super();
		this.base = 0.00;
		this.height = 0.00;
	}

	// Parameterized Constructor
	Triangle(double base, double height) {
		super();
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

	// Method overriding

	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}

	@Override
	double calculateArea() {
		return 0.5 * getBase() * getHeight();
	}

	// Display Method
	void display() {
		System.out.println("============Triangle==========");
		super.display();
		System.out.println("Triangle Base :" + base);
		System.out.println("Triangle Height :" + height);

	}

}// Triangle class ends

class Rectangle extends Shape {
	private double length;
	private double breadth;

	// Default Constructor
	Rectangle() {
		super();
		this.length = 0.00;
		this.breadth = 0.00;
	}

	// Parameterized Constructor
	Rectangle(double length, double breadth) {
		super();
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

	// Method overriding

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	double calculateArea() {
		return getLength() * getBreadth();
	}

	// Display Method
	void display() {
		System.out.println("============Rectangle==========");
		super.display();
		System.out.println("Rectangle Length :" + length);
		System.out.println("Rectangle Breadth :" + breadth);

	}

}// Rectangle class ends here

public class ShapeDetails {

	public static void main(String[] args) {

		Shape s1;

		Circle c = new Circle();
		c.setRadius(7.5);
		s1 = c;
		s1.display();
		s1.draw();

		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(5);
		s1 = t;
		s1.display();
		s1.draw();

		Rectangle r = new Rectangle();
		r.setLength(7);
		r.setBreadth(15);
		s1 = r;
		s1.display();
		s1.draw();

	}
}// Main starts here
