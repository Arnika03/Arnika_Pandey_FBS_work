package exception.login;

import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Login user = new Login();

		System.out.println("User Name: ");
		String name = sc.nextLine();

		try {
			user.validateUsername(name);

			int attempts = 3;
			while (attempts > 0) {

				System.out.println("Password: ");
				String pass = sc.nextLine();

				try {
					user.validatePassword(pass);
					System.out.println("Login Successful!");
					break;

				} catch (InvalidPasswordException e) {
					attempts--;
					System.out.println(e.getMessage());
					System.out.println("Attempts left: " + attempts);
					if (attempts == 0) {
						System.out.println("Account Locked!");
					}
//					e.printStackTrace();
				}
			}

		} catch (InvalidUsernameException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		sc.close();

	}

}
