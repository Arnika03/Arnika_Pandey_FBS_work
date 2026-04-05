package object;

class Student {
	String frn;
	String studentName;
	double distanceCovered;

	// Default Constructor
	Student() {
		this.frn = "13j4579/067";
		this.studentName = "Arnika";
		this.distanceCovered = 5.3;
	}

	// Parameterized Constructor
	Student(String frn, String studentName, double distanceCovered) {
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
	}

	// Getter and setter
	String getFrn() {
		return frn;
	}

	void setFrn(String frn) {
		this.frn = frn;
	}

	String getStudentName() {
		return studentName;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	double getDistanceCovered() {
		return distanceCovered;
	}

	void setDistanceCovered(double distanceCovered) {
		this.distanceCovered = distanceCovered;
	}// Getter and setter ends here

	void display() {
		System.out.println("Student FRN =" + frn);
		System.out.println("Student Name =" + studentName);
		System.out.println("Distance Covered =" + distanceCovered);
	}

	// ToString Method
	@Override
	public String toString() {

		return " Student FRN : " + frn + "Student Name : " + studentName + "Distance Covered : " + distanceCovered;
	}

}//Student class ends here

public class StudentDetails {

	public static void main(String[] args) {
		 Student s1;
		 s1 = new Student();//1st object
		 s1.display();//display
		 System.out.println(s1);//tostring
		 System.out.println(s1.hashCode());//hashcode
		 
		 
		 Student s2 = new Student("23hjf6347r","Aaru",6.2);//2nd object
		 s2.display();//display
		 System.out.println(s2);//tostring
		 System.out.println(s2.hashCode());//hashcode
		 

	}

}//main class ends here
