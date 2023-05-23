package main;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<int, Animal> animals = new HashMap<>();
		
		animals.add(new Manatee("Bob", 1));
		
		System.out.println(animals.get(0) instanceof Manatee);
		System.out.println(animals.get(0) instanceof Animal);
	}

}
