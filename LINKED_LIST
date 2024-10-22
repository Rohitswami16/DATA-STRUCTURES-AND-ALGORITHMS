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
        System.out.println("\njust using print");
        System.out.println(ll);
        
        // Iterating over the LinkedList using a traditional for loop
        System.out.println("\nby using for loop");
        for (int i = 0; i <= ll.size() - 1; i++) {
            System.out.print(ll.get(i) + " "); // Accessing elements by index
        }
        
        System.out.println();
        
        // Iterating over the LinkedList using a for-each loop
        System.out.println("\nby using for each loop");
        for (Object x : ll) {
            System.out.print(x + " "); // Accessing each element directly
        }
        
        System.out.println();
        
        // Iterating over the LinkedList using an iterator
        System.out.println("\nBy using iterator");
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // Using hasNext() and next() methods to iterate
        }

    }
}



