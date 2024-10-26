

public class Array {
	
	private int[] arr;
	
	
	public Array(int size) {
		
		if(size>=0) {
		arr = new int[size];
		System.out.println("Array of size "+arr.length+" created \n");
		} else {
		System.out.println("Array of size should not be negative \n");
		}
	}
	
	
	public void insert(int index, int element) {
		if(0<=index && arr.length>index) {
			arr[index] = element;
			System.out.println("element "+element+" inserted at index "+index+"\n");
		} else {
			System.out.println("Array of index out of range.\n");
		}
	}
	
	public void delete(int index) {
		if(0<=index && arr.length>index) {
			System.out.println("Array of Element "+arr[index]+" is deleted at index"+index+"\n");
			arr[index] = 0;
		} else {
			System.out.println("Array of index out of range.\n");
		}
	}
	
	public void display() {
		System.out.print("[");
		for(int a : arr) {
			System.out.print(a+", ");
		} 
		System.out.print("]");
	}
	
	public void BinarySearch(int key) {
		
		Sort();
		 int left = 0;
	        int right = arr.length - 1;
	        boolean found = false; 

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	           
	            if (arr[mid] == key) {
	                found = true; 
	                break; 
	            }

	            
	            if (arr[mid] < key) {
	                left = mid + 1;
	            }
	            
	            else {
	                right = mid - 1;
	            }
	        }

	        if (found) {
	            System.out.println("Key found. \n");
	        } else {
	            System.out.println("Key not found. \n");
	        }
	}
	
	public void Sort() {
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
	//		arr[i] and arr[pos] swapping
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos]= temp;
			
		}
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
}