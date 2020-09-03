// Divide and Conquer Algorithm
// Chooses a Pivot and then partitions the array into left (elements less than Pivot) and right (elements greater than pivot) . Pivot goes in the middle which is its correct position although the left and right may not be sorted in itself.

import java.util.*;

class QuickSort{
	
	public static void main(String args[]){
		
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		int low = 0;
		int high = arr.length;
		quickSort(arr, low, high-1);
		
		System.out.println(Arrays.toString(arr));	
		
		
	}
	static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high];  
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			// If current element is smaller than the pivot 
			if (arr[j] < pivot) 
			{ 
				i++; 

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low  --> Starting index, 
	high  --> Ending index */
	static void quickSort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is  
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			quickSort(arr, low, pi-1); 
			quickSort(arr, pi+1, high); 
		} 
	} 
}