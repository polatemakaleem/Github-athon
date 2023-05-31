package main;
import java.util.Scanner;

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
				return null;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aquarium aquarium = new Aquarium();
		while(true) {
			System.out.println("\n\t\tAQUARIUM\n\n\t1. Add Animal\n\t2. Remove Animal\n\t3. Print Animal Data");
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
					int id = getInt("\n\tEnter ID of animal to remove: ", scanner);
					Animal animal = aquarium.removeAnimal(id);
					if(animal != null) System.out.println("\n\n\t\t\tRemoved: " + animal.getName());
					break;
				}
				case 3 : {
					aquarium.printAnimals();
					break;
				}
				default : {
					System.out.println("\nPlease enter a number in range.");
					break;
				}
			}
		}
	}

}
