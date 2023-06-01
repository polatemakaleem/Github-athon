package main;

public class Stingray extends Animal {
	private static final double cost = 350.0;
	public Stingray(String name) {
		super(name, cost); //invokes Animal constructor
	}
	
	
	public String getSciName() {
		return "Myliobatoidei";
	}
	
	public double getCost() {
		return cost;
	}
}
