import java.util.*;

class BubbleSort{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int size = sc.nextInt();//SIZE OF THE ARRAY
		int[] unsorted_array = new int[size];
		for(int j=0; j<size; j++){
			unsorted_array[j] = sc.nextInt();
		}
		//ARRAY CREATED
		sc.close();
		
		
		int unsorted_partition_index=size-1;
		int temp=0;//for swapping
		while(unsorted_partition_index>=0){
			for(int  i=0; i<unsorted_partition_index; i++){
				if(unsorted_array[i]>unsorted_array[i+1]){
					temp=unsorted_array[i+1];
					unsorted_array[i+1]=unsorted_array[i];
					unsorted_array[i]=temp;
				}
			}
			unsorted_partition_index--;
		}
		System.out.println(Arrays.toString(unsorted_array));
	}
}

//THIS IS A QUADRATIC ALGORITHM
//PARTITIONS ARRAY INTO SORTED AND UNSORTED HALVES
// INITIALLY THE LOOP ITERATES FROM 0 TO END(unsorted_partition_index) then after each iteration END gets decreased by 1 (unsorted_partition_index--)

//AFTER EACH ITERATION FROM STARTED TO END OF UNSORTED HALF WE ADD AN ELEMENT AT THE START OF SORTED HALF 

//O(n2)