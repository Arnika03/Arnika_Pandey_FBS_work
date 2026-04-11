package com.inheritance;

class Artist {
	String name;
	int age;

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

	// Display Method
	void display() {
		System.out.println("Artist Name : " + getName());
		System.out.println("Artist Age : " + getAge());
	}
}// Artist class ends here

class Painter extends Artist {
	enum PaintingStyle {
		ABSTRACT, REALISM, IMPRESSIONISM,UNKNOWN
	};

	PaintingStyle paintingStyle;

	enum MediumUsed {
		OIL, WATERCOLOR, ACRYLIC,UNKNOWN
	};

	MediumUsed mediumUsed;

	int numberOfPainting;

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
	String instrument;

	enum MusicGenre {
		ROCK, POP, CLASSICAL, JAZZ,UNKNOWN
	}

	MusicGenre musicGenre;
	int numberOfAlbums;

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
	String filmIndustry;
	int numberOfMovies;

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

	// Actor Display Method
	void display() {
		super.display();
		System.out.println("Film Industry : " + getFilmIndustry());
		System.out.println("Number Of Movies : " + getNumberOfMovies());
		System.out.println("*********************************\n");
	}

}//Actor class ends here

public class ArtistDetails {

	public static void main(String[] args) {
		
		Painter p1 = new Painter("Ritika", 23, Painter.PaintingStyle.IMPRESSIONISM, Painter.MediumUsed.OIL, 28);
		p1.display();

		Musician m1 = new Musician("Arijeet Singh", 39, "Drums", Musician.MusicGenre.JAZZ, 52);
		m1.display();

		Actor a1 = new Actor("Govinda", 58, "Bollywood", 83);
		a1.display();

	}

}//main ends here
