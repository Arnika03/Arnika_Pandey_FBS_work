package overloading;

class Shapes {
	double area;

	Shapes() {
		super();
		this.area = 0.00;
	}

	Shapes(double area) {
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

class Triangles extends Shapes {
	double base;
	double height;

	Triangles() {
		super();
		this.base = 0.00;
		this.height = 0.00;
	}

	Triangles(double area, double base, double height) {
		super(area);
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
		super.display();
		System.out.println("Base : " + base);
		System.out.println("Height : " + height);
	}

}// Triangle class ends here

class Rectangles extends Shapes {
	double length;
	double breadth;

	Rectangles() {
		super();
		this.length = 6.5;
		this.breadth = 18;
	}

	Rectangles(double area, double length, double breadth) {
		super(area);
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

//	void display() {
//		super.display();
//		System.out.println("Length : " + length);
//		System.out.println("Breadth : " + breadth);
//	}

}// Rectangle class ends here

class Circles extends Shapes {
	double radius;

	Circles() {
		super();
		this.radius = 8;
	}

	Circles(double area, double radius) {
		super(area);
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	void display() {
		super.display();
		System.out.println("Radius : " + radius);
	}

}// Circle class end here

class AreaCalculation {

	void calculateArea(Triangles t) {

		double area = (t.getBase() * t.getHeight()) / 2;
		t.setArea(area);

	}

	void calculateArea(Rectangles r) {

		double area = r.getLength() * r.getBreadth();
		r.setArea(area);
	}

	void calculateArea(Circles c) {
		double area = 3.14 * c.getRadius() * c.getRadius();
		c.setArea(area);
	}

}// AreaCalculator class ends here


public class AreaCalculationWithInterface {

	public static void main(String[] args) {
		// Create Object
				Triangles t = new Triangles();
				t.setBase(5);
				t.setHeight(7);

				Rectangles r = new Rectangles();
				r.setLength(4);
				r.setBreadth(6);

				Circles c = new Circles();
				c.setRadius(4.5);

				// Create AreaCalculator object
				AreaCalculation ac = new AreaCalculation();

				// calculate area using method overloading
				ac.calculateArea(t);
				ac.calculateArea(r);
				ac.calculateArea(c);

				// Display result
				System.out.println("Triangle Details : ");
				t.display();
				
				System.out.println();

				System.out.println("Rectangle Details : ");
				r.display();
				
				System.out.println();

				System.out.println("Circle Details : ");
				c.display();


	}

}
