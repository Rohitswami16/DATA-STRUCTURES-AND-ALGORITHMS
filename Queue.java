
public class Queue {
	private int q[];
	private int size;
	private int f = -1;
	private int r = -1;
	
	public Queue(int size) {
		if(size > 0) {
			this.size = size;
			q = new int[size];
			System.out.println("Stack of size "+size+" is created");
			} else {
				System.out.println("Give a valid size between 0 to"+(size-1));
			}
	}
	
	public void insert(int element) {
		if(r==size-1) {
			System.out.println("Queue is Full");
		} else {
			r++;
			q[r] = element;
			System.out.println("Element "+element+" is inserted");
		}
	}
	
	public void delete() {
		if ((f==-1 && r==-1) || (f==size-1)) {
			System.out.println("Queue is Empty");
		} else {
			f++;
			System.out.println("Element deleted is "+q[f]);
			q[f]=0;
		}
	}
	
	public void display() {
		if ((f==-1 && r==-1) || (f==size-1)) {
			System.out.println("Queue is Empty");
		} else {
			for(int i=f+1; i<=r; i++) {
				System.out.print(q[i]+" ");
			}
		}
	}

}
