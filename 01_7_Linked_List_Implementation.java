/**
 * LinkedLIST Class - Demonstrates Various Ways to Traverse a LinkedList
 * 
 * This class provides an example of using a LinkedList in Java.
 * It showcases how to add elements to the list and different ways to iterate over the list:
 * - Directly printing the list
 * - Using a traditional `for` loop
 * - Using a `for-each` loop
 * - Using an `Iterator`
 * 
 * LinkedList is a part of Java's Collection framework and allows dynamic manipulation of elements,
 * making it ideal for applications that require frequent insertions and deletions.
 */

package Collection_LIST_BASED;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIST {
    public static void main(String[] args) {
        
        // Creating a LinkedList object
        LinkedList ll = new LinkedList();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(150);
        ll.add(200);
        ll.add(250);
        ll.add(300);
        
        // Printing the LinkedList directly
        System.out.println("\nDirectly printing the LinkedList:");
        System.out.println(ll);  // Prints the list in one line

        // Iterating over the LinkedList using a traditional for loop
        System.out.println("\nUsing a traditional for loop:");
        for (int i = 0; i <= ll.size() - 1; i++) {
            System.out.print(ll.get(i) + " "); // Accessing elements by index
        }
        
        System.out.println();
        
        // Iterating over the LinkedList using a for-each loop
        System.out.println("\nUsing a for-each loop:");
        for (Object x : ll) {
            System.out.print(x + " "); // Accessing each element directly
        }
        
        System.out.println();
        
        // Iterating over the LinkedList using an iterator
        System.out.println("\nUsing an iterator:");
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // Using hasNext() and next() methods to iterate
        }
    }
}
