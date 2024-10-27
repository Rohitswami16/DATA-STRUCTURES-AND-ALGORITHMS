
public class Stack {
	private int size;
	private int top = -1;
	private int s[];
	
	public Stack(int size) {
		if(size > 0) {
		this.size = size;
		s = new int[size];
		System.out.println("Stack of size "+size+" is created");
		} else {
			System.out.println("Give a valid size between 0 to"+(size-1));
		}
	}
	
	public void push(int element) {
		if(top <= size-1) {
			top++;
			s[top] = element;
		} else {
			System.out.println("Stack is full");
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Poped element is "+s[top]);
			s[top] = 0;
			top--;
		}
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		} else {
			for(int i=top; i>=0; i--) {
			System.out.print(s[i]+" ");
			}
		}
	}
}
