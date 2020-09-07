// O(n)
// Unstable
// Makes assumption about data.

import java.util.*;

class CountingSort{
	
	public static void main(String args[]){
		int[] inputArr = {1, 4, 1, 2, 7, 5, 2};
		countSort(inputArr);	//Range = max(inputArr) min(inputArr)
		System.out.println(Arrays.toString(inputArr));
		
		
	}
	
	public static void countSort(int[] arr){
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = (max - min) + 1;
		int[] count = new int[range];
		
		for(int i=0;i<arr.length;i++){
			count[arr[i]-min]++;
		}
		// [0 2 1 1 1 0 1 2 1 1]
		int temp=0;
		for(int i=0;i<count.length;i++){
			while(count[i]>0){
				arr[temp]=i+min;
				temp++;
				count[i]--;
			}
		}
	}
	
}