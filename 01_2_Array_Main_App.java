/**
 * ArrayApp Class - Main Application for Array Operations
 * 
 * This code implements a console-based application to interact with the `Array` class.
 * The program allows users to perform various operations on an integer array such as:
 * - Inserting an element at a specified index
 * - Deleting an element at a specified index
 * - Displaying all elements of the array
 * - Searching for a specific element using binary search
 * - Sorting the array in ascending order
 * 
 * The user is prompted to enter the desired action via a menu displayed in the console.
 * The program runs in a loop, allowing multiple operations until the user chooses to exit.
 */

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO ARRAY IMPLEMENTATION");
		
		// Prompt user for the size of the array
		System.out.println("ENTER ARRAY SIZE");
		Array arr = new Array(sc.nextInt()); // Create an Array instance with the specified size

		// Loop to display menu and execute selected array operations
		while (true) {
			System.out.println("PLEASE CHOOSE AN OPTION");
			System.out.println("PRESS-1 TO INSERT \nPRESS-2 TO DELETE \nPRESS-3 TO DISPLAY \nPRESS-4 TO SEARCH \nPRESS-5 TO SORT \nANY OTHER NUMBER TO STOP \n");

			int num = sc.nextInt(); // User selects operation

			// Switch case to perform the selected operation
			switch (num) {
				case 1: System.out.println("Enter position and value to insert: "); // Insert operation
					arr.insert(sc.nextInt(), sc.nextInt());
					break;
				
				case 2: System.out.println("Enter the position to delete: "); // Delete operation
					arr.delete(sc.nextInt());
					break;
				
				case 3: System.out.println("Array Elements are: "); // Display array elements
					arr.display();
					break;
				
				case 4: System.out.println("Enter the value to search: ");  // Search for an element using binary search
					arr.BinarySearch(sc.nextInt());
					break;
				
				case 5: System.out.println("Sorted Array is: ");  // Sort array
					arr.Sort();
					break;
				
				default:System.out.println("Exiting...");  // Exit the program
					sc.close();
					return;
			}
		}
	}
}
