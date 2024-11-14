/**
 * StackApp Class - Main Application for Stack Operations
 * 
 * This class provides a console-based application to interact with the `Stack` class.
 * It allows users to perform basic stack operations such as:
 * - Pushing an element onto the stack
 * - Popping the top element from the stack
 * - Displaying all elements in the stack
 * 
 * The program runs in a loop, presenting a menu to the user for selecting an action.
 * The application continues until the user chooses to exit.
 */

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the size of the stack
		System.out.println("Enter the size of the stack:");
		int size = sc.nextInt();
		Stack s = new Stack(size);  // Create a Stack instance with the specified size

		// Loop to display menu and execute selected stack operations
		while (true) {
			System.out.println("Choose an option:");
			System.out.println("Press 1 to Push \nPress 2 to Pop \nPress 3 to Display \nAny other key to Stop");

			int choice = sc.nextInt();  // User selects operation

			// Switch case to perform the selected operation
			switch (choice) {
				case 1: // Push operation
					System.out.println("Enter the element to push:");
					s.push(sc.nextInt());
					break;
				
				case 2: // Pop operation
					s.pop();
					break;
				
				case 3: // Display stack elements
					s.display();
					break;
				
				default: // Exit the program
					System.out.println("Exiting...");
					sc.close();
					return;
			}
		}
	}
}
