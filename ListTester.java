package lists;
import java.util.Scanner;

public class ListTester {
	
	public static void printMenu() {
		System.out.println("\nWhat would you like to do to the list?");
		System.out.println("Press 'a' to append an integer to the list.");
		System.out.println("Press 'p' to prepend an integer to the list.");
		System.out.println("Press 'i' to insert an integer to the list.");
		System.out.println("Press 'r' to remove an integer from the list.");
		System.out.println("Press 'g' to get the length of the list.");
		System.out.println("Press 'l' to print the list.");
		System.out.println("Press 'q' to quit.");
		}

	public static void main(String[] args) {
		
		LinkedList newList = new LinkedList();
		
		Scanner scnr = new Scanner(System.in);
		
		
		//printMenu();
		String input = " ";
		
		while (!input.equals("q")) {
			printMenu();
			input = scnr.nextLine();
			if (input.equals("a")) {
				System.out.println("Type the integer you would like to append.");
				if (scnr.hasNextInt()) {
					int appended = scnr.nextInt();
					newList.append(appended);
					scnr.nextLine();
				}
				else {
					System.out.println("Not an integer.");
				}
			}
			else if (input.equals("p")) {
				System.out.println("Type the integer you would like to prepend.");
				if (scnr.hasNextInt()) {
					int prepended = scnr.nextInt();
				
				
					newList.prepend(prepended);
					scnr.nextLine();
				}
				else {
					System.out.println("Not an integer.");
				}
			}
			else if (input.equals("i")) {
				System.out.println("Type which integer you would like to insert after.");
				int insertAfter = scnr.nextInt();
				scnr.nextLine();
				System.out.println("Type the integer you would like to insert ");
				int inserted = scnr.nextInt();
				scnr.nextLine();
				newList.insertAfter(insertAfter, inserted);
			
			}
			else if (input.equals("r")) {
				System.out.println("Type the integer you would like to remove.");
				if (scnr.hasNextInt()) {
				int removed = scnr.nextInt();
				scnr.nextLine();
				newList.remove(removed);
				}
				else {
					System.out.println("Not an integer.");
				}
			}
			
			else if (input.equals("g")) {
				System.out.println(newList.listLength());
			}
			else if (input.equals("l")) {
				newList.printList();
			}
			else if (input.equals("q")) {
				break;
			}
			else {
				System.out.println("Not valid input.");
			}
			
		}

		
		
//		newList.insertAfter(0, 15);
//		newList.append(10);
//		newList.append(20);
//		newList.append(30);
//		newList.append(40);
//		newList.append(50);

	}

}
