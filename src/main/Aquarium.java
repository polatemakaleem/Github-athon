package main;

import java.util.ArrayList;

public class Aquarium {
	private ArrayList<Animal> animals = new ArrayList<>();
	
	public Aquarium() {
		
	}
	
	public void addAnimal(Animal a) {
		animals.add(a);
	}
	
	public Animal getAnimal(int index) {
		return animals.get(index);
	}
	
	public boolean idExists(int id) {
		for(Animal a : animals) {
			if(id == a.getId())
				return true;
		}
		return false;
	}
	
	public void printAnimals() {
		for(Animal a : animals)
			System.out.println(a.toString());
	}
}
