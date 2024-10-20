package ALGO_02_BINARY_SEARCH;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int key = 90;
		
		int res = Binary(arr,key);
		if(res>0) {
			System.out.println("key found at "+res);
		} else {
			System.out.println("key not found");
		}
	}
	
	
	public static int Binary(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			} else if(key>arr[mid]){
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	
}
