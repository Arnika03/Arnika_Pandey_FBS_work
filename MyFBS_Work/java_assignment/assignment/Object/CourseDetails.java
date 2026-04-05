package object;

class Course{
	int courseId;
	String courseName;
	double fees;
	
	//Parameterized Constructor
	Course(int courseId, String courseName, double fees) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}

	//getter & Setter
	int getCourseId() {
		return courseId;
	}

	void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	String getCourseName() {
		return courseName;
	}

	void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	double getFees() {
		return fees;
	}

	void setFees(double fees) {
		this.fees = fees;
	}//getter & Setter ends here
	
	//display method
	void display() {
		System.out.println("Course Detail \nCourse Id = " + courseId + "\nCourse Name = "+ courseName + "\nCourse Fees = " + fees);
	}
	
	@Override
	public String toString() {
		return "Course Detail \n[_________________________________\nCourse Id = " + courseId + "\nCourse Name = "+ courseName + "\nCourse Fees = " + fees + "\n__________________________________]";
	}
}

public class CourseDetails {

	public static void main(String[] args) {
	
		Course c1 = new Course(303,"Full Stack Java",40000);
		c1.display();
		System.out.println(c1.hashCode());
		
		System.out.println();
		
		Course c2 = new Course(404,"Full Stack Python",35000);
		System.out.println(c2);
		System.out.println(c2.hashCode());

	}

}