//Partitions the array into 2 halves - Sorted and Unsorted
//Unlike bubble and selection , Insertion sort grows its sorted partition from Left -> Right
//Assumes the first element is SORTED 
//In each iteration, It inserts the first element of UNSORTED partition in the correct position of SORTED PARTITION
//By shifting elements to the right to make room for the new element.

//In-Place algo
//O(n2) Quadratic
//Stable algo


import java.util.*;

class InsertionSort{
	public static void main(String args[]){
		int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
		
		
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
			int  newElement = array[firstUnsortedIndex]; //Element to be inserted
			int i;
			for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement ; i--){
				//Traverse the sorted partition and looks for the correct position to insert newElement
				//shift the newElement to the left i.e., Move array[i] to the right
				array[i]=array[i-1];
			}
			array[i]=newElement;
		}
		System.out.println(Arrays.toString(array));
		
	}
	
}