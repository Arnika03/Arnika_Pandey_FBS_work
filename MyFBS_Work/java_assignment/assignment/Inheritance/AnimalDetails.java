package com.inheritance;

class Animal {
	String name;
	int age;
	String habitat;

	// Default Constructor
	Animal() {
		this.name = "Not Given";
		this.age = 0;
		this.habitat = "Not Given";
	}

	// Parameterized Constructor
	Animal(String name, int age, String habitat) {
		this.name = name;
		this.age = age;
		this.habitat = habitat;
	}

	// Getter && Setter
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

	String getHabitat() {
		return habitat;
	}

	void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	// Display Method
	void display() {
		System.out.println("Animal Name : " + getName());
		System.out.println("Animal Age : " + getAge());
		System.out.println("Animal Habitat : " + getHabitat());
	}
}// Animal class ends here

class Dog extends Animal {
	String breed;
	boolean isPet;
	String barkSound;

	// Dog Default Constructor
	public Dog() {
		super();
		this.breed = "Not Given";
		this.isPet = false;
		this.barkSound = "Not Given";
	}

	// Dog Para Constructor
	public Dog(String name, int age, String habitat, String breed, boolean isPet, String barkSound) {
		super(name, age, habitat);
		this.breed = breed;
		this.isPet = isPet;
		this.barkSound = barkSound;
	}

	// Dog Getter && Setter
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPet() {
		return isPet;
	}

	public void setPet(boolean isPet) {
		this.isPet = isPet;
	}

	public String getBarkSound() {
		return barkSound;
	}

	public void setBarkSound(String barkSound) {
		this.barkSound = barkSound;
	}

	// Dog Display Method
	void display() {
		super.display();
		System.out.println("Dog Breed : " + getBreed());
		System.out.println("Pet Or Not : " + isPet());
		System.out.println("Bark Sound : " + getBarkSound());
		System.out.println("************************************\n");
	}

}// Dog class ends here

class Bird extends Animal {
	double wingSpan;
	boolean canFly;
	String beakType;

	// Bird Default Constructor
	public Bird() {
		super();
		this.wingSpan = 0.00;
		this.canFly = false;
		this.beakType = "Not Given";
	}

	// Bird Para Constructor
	public Bird(String name, int age, String habitat, double wingSpan, boolean canFly, String beakType) {
		super(name, age, habitat);
		this.wingSpan = wingSpan;
		this.canFly = canFly;
		this.beakType = beakType;
	}

	// Getter && Setter
	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public String getBeakType() {
		return beakType;
	}

	public void setBeakType(String beakType) {
		this.beakType = beakType;
	}

	// Bird Display Method
	void display() {
		super.display();
		System.out.println("Wing Span : " + getWingSpan());
		System.out.println("Fly Or Not : " + isCanFly());
		System.out.println("Beak Type : " + getBeakType());
		System.out.println("************************************\n");
	}

}// Bird class ends here

class Fish extends Animal {
	enum WaterType {
		FRESH, SALT,UNKNOWN
	};
	WaterType waterType;
	int finCount;
	String color;
	
	//Fish Default Constructor
	public Fish() {
		super();
		this.waterType = WaterType.UNKNOWN;
		this.finCount = 0;
		this.color = "Not GIven";
	}

	//Fish Para Constructor
	public Fish(String name, int age, String habitat,WaterType waterType, int finCount, String color) {
		super(name, age, habitat);
		this.waterType = waterType;
		this.finCount = finCount;
		this.color = color;
	}

	//Fish Getter && Setter
	public WaterType getWaterType() {
		return waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public int getFinCount() {
		return finCount;
	}

	public void setFinCount(int finCount) {
		this.finCount = finCount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Fish Display Method
	void display() {
		super.display();
		System.out.println("Water type : " + getWaterType());
		System.out.println("Fin Count : " + getFinCount());
		System.out.println("Color : " + getColor());
		System.out.println("************************************\n");
	}	

}// Fish class ends here

public class AnimalDetails {

	public static void main(String[] args) {
		Dog d1 = new Dog("Olly",3,"Home","Golden Retriever",true,"woof woof");
		d1.display();
		
		Bird b1 = new Bird("Parrot",2,"Forest",0.4,true,"Curved");
		b1.display();
		
		Bird b2 = new Bird("Penguin",4,"Antarctica",0.5,false,"Short");
		b2.display();
		
		Fish f1 = new Fish("Goldfish",1,"Water",Fish.WaterType.FRESH,5,"Golden Orange");
		f1.display();

	}

}// main class ends here
