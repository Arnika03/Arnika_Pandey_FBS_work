package com.inheritance;

class Book {
	String title;
	String author;
	double price;

	// Default Constructor
	public Book() {
		this.title = "Not Given";
		this.author = "Not Given";
		this.price = 0.00;
	}

	// Parameterized Constructor
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Getter && Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Display Method
	void display() {
		System.out.println("Title : " + getTitle());
		System.out.println("Auther : " + getAuthor());
		System.out.println("Price : " + getPrice());
	}
}// Book class ends here

class TextBook extends Book {
	String subject;
	int classLevel;
	int edition;

	// TextBook Default Constructor
	public TextBook() {
		super();
		this.subject = "Not Given";
		this.classLevel = 0;
		this.edition = 0;
	}

	// Textbook Parameterized Constructor
	public TextBook(String title, String author, double price, String subject, int classLevel, int edition) {
		super(title, author, price);
		this.subject = subject;
		this.classLevel = classLevel;
		this.edition = edition;
	}

	// TextBook Gette && Setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	// TextBook Display Method
	void display() {
		super.display();
		System.out.println("TextBook Subject : " + getSubject());
		System.out.println("TextBook ClassLevel : " + getClassLevel());
		System.out.println("TextBook Edition : " + getEdition());
		System.out.println("***********************************\n");
	}

}// TextBook class ends here

class Novel extends Book {
	String genre;
	String language;
	int pages;

	// Novel Default Constructor
	public Novel() {
		super();
		this.genre = "Not Given";
		this.language = "Not Given";
		this.pages = 0;
	}

	// Novel Parameterized Constructor
	public Novel(String title, String author, double price, String genre, String language, int pages) {
		super(title, author, price);
		this.genre = genre;
		this.language = language;
		this.pages = pages;
	}

	// Novel Getter && Setter
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	// Novel Display Method
	void display() {
		super.display();
		System.out.println("Novel Genre : " + getGenre());
		System.out.println("Novel Language : " + getLanguage());
		System.out.println("Novel Pages : " + getPages());
		System.out.println("***********************************\n");
	}

}// Novel class ends here

class Magazine extends Book {
	int issueNumber;

	enum PublicationMonth {
		JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC, UNKNOWN
	};

	PublicationMonth publicationMonth;
	String frequency;

	// magazine Default Constructor
	public Magazine() {
		super();
		this.issueNumber = 0;
		this.publicationMonth = PublicationMonth.UNKNOWN;
		this.frequency = "Not Given";
	}

	// Magazine Parameterized Constructor
	public Magazine(String title, String author, double price, int issueNumber, PublicationMonth publicationMonth,
			String frequency) {
		super(title, author, price);
		this.issueNumber = issueNumber;
		this.publicationMonth = publicationMonth;
		this.frequency = frequency;
	}

	// Magazine Getter && Setter
	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public PublicationMonth getPublicationMonth() {
		return publicationMonth;
	}

	public void setPublicationMonth(PublicationMonth publicationMonth) {
		this.publicationMonth = publicationMonth;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	// Magazine Display Method
	void display() {
		super.display();
		System.out.println("Magazine IssueNumber : " + getIssueNumber());
		System.out.println("Magazine PublicationMonth : " + getPublicationMonth());
		System.out.println("Magazine Frequency : " + getFrequency());
		System.out.println("***********************************\n");
	}

}// Magazine class ends here

public class BookDetails {

	public static void main(String[] args) {

		TextBook tb1 = new TextBook("Mathematics", "NCERT", 350.0, "Maths", 10, 2023);
		tb1.display();

		Novel n1 = new Novel("The Alchemist", "Paulo Coelho", 299.0, "Fiction", "English", 208);
		n1.display();

		Magazine m1 = new Magazine("Tech Today", "Editorial Team", 150.0, 45, Magazine.PublicationMonth.MAR, "Monthly");
		m1.display();

	}

}// main class ends here
