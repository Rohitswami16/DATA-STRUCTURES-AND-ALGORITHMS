package SORTING_ALGO;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[] = {86, 42, 23, 18, 25};
		
		for(int i=1; i<=arr.length-1; i++) {
			int item = arr[i];
			
			int j=i-1;
			while(j >= 0 && arr[j]> item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
}
