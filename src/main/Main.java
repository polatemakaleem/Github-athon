package main;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static int getInt(String question, Scanner scanner) {
		while(true) {
			System.out.print(question);
			String response = scanner.nextLine();
			try {
				return Integer.parseInt(response);
			} catch(Exception e) {
				System.out.println("Please enter an integer.\n");
			}
		}
	}
	
	public static int generateId(Aquarium aq) {
		while(true) {
			int id = (int) (Math.random() * 9999) + 1; //random number 1-9999
			if(!aq.idExists(id))
				return id;
		}
	}
	
	public static Animal animalChoice(int option, Scanner scanner) {
		System.out.print("\nEnter name of animal: ");
		String name = scanner.nextLine();
		switch(option) {
			case 1 : {
				return new Manatee(name);
			}
	
			default : {
				return null;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> shoppingList = new ArrayList<>();
		Aquarium aquarium = new Aquarium();
		while(true) {
			System.out.println("\n\t\tAQUARIUM\n\n\t1. Add Animal\n\t2. Buy Animal\n\t3. Print Animal Data\n\t4. Exit");
			int option = getInt("\nEnter option: ", scanner);
			
			switch(option) {
				case 1 : {
					
					while(true) {
						System.out.println("\n\n\t\t\t\tANIMALS:\n\n\t1. Manatee");
						int choice = getInt("\nEnter animal species: ", scanner);
						Animal animal = animalChoice(choice, scanner);
						if(animal == null) { System.out.println("\n\t\tPlease enter a valid animal species."); continue; }
						aquarium.addAnimal(animal, generateId(aquarium));
						break;
					}
				
					break;
				}
				case 2 : {
					aquarium.printAnimals();
					int id = getInt("\n\tEnter ID of animal to buy: ", scanner);
					if(!aquarium.idExists(id)) {System.out.println("\n\n\tError: ID not found.");break;}
					Animal animal = aquarium.getAnimal(id);
					shoppingList.add(animal);
					System.out.println("Bought animal: " + aquarium.removeAnimal(id).getName());
					break;
				}
				case 3 : {
					aquarium.printAnimals();
					break;
				}
				
				case 4 : {
					double cost = 0;
					for(Animal a : shoppingList)
						cost += ((Manatee)a).getCost(); //no idea if this works properly.
					System.out.println("\n\tTotal cost of all animals: " + cost);
					return;
				}
				default : {
					System.out.println("\nPlease enter a number in range.");
					break;
				}
			}
		}
	}

}
