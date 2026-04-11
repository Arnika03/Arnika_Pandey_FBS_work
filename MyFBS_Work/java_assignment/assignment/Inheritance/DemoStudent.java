package com.inheritance;
//inheritance
class Student {
	int fbid;
	String name;
	int distance;
	static int count = 0;

	// Student Default Constructor
	Student() {
		this.fbid = 0;
		this.name = "Not Given";
		this.distance = 0;
		count++;
	}

	// Student Parameterized Constructor
	Student(int fbid, String name, int distance) {
		this.fbid = fbid;
		this.name = name;
		this.distance = distance;
		count++;
	}

	// Getter and Setter Start
	void setFbId(int fbid) {
		this.fbid = fbid;
	}

	int getFbId() {
		return fbid;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}

	int getDistance() {
		return distance;
	}

//	static void setCount(int count) {
//		Student.count = count;
//	}//not needed

	static int getCount() {
		return count;
	}// Setter & Getter ends here

	// Display function
	void display() {
		System.out.println("__________________________________\n");
		System.out.println("FirstBitId = " + this.fbid);
		System.out.println("Name = " + this.name);
		System.out.println("Distance = " + this.distance);
		
	}

}// Students ends here

class PlacedStudent extends Student {
	String companyName;
	String designation;

	// PlacedStudent Default Constructor
	PlacedStudent() {
		super();
		this.companyName = "deloitte";
		this.designation = "java developer";
	}

	// PlacedStudent Parameterized Constructor
	PlacedStudent(int fbid, String name, int distance,String companyName, String designation) {
		super(fbid,name,distance);
		this.companyName = companyName;
		this.designation = designation;
	}

	// Setter and Getter Starts here
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getCompanyName() {
		return companyName;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	String getDesignation() {
		return designation;
	}// ends here

	// Display function
	void display() {
		super.display();
		System.out.println("Company Name = " + this.companyName);
		System.out.println("Designation = " + this.designation);
		System.out.println("__________________________________\n");
	}

}// PlacedStudent class ends here

public class DemoStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(46,"Rupali",10);
		s1.display();
		Student s2 = new Student(17,"Rutuja",13);
		s2.display();
		Student s3 = new Student(20,"Shankar",7);
		s3.display();
		PlacedStudent ps1 = new PlacedStudent(63,"Aaru",11,"TCS","Backend Developer");
		ps1.display();
		PlacedStudent ps2 = new PlacedStudent(68,"Purti",14,"calsoft","Frontend Developer");
		ps2.display();
		
		System.out.println(Student.getCount());
		

	}

}//main ends here
