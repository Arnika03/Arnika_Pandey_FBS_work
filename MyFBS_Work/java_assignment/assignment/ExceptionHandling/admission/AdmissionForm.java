package exception.admission;

public class AdmissionForm {

	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;

	public void validateForm() throws EmptyNameException, UnderageException, InvalidPercentageException,
			NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException {

		//Name Validation
		if (studentName == null || studentName.isEmpty()) {
			throw new EmptyNameException("Name cannot be empty");
		} 
		
		//Age Validation
		if(age < 17) {
			throw new UnderageException("Age must be atleast 18");
		}
		
		//Percentage Validation
		if(percentage < 0 || percentage > 100) {
			throw new InvalidPercentageException("Invalid Percentage");
		}
		
		//Admission eligibility
		if(percentage < 35) {
			throw new NotFitForAdmissionException("Not eligible for admission");
		}
		
		//fees paid check
		if(feesPaid == 0) {
			throw new FeesNotPaidException("Fees not paid");
		}
		
		//Minimum 30% fees
		if(feesPaid < courseFees * 0.3) {
			throw new InsufficientFeesException("Minimum 30% fees required");
		}
		
		//If all valid
		System.out.println("Admission Successful !!!");

	}
}
