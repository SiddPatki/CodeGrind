//Divide and Conquer Recursice Algo

import java.util.*;

class Descending_MergeSort{
	
	public static void main(String args[]){
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(array, 0, array.length);
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void mergeSort(int[] arr, int start, int end){
		
		//BASE CASE - If only single element in array them its already sorted.
		if(end - start < 2){
			return;
		}
		
		int mid = (start + end)/2;
		
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		//We always merge sorted partitions so arr here would be sorted in start-mid and mid-end.
		merge(arr, start, mid, end);
		
	}
	//20, 35, -15, 7, 55, 1, -22
	public static void merge(int[] inputArr,int start, int mid, int end){
		
		
		//OPTIMISATION - if the arrays are already in sorted order and the left array and all its elements are shorter than the right array and all its elements , then we just return.  This can be checked by comparing the last element of the first arr and last element of the second arr.
		if(inputArr[mid-1] >= inputArr[mid]){
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int tempArr[] = new int[end-start]; // We will copy this tempArr in the main array between start and end
		
		//{34 ,32} {36 ,33} 
		while(i < mid && j < end){
			tempArr[tempIndex++] = (inputArr[i] >= inputArr[j]) ? inputArr[i++] : inputArr[j++];
		}
		//If there are elements remaining in the right array they don't need to be copied as that would just overwrite the same data, as their positions would be same.
		 
		//There could be elements remaining in the left array(sorted) incase the right array reaches the end. We need  to copy them at the end of the tempArr.
		
		System.arraycopy(inputArr, i, inputArr, start + tempIndex, mid-i); //copies only remaining elements from LEFT arr.
		//since there is not rearrangement we can just shift the remaining element (current starting pos. i) from the  left arr to their correct position (start + tempIndex) i.e., at the end of the copied elements.
		
		System.arraycopy(tempArr, 0, inputArr, start, tempIndex); //copy only the elements rearranged and placed in the tempArr
		
		
		
		
	}
	
}