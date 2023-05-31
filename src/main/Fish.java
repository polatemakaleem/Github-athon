package main;

public class Fish extends Animal {
	private static final double cost = 50.0;
	public Fish(String name) {
		super(name, cost); //invokes Animal constructor
	}
	
	
	public String getSciName() {
		return "Vertebrata";
	}
	
	public double getCost() {
		return cost;
	}
}
