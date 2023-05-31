package main;

public class Manatee extends Animal {
	private static final double cost = 199.95;
	public Manatee(String name) {
		super(name, cost); //invokes Animal constructor
	}
	
	public double getCost() {
		return cost;
	}
	
}
