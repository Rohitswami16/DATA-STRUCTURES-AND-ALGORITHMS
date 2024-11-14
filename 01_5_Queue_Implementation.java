/**
 * Queue Class Implementation in Java
 * 
 * This class provides a basic implementation of a queue data structure using an array.
 * Key operations include:
 * - Creating a queue of a specified size
 * - Inserting an element at the rear (enqueue)
 * - Deleting an element from the front (dequeue)
 * - Displaying all elements in the queue from front to rear
 * 
 * The queue follows the First-In-First-Out (FIFO) principle, where the first element added
 * is the first one to be removed. This implementation includes boundary checks to prevent 
 * overflow and underflow conditions.
 */

public class Queue {
	private int q[];        // Array to hold queue elements
	private int size;       // The maximum size of the queue
	private int f = -1;     // Front index, initialized to -1 to indicate an empty queue
	private int r = -1;     // Rear index, initialized to -1 to indicate an empty queue

	// Constructor to initialize queue with a specific size
	public Queue(int size) {
		if (size > 0) {
			this.size = size;
			q = new int[size];
			System.out.println("Queue of size " + size + " is created");
		} else {
			System.out.println("Please provide a valid size greater than 0.");
		}
	}

	// Method to insert an element at the rear of the queue
	public void insert(int element) {
		// Check if the queue is full before inserting
		if (r == size - 1) {
			System.out.println("Queue is Full - Overflow condition");
		} else {
			r++;
			q[r] = element;
			System.out.println("Element " + element + " is inserted");
		}
	}

	// Method to delete an element from the front of the queue
	public void delete() {
		// Check if the queue is empty before deleting
		if ((f == r) || (f == size - 1)) {
			System.out.println("Queue is Empty - Underflow condition");
		} else {
			f++;
			System.out.println("Element deleted is " + q[f]);
			q[f] = 0; // Reset the deleted element to 0
		}
	}

	// Method to display all elements in the queue from front to rear
	public void display() {
		// Check if the queue is empty before displaying elements
		if ((f == r) || (f == size - 1)) {
			System.out.println("Queue is Empty");
		} else {
			System.out.print("Queue elements (front to rear): ");
			for (int i = f + 1; i <= r; i++) {
				System.out.print(q[i] + " ");
			}
			System.out.println();
		}
	}
}
