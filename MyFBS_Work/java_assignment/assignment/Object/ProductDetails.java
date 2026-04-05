package object;

class Product {
	int pId;
	String pName;
	double pPrice;

	// Parameterized Constructor
	Product(int pId, String pName, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	// Getter & Setter
	int getpId() {
		return pId;
	}

	void setpId(int pId) {
		this.pId = pId;
	}

	String getpName() {
		return pName;
	}

	void setpName(String pName) {
		this.pName = pName;
	}

	double getpPrice() {
		return pPrice;
	}

	void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}// Getter & Setter ends here

	// display method
	void display() {
		System.out.println("Product Details  \n****************************\nProductId = " + pId + "\nProductName = "
				+ pName + "\nProductPrice =" + pPrice + "\n****************************");
	}

	@Override
	public String toString() {
		return "Product Details  \n------------------------------\nProductId = " + pId + "\nProductName = " + pName
				+ "\nProductPrice =" + pPrice + "\n------------------------------";
	}

}

public class ProductDetails {

	public static void main(String[] args) {
		Product p1 = new Product(35, "Laptop", 85000.00);
		p1.display();
		System.out.println(p1.hashCode());

		System.out.println();

		Product p2 = new Product(43, "DeskTop", 65000);
		System.out.println(p2);
		System.out.println(p1.hashCode());

	}

}
