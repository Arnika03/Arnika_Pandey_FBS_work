package com.down;

class Artist {

	private String name;
	private int age;

	// Default Constructor
	Artist() {
		this.name = "Note Given";
		this.age = 0;
	}

	// Parameterized Constructor
	Artist(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter and setter
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	void work() {
		System.out.println(name + " is doing artistic work");
	}

	// Display Method
	void display() {
		System.out.println("Artist Name : " + getName());
		work();
		System.out.println("Artist Age : " + getAge());
	}
}// Artist class ends here

class Painter extends Artist {
	public enum PaintingStyle {
		ABSTRACT, REALISM, IMPRESSIONISM, UNKNOWN
	};

	PaintingStyle paintingStyle;

	public enum MediumUsed {
		OIL, WATERCOLOR, ACRYLIC, UNKNOWN
	};

	MediumUsed mediumUsed;

	private int numberOfPainting;

	// Painter Default Constructor
	Painter() {
		super();
		this.paintingStyle = PaintingStyle.UNKNOWN;
		this.mediumUsed = MediumUsed.UNKNOWN;
		this.numberOfPainting = 0;
	}

	// Painter Parameterized Constructor
	Painter(String name, int age, PaintingStyle paintingStyle, MediumUsed mediumUsed, int numberOfPainting) {
		super(name, age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPainting = numberOfPainting;
	}

	// Getter && Setter
	PaintingStyle getPaintingStyle() {
		return paintingStyle;
	}

	void setPaintingStyle(PaintingStyle paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	MediumUsed getMediumUsed() {
		return mediumUsed;
	}

	void setMediumUsed(MediumUsed mediumUsed) {
		this.mediumUsed = mediumUsed;
	}

	int getNumberOfPainting() {
		return numberOfPainting;
	}

	void setNumberOfPainting(int numberOfPainting) {
		this.numberOfPainting = numberOfPainting;
	}

	@Override
	void work() {

		System.out.println(getName() + " : painting");
	}

	// Painter Display Method
	void display() {
		super.display();
		System.out.println("Painting Style : " + getPaintingStyle());
		System.out.println("Medium Used : " + getMediumUsed());
		System.out.println("Number Of Painting : " + getNumberOfPainting());
		System.out.println("*********************************\n");
	}

}// Painter class ends here

class Musician extends Artist {
	private String instrument;

	public enum MusicGenre {
		ROCK, POP, CLASSICAL, JAZZ, UNKNOWN
	}

	MusicGenre musicGenre;
	private int numberOfAlbums;

	// Musician Default Constructor
	Musician() {
		super();
		this.instrument = "Not Given";
		this.musicGenre = MusicGenre.UNKNOWN;
		this.numberOfAlbums = 0;
	}

	// Musician Parameterized Constructor
	Musician(String name, int age, String instrument, MusicGenre musicGenre, int numberOfAlbums) {
		super(name, age);
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}

	// Getter and Setter
	String getInstrument() {
		return instrument;
	}

	void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	MusicGenre getMusicGenre() {
		return musicGenre;
	}

	void setMusicGenre(MusicGenre musicGenre) {
		this.musicGenre = musicGenre;
	}

	int getNumberOfAlbums() {
		return numberOfAlbums;
	}

	void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}

	@Override
	void work() {
		System.out.println(getName() + " : singing");
	}

	// Musician Display Method
	void display() {
		super.display();
		System.out.println("Instrument : " + getInstrument());
		System.out.println("Music Genre : " + getMusicGenre());
		System.out.println("Number Of Albums : " + getNumberOfAlbums());
		System.out.println("*********************************\n");
	}

}// Musician class ends here

class Actor extends Artist {
	private String filmIndustry;
	private int numberOfMovies;

	// Actor Default Constructor
	Actor() {
		super();
		this.filmIndustry = "Not Given";
		this.numberOfMovies = 0;
	}

	// Actor Parameterized Constructor
	Actor(String name, int age, String filmIndustry, int numberOfMovies) {
		super(name, age);
		this.filmIndustry = filmIndustry;
		this.numberOfMovies = numberOfMovies;
	}

	// Actor Getter && Setter
	String getFilmIndustry() {
		return filmIndustry;
	}

	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}

	int getNumberOfMovies() {
		return numberOfMovies;
	}

	void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}

	@Override
	void work() {
		System.out.println(getName() + " : acting");
	}

	// Actor Display Method
	void display() {
		super.display();
		System.out.println("Film Industry : " + getFilmIndustry());
		System.out.println("Number Of Movies : " + getNumberOfMovies());
		System.out.println("*********************************\n");
	}

}// Actor class ends here

public class ArtistEligibility {

	public static void main(String[] args) {

		Artist[] artist = new Artist[5];

		artist[0] = new Painter("Ritika", 23, Painter.PaintingStyle.IMPRESSIONISM, Painter.MediumUsed.OIL, 28);
		artist[1] = new Musician("Arijeet Singh", 39, "Drums", Musician.MusicGenre.JAZZ, 52);
		artist[2] = new Actor("Govinda", 58, "Bollywood", 83);
		artist[3] = new Musician("Arnika Pandey", 24, "Guitar", Musician.MusicGenre.ROCK, 12);
		artist[4] = new Painter("Rahul", 26, Painter.PaintingStyle.REALISM, Painter.MediumUsed.OIL, 32);

		for (Artist a : artist) {
			checkMusicEventEligibility(a);
		}

	}

	// Method for RTTI and DownCasting
	public static void checkMusicEventEligibility(Artist artist) {

		if (artist instanceof Musician) {
			Musician m1 = (Musician) artist; // DownCasting

			System.out.println("Musician " + m1.getName() + " is allowed for the Music Event and is playing "
					+ m1.getInstrument()+"\n");

		} else {
			System.out.println("Artist " + artist.getName() + " is not allowed for the Music Event \n");
		}

	}

}// main class ends here
