import java.util.*;

class BubbleSort{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int size = sc.nextInt();//SIZE OF THE ARRAY
		
		int[] array = new int[size];
		
		for(int j=0; j<size; j++){
			array[j] = sc.nextInt();
		}
		//ARRAY CREATED
		sc.close();
		
		bubbleSort(array);
	}
	
	public static void bubbleSort(int[] array){
		int size = array.length;
		int unsorted_partition_index=size-1;
		while(unsorted_partition_index>=0){
			for(int  i=0; i<unsorted_partition_index; i++){
				if(array[i]>array[i+1]){
					swap(array,i,i+1);
				}
			}
			unsorted_partition_index--;
		}
		System.out.println(Arrays.toString(array));

	}
	
	
	public static void swap(int[] array, int i, int j ){
		int temp=0;//for swapping
		temp=array[j];
		array[j]=array[i];
		array[i]=temp;
	}
}

//THIS IS A QUADRATIC ALGORITHM
//PARTITIONS ARRAY INTO SORTED AND UNSORTED HALVES
// INITIALLY THE LOOP ITERATES FROM 0 TO END(unsorted_partition_index) then after each iteration END gets decreased by 1 (unsorted_partition_index--)

//AFTER EACH ITERATION FROM STARTED TO END OF UNSORTED HALF WE ADD AN ELEMENT AT THE START OF SORTED HALF 

//O(n2)