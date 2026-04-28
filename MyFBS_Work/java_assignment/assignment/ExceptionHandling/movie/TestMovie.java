package exception.movie;

import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MovieBooking movie = new MovieBooking ();
		
		while(true) {
		System.out.println("\nRemaining Ticket : "+MovieBooking.remainingTickets);		
		System.out.println("Enter number of tickets : ");
		 int number = sc.nextInt();
		
				
			try {
				movie.bookTickets(number);
				
			} catch (InvalidTicketNumberException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			} catch (TicketsSoldOutException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
				break;
			}
		
		}
			
	sc.close();		

	}

}
