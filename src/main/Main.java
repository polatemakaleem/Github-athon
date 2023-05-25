package main;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Manatee("Bob", 1));
		
		

    System.out.println(animals.get(0) instanceof Manatee);
		System.out.println(animals.get(0) instanceof Animal);

		System.out.println("pofdsfo");
		System.out.println("Class Manatee: " + (animals.get(0) instanceof Manatee));
		System.out.println("Class Animal: " + (animals.get(0) instanceof Animal));
		System.out.println(animals.toString());
		//THIS IS AN EDIT
 
	}

}
