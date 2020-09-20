// Largest Problem = sort 7 items(arr length)
	// Use recursion and sort 6 items(arr length-1)
		// Use recursion and sort 5 items(arr length-2)...
			// .
				// Use recursion and sort 3 items
					// Use recursion and sort 2 items
						// Base Case::::  when only 1 item is to be sorted ... Do nothing and return 
					// Now that 1 item is sorted , Insert 2nd in Sorted Array.
				// Now that 2 items are sort , Insert 3rd in Sorted Array.
				
			// .
		// .
	// .
// Now that 6 items are Sorted,  Insert 7th in Sorted Array.


import java.util.*;

class InsertionSortRecursion{
	public static void main(String args[]){
		int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
		insertionSort(array, array.length);
		System.out.println(Arrays.toString(array));
		
	}
	// numItem is the number of items to be sorted
	public static void insertionSort(int[] arr, int numItem){
		
		if(numItem==1){
			return;
		}
		insertionSort(arr, numItem-1); // after this point all 0 to numItem-2 will be sorted. (first numItem-1)
		
		int newElement = arr[numItem-1];
		int i;
		for(i=numItem-1; i>0 && arr[i-1]>=newElement; i--){
			arr[i]=arr[i-1];
		}
		arr[i]=newElement;
	}
}