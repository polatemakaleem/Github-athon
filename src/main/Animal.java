package main;

public class Animal {
	
	String name;
	double cost;
	public Animal(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {return name;}
	
	public String toString() {
		return name + " ($" + cost + ")";
	}
	
	public double getCost() {return cost;}
}
