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
	
	//switch put here to make main more readable
	public static Animal animalChoice(int option, Scanner scanner) {
		System.out.print("\nEnter name of animal: ");
		String name = scanner.nextLine();
		switch(option) {
			case 1 : {
				return new Manatee(name);
			}
			case 2: {
				return new Otter(name);
			}
			case 3 : {
				return new Fish(name);
			}
			case 4 : {
				return new Crab(name);
			}
			case 5 : {
				return new Stingray(name);
			}
			default : {
				return null; // null = uninitiated object (basically empty value)
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
						System.out.println("\n\n\t\t\t\tANIMALS:\n\n\t1. Manatee ($199.95)\n\t2. Otter ($150)\n\t3. Fish ($50)\n\t4. Crab ($100)\n\t5. Stingray ($350)");
						int choice = getInt("\nEnter animal species: ", scanner);
						Animal animal = animalChoice(choice, scanner);
						// if animal choice not found
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
					Animal animal = aquarium.removeAnimal(id); // returns animal object that got removed
					shoppingList.add(animal);
					System.out.println("Bought animal: " + animal.getName());
					break;
				}
				case 3 : {
					aquarium.printAnimals();
					break;
				}
				
				case 4 : {
					double cost = 0;
					for(Animal a : shoppingList) { // for each animal inside shopping list
						System.out.println("\n\tName: " + a.getName() + "\n\tSpecies: " + a.getClass().getSimpleName() + "\n\tCost: $" + a.getCost());
						cost += a.getCost();
						System.out.println("");
					}
					System.out.println("\n\tTotal cost of all animals: $" + cost);
					scanner.close();
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
