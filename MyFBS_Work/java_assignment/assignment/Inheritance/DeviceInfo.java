package com.inheritance;

class Device {
	String brand;
	String model;
	double price;

	// Default Constructor
	public Device() {
		this.brand = "Not Given";
		this.model = "Not Given";
		this.price = 0.00;
	}

	// Parameterized Constructor
	public Device(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	// Getter && Setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Display Method
	void display() {
		System.out.println("Brand : " + getBrand());
		System.out.println("Model : " + getModel());
		System.out.println("Price : " + getPrice());
	}
}// Device class ends here

class Laptop extends Device {
	int ram;
	String processor;
	int batteryLife;

	// Laptop Default Constructor
	public Laptop() {
		super();
		this.ram = 0;
		this.processor = "Not Given";
		this.batteryLife = 0;
	}

	// Laptop Parameterized Constructor
	public Laptop(String brand, String model, double price, int ram, String processor, int batteryLife) {
		super(brand, model, price);
		this.ram = ram;
		this.processor = processor;
		this.batteryLife = batteryLife;
	}

	// Laptop Getter && Setter
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	// Laptop Display Method
	void display() {
		super.display();
		System.out.println("Laptop Ram : " + getRam());
		System.out.println("Laptop Processor : " + getProcessor());
		System.out.println("Laptop BatteryLife : " + getBatteryLife());
		System.out.println("***********************************\n");
	}

}// Laptop class ends here

class SmartPhone extends Device {
	int cameraMP;
	double storage;
	double screenSize;

	// SmartPhone Default Constructor
	public SmartPhone() {
		super();
		this.cameraMP = 0;
		this.storage = 0.00;
		this.screenSize = 0.0;
	}

	// SmartPhone Parameterized Constructor
	public SmartPhone(String brand, String model, double price, int cameraMP, double storage, double screenSize) {
		super(brand, model, price);
		this.cameraMP = cameraMP;
		this.storage = storage;
		this.screenSize = screenSize;
	}

	// SmartPhone Getter && Setter
	public int getCameraMP() {
		return cameraMP;
	}

	public void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	// SmartPhone Display Method
	void display() {
		super.display();
		System.out.println("SmartPhone CameraMP : " + getCameraMP());
		System.out.println("SmartPhone Storage : " + getStorage());
		System.out.println("SmartPhone ScreenSize : " + getScreenSize());
		System.out.println("***********************************\n");
	}

}// SmartPhone class ends here

class Tablet extends Device {
	double screenSize;
	boolean stylusSupport;
	int batteryCapacity;

	// Tablet Default Constructor
	public Tablet() {
		super();
		this.screenSize = 0.00;
		this.stylusSupport = false;
		this.batteryCapacity = 0;
	}

	// Tablet Parameterized Constructor
	public Tablet(String brand, String model, double price, double screenSize, boolean stylusSupport,
			int batteryCapacity) {
		super(brand, model, price);
		this.screenSize = screenSize;
		this.stylusSupport = stylusSupport;
		this.batteryCapacity = batteryCapacity;
	}

	// Tablet Getter && Setter
	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public boolean isStylusSupport() {
		return stylusSupport;
	}

	public void setStylusSupport(boolean stylusSupport) {
		this.stylusSupport = stylusSupport;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	// Tablet Display Method
	void display() {
		super.display();
		System.out.println("Tablet Screen Size : " + getScreenSize());
		System.out.println("Tablet Stylus Support : " + isStylusSupport());
		System.out.println("Tablet Battery Capacity : " + getBatteryCapacity());
		System.out.println("***********************************\n");
	}

}// Tablet class ends here

public class DeviceInfo {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", "Pavilion 15", 65000.0, 16, "Intel i5", 8);
		l1.display();

		SmartPhone sm1 = new SmartPhone("Sumsung", "Galaxy S21", 70000.0, 62, 128, 6.2);
		sm1.display();

		Tablet t1 = new Tablet("Apple", "iPad Air", 60000.0, 10.9, true, 7600);
		t1.display();

	}

}// main ends here
