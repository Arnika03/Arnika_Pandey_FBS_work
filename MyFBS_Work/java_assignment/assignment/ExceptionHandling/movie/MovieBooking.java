package exception.movie;

public class MovieBooking {
	static String movieName = "3 Idiots";
	static int ticketPrice = 200;
	static int remainingTickets = 50;
	
	public void bookTickets(int numberOfTickets) throws InvalidTicketNumberException , TicketsSoldOutException{
		
		if(numberOfTickets <= 0) {
			throw new InvalidTicketNumberException("Ticket Number is invalid");
		}
		
		if(remainingTickets == 0 || numberOfTickets > remainingTickets) {
			throw new TicketsSoldOutException("Sorry! Tickets are sold out.");
		}
		
		remainingTickets -= numberOfTickets;
		
		int totalAmount = numberOfTickets * ticketPrice;
		
		System.out.println("Booking Successful for "+ movieName +"!");
		System.out.println("Tickets booked: "+numberOfTickets);
		System.out.println("Total amount: "+totalAmount);
		
	}

}
