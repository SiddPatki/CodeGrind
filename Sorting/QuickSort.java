// Divide and Conquer Algorithm
// Chooses a Pivot and then partitions the array into left (elements less than Pivot) and right (elements greater than pivot) . Pivot goes in the middle which is its correct position although the left and right may not be sorted in itself.

import java.util.*;

class QuickSort{
	
	public static void main(String args[]){
		
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		int start = 0;
		int end = arr.length;
		quickSort(arr, start, end-1);
		
		System.out.println(Arrays.toString(arr));	
		
		
	}
	static int partition(int arr[], int start, int end) 
	{ 
		int pivot = arr[end];  
		int pIndex = start; // index of smaller element 
		for (int i=start; i<end; i++) 
		{ 
			// If current element is smaller than the pivot 
			if (arr[i] <= pivot) 
			{ 
				// swap arr[pIndex] and arr[i] 
				int temp = arr[pIndex]; 
				arr[pIndex] = arr[i]; 
				arr[i] = temp; 
				
				pIndex++; 
			} 
		} 

		// swap arr[pIndex+1] and arr[end] (or pivot) 
		int temp = arr[pIndex]; 
		arr[pIndex] = arr[end]; 
		arr[end] = temp; 

		return pIndex; 
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	start  --> Starting index, 
	end  --> Ending index */
	static void quickSort(int arr[], int start, int end) 
	{ 
		if (start < end) 
		{ 
			/* pi is partitioning index, arr[pi] is  
			now at right place */
			int pi = partition(arr, start, end); 

			// Recursively sort elements before 
			// partition and after partition 
			quickSort(arr, start, pi-1); 
			quickSort(arr, pi+1, end); 
		} 
	} 
}