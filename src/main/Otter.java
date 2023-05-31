package main;

public class Otter extends Animal {
	private static final double cost = 150.0;
	public Otter(String name) {
		super(name, cost); //invokes Animal constructor
	}
	
	
	public String getSciName() {
		return "Lutrinae";
	}
	
	public double getCost() {
		return cost;
	}
}
