/**
 * Stack Class Implementation in Java
 * 
 * This class provides a basic implementation of a stack data structure using an array.
 * Key operations include:
 * - Creating a stack of a specified size
 * - Pushing an element onto the stack
 * - Popping the top element from the stack
 * - Displaying all elements in the stack from top to bottom
 * 
 * The stack follows the Last-In-First-Out (LIFO) principle, where the last element added is the first to be removed.
 * This implementation includes boundary checks to prevent overflow and underflow conditions.
 */

public class Stack {
	private int size;       // The maximum size of the stack
	private int top = -1;   // The index of the top element, initialized to -1 to indicate an empty stack
	private int s[];        // Array to hold stack elements
	
	// Constructor to initialize stack with a specific size
	public Stack(int size) {
		if(size > 0) {
			this.size = size;
			s = new int[size];
			System.out.println("Stack of size " + size + " is created");
		} else {
			System.out.println("Please provide a valid size greater than 0.");
		}
	}
	
	// Method to push an element onto the stack
	public void push(int element) {
		// Check if there's space in the stack before pushing
		if(top < size - 1) {
			top++;
			s[top] = element;
			System.out.println("Pushed element: " + element);
		} else {
			System.out.println("Stack is full - Overflow condition");
		}
	}
	
	// Method to pop the top element from the stack
	public void pop() {
		// Check if the stack is not empty before popping
		if(top == -1) {
			System.out.println("Stack is Empty - Underflow condition");
		} else {
			System.out.println("Popped element is: " + s[top]);
			s[top] = 0; // Reset the popped element to 0
			top--;
		}
	}
	
	// Method to display all elements in the stack from top to bottom
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		} else {
			System.out.print("Stack elements (top to bottom): ");
			for(int i = top; i >= 0; i--) {
				System.out.print(s[i] + " ");
			}
			System.out.println();
		}
	}
}
