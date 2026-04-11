package com.inheritance;

class Appliance {
	String brand;
	double powerConsumption;
	int warrantyYears;

	// Default Constructor
	public Appliance() {
		this.brand = "Not Given";
		this.powerConsumption = 0.00;
		this.warrantyYears = 0;
	}

	// Parameterized Constructor
	public Appliance(String brand, double powerConsumption, int warrantyYears) {
		super();
		this.brand = brand;
		this.powerConsumption = powerConsumption;
		this.warrantyYears = warrantyYears;
	}

	// Getter && Setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}

	// Display Method
	void display() {
		System.out.println("Appliance Brand : " + getBrand());
		System.out.println("Power Consumption : " + getPowerConsumption());
		System.out.println("Warranty Years : " + getWarrantyYears());
	}

}// Appliance class ends here

class Refrigerator extends Appliance {
	double capacity;
	boolean hasFreezer;
	String doorType;

	// Refrigerator Default Cons
	public Refrigerator() {
		this.capacity = 0.00;
		this.hasFreezer = false;
		this.doorType = "Not Given";
	}

	// Refrigerator Para Cons
	public Refrigerator(String brand, double powerConsumption, int warrantyYears, double capacity, boolean hasFreezer,
			String doorType) {
		super(brand, powerConsumption, warrantyYears);
		this.capacity = capacity;
		this.hasFreezer = hasFreezer;
		this.doorType = doorType;
	}

	// Refrigerator Getter && Setter
	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean isHasFreezer() {
		return hasFreezer;
	}

	public void setHasFreezer(boolean hasFreezer) {
		this.hasFreezer = hasFreezer;
	}

	public String getDoorType() {
		return doorType;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}

	// Refrigerator Display Method
	void display() {
		super.display();
		System.out.println("Capacity : " + getCapacity());
		System.out.println("Freezer : " + isHasFreezer());
		System.out.println("Door Type : " + getDoorType());
		System.out.println("****************************\n");
	}

}// Refrigerator class ends here

class WashingMachine extends Appliance {
	String loadType;
	double drumSize;
	int spinSpeed;

	// WashingMachine Default Constructor
	public WashingMachine() {
		super();
		this.loadType = "Not Given";
		this.drumSize = 0.00;
		this.spinSpeed = 0;
	}

	// WashingMachine Para Constructor
	public WashingMachine(String brand, double powerConsumption, int warrantyYears, String loadType, double drumSize,
			int spinSpeed) {
		super(brand, powerConsumption, warrantyYears);
		this.loadType = loadType;
		this.drumSize = drumSize;
		this.spinSpeed = spinSpeed;
	}

	// WashingMachine Getter && Setter
	public String getLoadType() {
		return loadType;
	}

	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	public double getDrumSize() {
		return drumSize;
	}

	public void setDrumSize(double drumSize) {
		this.drumSize = drumSize;
	}

	public int getSpinSpeed() {
		return spinSpeed;
	}

	public void setSpinSpeed(int spinSpeed) {
		this.spinSpeed = spinSpeed;
	}

	// Refrigerator Display Method
	void display() {
		super.display();
		System.out.println("Load Type : " + getLoadType());
		System.out.println("Drum Size : " + getDrumSize());
		System.out.println("Spin Speed : " + getSpinSpeed());
		System.out.println("****************************\n");
	}

}// WashingMachine class ends here

class Microwave extends Appliance {
	double capacity;
	boolean hasGrill;
	String controlType;

	// Microwave Default Cons
	public Microwave() {
		super();
		this.capacity = 0.00;
		this.hasGrill = false;
		this.controlType = "Not Given";
	}

	// Microwave Para Cons
	public Microwave(String brand, double powerConsumption, int warrantyYears, double capacity, boolean hasGrill,
			String controlType) {
		super(brand, powerConsumption, warrantyYears);
		this.capacity = capacity;
		this.hasGrill = hasGrill;
		this.controlType = controlType;
	}

	//// Microwave Getter && Setter
	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean isHasGrill() {
		return hasGrill;
	}

	public void setHasGrill(boolean hasGrill) {
		this.hasGrill = hasGrill;
	}

	public String getControlType() {
		return controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	// Microwave Display Method
	void display() {
		super.display();
		System.out.println("Capacity : " + getCapacity());
		System.out.println("Grill : " + isHasGrill());
		System.out.println("Controll Type : " + getControlType());
		System.out.println("****************************\n");
	}

}// Microwave class ends here

public class ApplianceDetails {

	public static void main(String[] args) {
		Refrigerator r1 = new Refrigerator("Samsung", 150.0, 5, 253.0, true, "Double Door");
		r1.display();

		WashingMachine w1 = new WashingMachine("LG", 500.0, 2, "Front Load", 7.0, 1200);
		w1.display();

		Microwave m1 = new Microwave("IFB", 1200.0, 1, 25.0, true, "Touch Control");
		m1.display();

	}

}// main class ends here
