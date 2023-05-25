package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static int getInt(String question, Scanner scanner) {
		while(true) {
			System.out.println(question);
			try {
				return scanner.nextInt();
			} catch(Exception e) {
				System.out.println("Please enter an integer.\n");
			}
		}
	}
	
	public static int generateId(Aquarium aq) {
		Random random = new Random();
		while(true) {
			int id = random.nextInt();
			if(!aq.idExists(id))
				return id;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aquarium aquarium = new Aquarium();
		while(true) {
			System.out.println("\n\t\tAQUARIUM\n\n\t1. Add Animal\n\t2. Print Animal Data");
			int option = getInt("Enter option: ", scanner);
			
			switch(option) {
				case 1 : {
					System.out.println("\nEnter name of animal: ");
					int id = generateId(aquarium);
					System.out.println("Id: " + id);
					aquarium.addAnimal(new Animal(scanner.next(), id));
					break;
				}
				case 2 : {
					aquarium.printAnimals();
					break;
				}
				default : {
					System.out.println("ha gayy");
				}
			}
		}
	}

}
