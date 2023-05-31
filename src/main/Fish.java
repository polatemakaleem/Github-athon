package main;

public class Fish extends Animal {
	public Fish(String name) {
		super(name); //invokes Animal constructor
	}
	
	
	public String getSciName() {
		return "Vertebrata";
	}
}
