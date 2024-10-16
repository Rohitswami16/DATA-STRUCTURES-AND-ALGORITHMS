package SORTING_ALGO;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int arr[] = new int[sc.nextInt()];
	
	for(int i=0; i<=arr.length-1; i++) {
		System.out.println("Enter the element "+i);
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Before sorting");
	for(int a : arr) {
		System.out.println(a+" ");
	}
		
	 int res[] = Sorting(arr);
	 
	 System.out.println("After sorting");
	 for(int a: res){
			System.out.print(a+" "); 
		}

	}
	
	
	
	public static int[] Sorting(int[] arr) {
		
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=0; j<=arr.length-2-i; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
		
	}
}




