
package exception.admission;

public class TestAdmission {

	public static void main(String[] args) {

		// Object creation
		AdmissionForm add = new AdmissionForm();

		add.studentName = "Anika";
		add.age = 23;
		add.percentage = 83;
		add.courseFees = 10000;
		add.feesPaid = 5000;

		try {
			add.validateForm();
		} catch (EmptyNameException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (UnderageException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (InvalidPercentageException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (NotFitForAdmissionException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (FeesNotPaidException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (InsufficientFeesException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

	}

}
