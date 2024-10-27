import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		Stack s = new Stack(size);
		
		
		while(true) {
			System.out.println("Choose a option");
			System.out.println("Press 1 to Push \nPress 2 to Pop \nPress 3 to Display \nAny other to Stop ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Enter the Element");
			 		 s.push(sc.nextInt());
			 		 break;
			case 2 : s.pop(); 
					 break;
			case 3 : s.display();
					 break;
			default : return;
			}
		}

	}

}
