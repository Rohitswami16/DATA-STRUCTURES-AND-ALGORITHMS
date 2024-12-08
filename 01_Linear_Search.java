package ALGO_01_LINEAR_SEARCH;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        // Creating a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.println("Enter the Size of Array");
        int arr[] = new int[sc.nextInt()]; // Initializing the array with the given size
        
        // Filling the array with user input
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter the element of the array at index " + i);
            arr[i] = sc.nextInt(); // Storing each element at the corresponding index
        }
        
        // Prompt the user to enter the element to search for
        System.out.println("Enter the element to search");
        int key = sc.nextInt(); // The element (key) to be searched in the array
        
        // Calling the linearSearch method to search for the key
        int res = linearSearch(arr, key);
        
        // If the key is found, display the index; otherwise, show "Key Not found"
        if (res >= 0) {
            System.out.println("Key found at index: " + res);
        } else {
            System.out.println("Key Not found.");
        }
    }
    
    // Method to perform linear search on an array
    public static int linearSearch(int[] a, int key) {
        // Traverse the array from the beginning to the end
        for (int i = 0; i <= a.length - 1; i++) {
            // If the key matches the current element, return the index
            if (key == a[i]) {
                return i;
            }
        }
        // If the key is not found, return -1
        return -1;
    }
}
