import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		
		
		while(true) {
			System.out.println("Choose a option");
			System.out.println("Press 1 to Insert \nPress 2 to Delete \nPress 3 to Display \nAny other to Stop ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Enter the Element");
			 		 q.insert(sc.nextInt());
			 		 break;
			case 2 : q.delete(); 
					 break;
			case 3 : q.display();
					 break;
			default : return;
			}
		}

	}

}
