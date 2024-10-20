package ALGO_01_LINEAR_SEARCH;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter the elemet of the array index "+i);
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elemet to search");
		int key = sc.nextInt();
		
		int res = linearSearch(arr, key);
		if(res>=0) {
			System.out.println("Key found at index :"+res);
		} else {
			System.out.println("Key Not found.");
		}
	}
	
	
	public static int linearSearch(int [] a, int key) {
		for(int i=0; i<=a.length-1; i++) {
			if(key==a[i]) {
				return i;
			}
		}
		return -1;
	}
}
