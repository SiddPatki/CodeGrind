import java.util.Arrays;

public class String_RadixSort{

	public static void main(String args[]){

		String[] input = {"bcdef","dbaqc","abcde","omadd","bbbbb"};

		radixSort(input, 26, 5);

		System.out.println(Arrays.toString(input));


	}

	public static void radixSort(String[] arr, int radix, int width ){

		for(int i = width-1; i>=0; i--){
			radixSingleSort(arr,i,radix);
		}
		return;
	}

	// "bcdef","dbaqc","abcde","omadd","bbbbb"
	public static void radixSingleSort(String[] arr, int position, int radix){

		int numLength = arr.length;
		int[] countArr = new int[radix];

		//getLetterAscii - return a number between 0 to 25 for letter at position in value
		for(String value : arr){
			countArr[getLetterAscii(value,position)]++;
		}

		for(int j=1; j<radix; j++){
			countArr[j]+=countArr[j-1];
		}

		String[] tempArr = new String[numLength];
		for(int tempIndex = numLength-1; tempIndex>=0; tempIndex-- ){
			tempArr[--countArr[getLetterAscii(arr[tempIndex], position)]] = arr[tempIndex];
		}
		for(int k = 0; k < numLength; k++){
			arr[k]=tempArr[k];
		}
		return;
	}


	public static int getLetterAscii(String value, int position){
		return value.charAt(position)-'a';
	}


}

