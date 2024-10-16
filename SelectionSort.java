package SORTING_ALGO;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int []arr = {86, 42, 23, 18, 25};
		
		
		int min;
		int pos;
		for(int i=0; i<=arr.length-2; i++) {
			
			min = arr[i];
			pos = i;
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[j]<min) {
					min = arr[j];
					pos = j;
				}
				
			}
//			arr[i] and arr[pos] swapping
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos]= temp;
			
		}
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
		
	}

}
