package main;
import java.util.Scanner;

public class Main {

	public static int getInt(String question, Scanner scanner) {
		while(true) {
			System.out.print(question);
			try {
				return scanner.nextInt();
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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aquarium aquarium = new Aquarium();
		while(true) {
			System.out.println("\n\t\tAQUARIUM\n\n\t1. Add Animal\n\t2. Print Animal Data\n\t3. Exit");
			int option = getInt("\nEnter option: ", scanner);
			
			switch(option) {
				case 1 : {
					System.out.print("\nEnter name of animal: ");
					aquarium.addAnimal(new Animal(scanner.next()), generateId(aquarium));
					break;
				}
				case 2 : {
					aquarium.printAnimals();
					break;
				}
				case 3 : {
					System.out.println("\n\n\tExitting...\n\n");
					return;
				}
				default : {
					System.out.println("ha gayy");
				}
			}
		}
	}

}
