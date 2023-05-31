package main;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.TreeMap;

public class Aquarium {
	private HashMap<Integer, Animal> animals = new HashMap<>(); // O(1) time complexity
	
	public void addAnimal(Animal a, int id) {
		animals.put(id, a);
	}
	
	public Animal getAnimal(int id) {
		return animals.get(id);
	}
	
	public Animal removeAnimal(int id) {
		return animals.remove(id);
	}
	
	public boolean idExists(int id) {
		return animals.containsKey(id);
	}
	
	public void printAnimals() {
		System.out.println("\n\n\t\t\tALL ANIMALS:\n\t{\n");
		for(Entry<Integer, Animal> a : getSortedMap().entrySet()) //iterate over every entry in map
			System.out.println(a.getValue().toString() + ": " + a.getKey());
		System.out.println("\n\t}");
	}
	
	public TreeMap<Integer, Animal> getSortedMap() {
		return new TreeMap<Integer, Animal>(animals); //clones map into treemap (sorts automagically)
	}
	
	
}
