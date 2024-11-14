/**
 * Array Class Implementation in Java
 * 
 * This code defines an `Array` class that provides basic operations on an integer array, such as:
 * - Creating an array of a specified size
 * - Inserting an element at a specific index
 * - Deleting an element at a specific index
 * - Displaying the contents of the array
 * - Performing binary search on the array to find a specified key
 * - Sorting the array using the selection sort algorithm
 * 
 * The class ensures index boundaries are respected during insertion and deletion, provides console
 * outputs for user feedback, and sorts the array before conducting a binary search.
 */

public class Array {
	
	private int[] arr; // Array to hold integer elements
	
	// Constructor to initialize the array with a specified size
	public Array(int size) {
		// Check if size is non-negative
		if(size >= 0) {
			arr = new int[size];
			System.out.println("Array of size " + arr.length + " created.\n");
		} else {
			System.out.println("Array size should not be negative.\n");
		}
	}
	
	// Method to insert an element at a specified index
	public void insert(int index, int element) {
		// Check if index is within valid range
		if(0 <= index && index < arr.length) {
			arr[index] = element;
			System.out.println("Element " + element + " inserted at index " + index + ".\n");
		} else {
			System.out.println("Index out of range.\n");
		}
	}
	
	// Method to delete an element at a specified index
	public void delete(int index) {
		// Check if index is within valid range
		if(0 <= index && index < arr.length) {
			System.out.println("Element " + arr[index] + " deleted at index " + index + ".\n");
			arr[index] = 0; // Reset the deleted element to 0
		} else {
			System.out.println("Index out of range.\n");
		}
	}
	
	// Method to display all elements in the array
	public void display() {
		System.out.print("[");
		for(int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.print("]\n");
	}
	
	// Method to perform binary search on the array for a specified key
	public void BinarySearch(int key) {
		// Sort the array before binary search
		Sort();
		int left = 0;
		int right = arr.length - 1;
		boolean found = false; // Flag to track if key is found

		// Perform binary search
		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if key is at mid position
			if (arr[mid] == key) {
				found = true;
				break;
			}

			// If key is greater, ignore the left half
			if (arr[mid] < key) {
				left = mid + 1;
			}
			// If key is smaller, ignore the right half
			else {
				right = mid - 1;
			}
		}

		if (found) {
			System.out.println("Key found.\n");
		} else {
			System.out.println("Key not found.\n");
		}
	}
	
	// Method to sort the array using selection sort
	public void Sort() {
		int min;  // Variable to hold the minimum element
		int pos;  // Position of the minimum element

		// Selection sort algorithm
		for(int i = 0; i <= arr.length - 2; i++) {
			min = arr[i];
			pos = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			// Swap arr[i] and arr[pos]
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
		// Display the sorted array
		for(int a: arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
