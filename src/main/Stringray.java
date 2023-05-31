package main;

public class Stringray extends Animal {
	private static final double cost = 350.0;
	public Stringray(String name) {
		super(name, cost); //invokes Animal constructor
	}
	
	
	public String getSciName() {
		return "Myliobatoidei";
	}
	
	public double getCost() {
		return cost;
	}
}
