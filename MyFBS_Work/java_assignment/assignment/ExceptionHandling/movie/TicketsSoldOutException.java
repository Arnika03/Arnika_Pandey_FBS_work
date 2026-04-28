package exception.movie;

public class TicketsSoldOutException extends Exception {
	public TicketsSoldOutException(String message) {
			super(message);
	}

}