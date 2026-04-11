package com.inheritance;
//Inheritance
class Vehicle{
	int vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	//Default Constructor
	Vehicle() {
		this.vehicleNumber = 0;
		this.model = "Not Given";
		this.companyName = "Not Given";
		this.noOfWheels = 0;
		this.price = 0.00;
		
	}

	//Parameterized Constructor
	Vehicle(int vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}

	//Getters and setters
	int getVehicleNumber() {
		return vehicleNumber;
	}

	void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	int getNoOfWheels() {
		return noOfWheels;
	}

	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	
	//Display Method
	void display() {
		System.out.println("Vehicle Number :"+vehicleNumber);
		System.out.println("Vehicle Model :"+model);
		System.out.println("Company Name :"+companyName);
		System.out.println("No Of Wheels :"+noOfWheels);
		System.out.println("Price :"+price);
	}
	
}//Vehicle class ends here

class Bike extends Vehicle{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	
	//Default constructor
	Bike(){
		super();
		this.noOfStands = 0;
		this.noOfHelmets = 0;
		this.bikeCategory = "Not Given";
	}
	
	//Parameterized constructor
	Bike(int vehicleNumber, String model, String companyName, int noOfWheels, double price,int noOfStands,int noOfHelmets,String bikeCategory){
		super(vehicleNumber,model,companyName,noOfWheels,price);		
		this.noOfStands = noOfStands;	
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	
	//Getters and Setters
	int getNoOfStands() {
		
		return noOfStands;
	}
	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}
	
	int getNoOfHelmets() {
		return noOfHelmets;
	}
	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}
	
	String getBikeCategory() {
		return bikeCategory;
	}
	void setBikeCategory(String bikeCategory) {
			this.bikeCategory = bikeCategory;
	}
	
	//Display Method
	void display() {
		super.display();
		System.out.println("No Of Stands :"+noOfStands);
		System.out.println("No Of Helmet :"+noOfHelmets);
		System.out.println("Bike Category :"+bikeCategory);
		
	}
	
}//Bike class ends here

class Car extends Vehicle{
	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;
	
	//Default constructor
	Car(){
		super();
		this.hasPowerSteering = false;
		this.driveMode = "Not Given";
		this.parkingAssistSensors = 0;
	}
	//Parameterized Constructor
	Car(int vehicleNumber, String model, String companyName, int noOfWheels, double price, boolean hasPowerSteering, String driveMode, int parkingAssistSensors){
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}
	
	//Getters and Setters
	boolean getHasPowerSteering() {
		return hasPowerSteering;
	}
	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}
	
	String getDriveMode() {
		return driveMode;
	}
	void setDriveMode(String driveMode) {
		this.driveMode =driveMode;
	}
	
	int getParkingAssistSensors(){
		return parkingAssistSensors;
	}
	void setParkingAssistSensors(int parkingAssistSensors){
		this.parkingAssistSensors = parkingAssistSensors;
	}
	
	//Display Method
	void display() {
		super.display();
		System.out.println("Has Power Steering :"+hasPowerSteering);
		System.out.println("Drive Mode :"+driveMode);
		System.out.println("Parking AssistSensors :"+parkingAssistSensors);
	}
	
}//car class ends here

class Bus extends Vehicle{
	int passengerCapacity;
	int standingCapacity;
	
	//Default Constructor
	Bus(){
		super();
		this.passengerCapacity = 0;
		this.standingCapacity = 0;
	}
	//Parameterized Constructor
	Bus(int vehicleNumber, String model, String companyName, int noOfWheels, double price,int passengerCapacity,int standingCapacity){
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.passengerCapacity = passengerCapacity;
		this.standingCapacity = standingCapacity;	
	}
	
	//Getters and Setters
	int getPassengerCapacity() {
		return passengerCapacity;
	}
	void setPassengerCapacity(int PassengerCapacity) {
		this.passengerCapacity = PassengerCapacity;
	}
	
	int getStandingCapacity() {
		return standingCapacity;
	}
	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	
	//Display Method
	void display() {
		super.display();
		System.out.println("Passenger Capacity :"+passengerCapacity);
		System.out.println("Standing Capacity :"+standingCapacity);
	}
	
}//Bus class ends here

public class VehicleDetails {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(101,"R15","Yamaha",2,180000);
		v1.display();
		
		System.out.println();
		
		Vehicle v2 = new Vehicle();
		v2.display();
		
		System.out.println();
		
		Bike b1 = new Bike(301,"Classis 350","Royal Enfield",2,220000,2,1,"cruiser");
		b1.display();
		
		System.out.println();
		
		Car c1 = new Car(201,"Creta","Hyundai",4,1500000,true,"Automatic",4);
		c1.display();
		
		System.out.println();
		
		Bus bb1 = new Bus(401,"Starbus","Tata",6,2500000,40,20);
		bb1.display();
	}

}//main ends here
