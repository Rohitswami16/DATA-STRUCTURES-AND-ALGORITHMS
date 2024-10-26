
import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WELCOME TO ARRAY IMPLEMENTATION");
		System.out.println("ENTER ARRAY SIZE");
		Array arr = new Array(sc.nextInt());
		
		
		 while (true) {
	     System.out.println("PLEASE CHOOSE AN OPTION");
	     System.out.println("PRESS-1 TO INSERT \nPRESS-2 TO DELETE \nPRESS-3 TO DISPLAY \nPRESS-4 TO SEARCH \nPRESS-5 TO SORT \nANY OTHER NUMBER TO STOP \n");

	     int num = sc.nextInt();

		     switch (num) {
		     case 1 : System.out.println("Enter position and value to insert: ");
		     arr.insert(sc.nextInt(), sc.nextInt());
		     break;
		     
		     case 2 : System.out.println("Enter the position to delete: ");
		     arr.delete(sc.nextInt());
		     break;
		     
		     case 3: System.out.println("Array Elements are: ");
		     arr.display();
		     break;
		     
		     case 4:System.out.println("Enter the value to search: ");
		     arr.BinarySearch(sc.nextInt());
		     break;
		     
		     case 5:System.out.println("Sorted Array is: ");
		     arr.Sort();
		     break;
		     
		     default:System.out.println("Exiting...");
		     break;
		     }
		    
		 }

	}
	
}
