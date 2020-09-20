import java.util.*;

class RadixSort{
	
	public static void main(String args[]){
		
		int[] input = {4725, 4586, 1330, 8792, 1594, 5729};
		
		radixSort(input, 10, 4);
		
		System.out.println(Arrays.toString(input));

		
	}
	
	public static void radixSort(int[] arr, int radix, int width ){
		
		for(int i = 0; i<width; i++){
			radixSingleSort(arr,i,radix);
		}
		return;
	}
	
	public static void radixSingleSort(int[] arr, int position, int radix){
		
		int numLength = arr.length;
		int[] countArr = new int[radix];
		
		for(int value : arr){
			countArr[getDigit(value,position,radix)]++;
		}
		
		for(int j=1; j<radix; j++){
			countArr[j]+=countArr[j-1];
		}
				
		int[] tempArr = new int[numLength];
		for(int tempIndex = numLength-1; tempIndex>=0; tempIndex-- ){
			tempArr[--countArr[getDigit(arr[tempIndex], position, radix)]] = arr[tempIndex];
		}
		for(int k = 0; k < numLength; k++){
			arr[k]=tempArr[k];
		}
		return;
	}
	
	
	
	public static int getDigit(int value, int position, int radix){
		return value/(int)Math.pow(radix,position) % radix;
	}
	
	
}