package main;

public class Crab extends Animal {
	private static final double cost = 100.0;
	public Crab(String name) {
		super(name, cost); //invokes Animal constructor
	}
	
	
	public String getSciName() {
		return "Brachyura";
	}
	
	public double getCost() {
		return cost;
	}
}
