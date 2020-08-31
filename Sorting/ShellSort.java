//Variation of Insertion Sort (involved a lot of shifting)

//It works on neighbours at Gaps instead of adjacent.
//As the algo progresses , the Gap is reduced.
//The last gap value is 1.

//The last iteration of Shell Sort performs an Insertion Sort but the array will be  more sorted than at the beginning.

//Does some preliminary work that puts the elements closer to the their correct position, and then performs Insertion Sort. Therefore lot less shifting is involved.

//Many variations of Gap calculation. Popular one is Knuth Sequence in which GAP = (3^k -1)/2 ( k  is based on the length of the array 	
//Initial GAP value is as close as possible to the length of the array ,without being greater than the length.

//OUR IMPLEMENTATION DOES NOT INVOLVE THIS SEQUENCE. We take initial GAP value = length/2.  In Each iteration we divide the GAP value by 2 until we reach 1. Then we perform Insertion Sort.

import java.util.*;

class ShellSort{
	
	public static void main(String args[]){
		int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
		
		
		for(int gap = array.length/2; gap > 0; gap/=2){
			for(int i = gap; i < array.length; i++){
				int newElement = array[i];
				
				int j;
				for(j = i; j >= gap && array[j-gap] > newElement; j-=gap){
					array[j]=array[j-gap];
				}
				array[j]=newElement;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
















