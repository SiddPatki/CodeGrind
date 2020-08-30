import java.util.*;

class SelectionSort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();//SIZE OF THE ARRAY
		
		int[] array = new int[size];
		
		for(int j=0; j<size; j++){
			array[j] = sc.nextInt();
		}
		//ARRAY CREATED
		sc.close();
		
		//Initially entire array will be unsorted
		//Find the largest element in the unsorted array
		//Assume largest to first element and keep comparing / replacing it with other elements in the unsorted array
		//Replace the largest element found in the unsorted array with the last_index_of_array and then reduce this index by 1.
		
		int lastUnsortedIndex = size-1;//6
		int temp=0;	
		
		//[20, 35, -15, 7, 55, 1, -22]
		//[-15, -22, 7, 1, 20, 35, 55]
		
		
		for(int j = lastUnsortedIndex; j > 0; j--){
			
			int largest=0;
			
			for(int i = 1; i <= j; i++){
				if(array[i] > array[largest]){
					largest=i;
				}
			}
			
			temp = array[j];
			array[j] = array[largest];
			array[largest] =temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}

//THE OUTER LOOP IS INCREASING THE SORTED PARTITION BY 1 , GROWING FROM RIGHT -> LEFT
//THE INNER LOOP IS FINDING THE LARGEST ELEMENT IN THE UNSORTED PARTITION
//SWAP THE LARGEST WITH LAST ELEMENT IN THE UNSORTED PARTITION

//O(n2)