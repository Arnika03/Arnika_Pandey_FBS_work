package com.inheritance;

class Player {
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;

	// --------------------------Player Default
	// Constructor-------------------------//
	public Player() {
		this.name = "Note Given";
		this.age = 0;
		this.country = "Note Given";
		this.matchesPlayed = 0;
		this.jerseyNumber = 0;
	}

	// --------------------------Player Parameterized
	// Constructor-------------------------//
	public Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
	}

	// --------------------------Getter && Setter-------------------------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	// --------------------------Display Method-------------------------//
	void display() {
		System.out.println("--------------------------------");
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Country : " + getCountry());
		System.out.println("Matches Played : " + getMatchesPlayed());
		System.out.println("Jersey Number : " + getJerseyNumber());

	}

}// Player class ends here

class CricketPlayer extends Player {
	int totalRuns;
	int totalWickets;

	enum BattingStyle {
		LEFT_HAND, RIGHT_HAND,UNKNOWN
	};

	enum BowlingStyle {
		FAST, SPIN, MEDIUM,UNKNOWN
	};

	BattingStyle battingStyle;
	BowlingStyle bowlingStyle;

	// --------------------------CricketPlayer Default
	// Constructor-------------------------//
	public CricketPlayer() {
		super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battingStyle = BattingStyle.UNKNOWN;
		this.bowlingStyle = BowlingStyle.UNKNOWN;
	}

	// --------------------------CricketPlayer Para
	// Constructor-------------------------//
	public CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalRuns,
			int totalWickets, BattingStyle battingStyle, BowlingStyle bowlingStyle) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	// --------------------------CricketPlayer Getter &&
	// Setter-------------------------//
	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getTotalWickets() {
		return totalWickets;
	}

	public void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	public BattingStyle getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(BattingStyle battingStyle) {
		this.battingStyle = battingStyle;
	}

	public BowlingStyle getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(BowlingStyle bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	// --------------------------CricketPlayer Display
	// Method-------------------------//
	void display() {
		super.display();
		System.out.println("Total Runs : " + getTotalRuns());
		System.out.println("Total Wickets : " + getTotalWickets());
		System.out.println("Batting Style : " + getBattingStyle());
		System.out.println("Bowling Style : " + getBowlingStyle());
		System.out.println("________________________________\n");

	}

}// CricketPlayer class ends here

class FootballPlayer extends Player {
	int totalGoal;

	enum PlayingPosition {
		FORWARD, MIDFIELDER, DEFENDER, GOALKEEPER,UNKNOWN
	};

	PlayingPosition playingPosition;

	// --------------------------FootballPlayer Default
	// Constructor-------------------------//
	FootballPlayer() {
		super();
		this.totalGoal = 0;
		this.playingPosition = PlayingPosition.UNKNOWN;
	}

	// --------------------------FootballPlayer Parameterized
	// Constructor-------------------------//
	FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalGoal,
			PlayingPosition playingPosition) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalGoal = totalGoal;
		this.playingPosition = playingPosition;
	}

	// --------------------------FootballPlayer Getter &&
	// Setter-------------------------//
	public int getTotalGoal() {
		return totalGoal;
	}

	public void setTotalGoal(int totalGoal) {
		this.totalGoal = totalGoal;
	}

	public PlayingPosition getPlayingPosition() {
		return playingPosition;
	}

	public void setPlayingPosition(PlayingPosition playingPosition) {
		this.playingPosition = playingPosition;
	}

	// --------------------------FootballPlayer Display
	// Method-------------------------//
	void display() {
		super.display();
		System.out.println("Total Goal : " + getTotalGoal());
		System.out.println("Playing Position : " + getPlayingPosition());
		System.out.println("________________________________\n");

	}

}// FootballPlayer class ends here

public class PlayerInfo {

	public static void main(String[] args) {
		CricketPlayer p1 = new CricketPlayer();
		p1.display();

		CricketPlayer Cp1 = new CricketPlayer("Virat kohli", 39, "India", 500, 18, 25000, 5,
				CricketPlayer.BattingStyle.RIGHT_HAND, CricketPlayer.BowlingStyle.MEDIUM);
		Cp1.display();

		FootballPlayer Fp1 = new FootballPlayer("Messi", 38, "Argentina", 1100, 10, 850,
				FootballPlayer.PlayingPosition.FORWARD);
		Fp1.display();

	}

}
