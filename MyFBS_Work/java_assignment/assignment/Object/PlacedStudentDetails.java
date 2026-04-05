package object;

class PlacedStudent {
	String frn;
	String studentName;
	double distanceCovered;
	String companyName;
	String designation;

	// Default Constructor
	PlacedStudent() {
		this.frn = "34bay353";
		this.studentName = "Not Given";
		this.distanceCovered = 3.7;
		this.companyName = "deloitte";
		this.designation = "SW Developer";
	}

	// Parameterized Constructor
	PlacedStudent(String frn, String studentName, double distanceCovered, String companyName, String designation) {
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
		this.companyName = companyName;
		this.designation = designation;
	}

	// Getter and Setter
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
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}// Getter and Setter ends here

	// display method
	void display() {
		System.out.println("Student FRN =" + frn);
		System.out.println("Student Name =" + studentName);
		System.out.println("Distance Covered =" + distanceCovered);
		System.out.println("CompanyName =" + companyName);
		System.out.println("Designation =" + designation);
	}

	// tostring
	@Override
	public String toString() {
		
		return " Student [FRN : " + frn + ", Name : " + studentName + ", Distance Covered : " + distanceCovered + 
				", CompanyName : " + companyName + ", Designation : " + designation +"]";
	}

}// PlacedStudent class ends here

public class PlacedStudentDetails {

	public static void main(String[] args) {

		PlacedStudent ps1 = new PlacedStudent();
		ps1.display();
		System.out.println(ps1);
		System.out.println(ps1.hashCode());
		
		System.out.println();

		PlacedStudent ps2 = new PlacedStudent("23hjf6347r", "Aaru", 6.2, "Wipro", "Java Developer");
		ps2.display();
		System.out.println(ps2);
		System.out.println(ps2.hashCode());

	}

}// main class ends here
