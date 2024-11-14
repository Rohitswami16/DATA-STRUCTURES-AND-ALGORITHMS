/**
 * QueueApp Class - Main Application for Queue Operations
 * 
 * This class provides a console-based application to interact with the `Queue` class.
 * It allows users to perform basic queue operations such as:
 * - Inserting an element at the rear (enqueue)
 * - Deleting an element from the front (dequeue)
 * - Displaying all elements in the queue from front to rear
 * 
 * The program runs in a loop, presenting a menu to the user for selecting an action.
 * The application continues until the user chooses to exit.
 */

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter the size of the queue
		System.out.println("Enter the size of the queue:");
		int size = sc.nextInt();
		Queue q = new Queue(size);  // Create a Queue instance with the specified size

		// Loop to display menu and execute selected queue operations
		while (true) {
			System.out.println("Choose an option:");
			System.out.println("Press 1 to Insert \nPress 2 to Delete \nPress 3 to Display \nAny other key to Stop");

			int choice = sc.nextInt();  // User selects operation

			// Switch case to perform the selected operation
			switch (choice) {
				// Insert operation
				case 1: System.out.println("Enter the element to insert:");
					q.insert(sc.nextInt());
					break;
				
				// Delete operation
				case 2: q.delete();
					break;
				
				// Display queue elements
				case 3: q.display();
					break;
				
				// Exit the program
				default: System.out.println("Exiting...");
					sc.close();
					return;
			}
		}
	}
}
