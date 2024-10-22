package ALGO_02_BINARY_SEARCH;

public class BinarySearch {
    public static void main(String[] args) {
        
        // An array of sorted integers to search in
        int arr[] = {10, 20, 30, 40, 50};
        
        // The element to search for (key)
        int key = 90;
        
        // Calling the Binary method to perform binary search
        int res = Binary(arr, key);
        
        // If the result (index) is positive, the key is found; otherwise, it's not found
        if (res >= 0) {
            System.out.println("Key found at index " + res);
        } else {
            System.out.println("Key not found");
        }
    }
    
    // Method to perform binary search on a sorted array
    public static int Binary(int arr[], int key) {
        int low = 0; // Starting index of the array
        int high = arr.length - 1; // Ending index of the array
        
        // Looping while there is a valid search range
        while (low <= high) {
            
            // Finding the middle index of the current search range
            int mid = (low + high) / 2;
            
            // If the key is found at the middle index, return the index
            if (arr[mid] == key) {
                return mid;
            } 
            // If the key is greater than the middle element, search in the right half
            else if (key > arr[mid]) {
                low = mid + 1;
            } 
            // If the key is smaller than the middle element, search in the left half
            else {
                high = mid - 1;
            }
        }
        // If the key is not found, return -1
        return -1;
    }
}
