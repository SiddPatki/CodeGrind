// You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
// Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
// If A is already sorted, output -1.

// Input 1: A = [1, 3, 2, 4, 5] 
// Return: [1, 2] 

// Input 2: A = [1, 2, 3, 4, 5] 
// Return: [-1] 

// In the above example(Input 1), if we sort the subarray A1, A2, then whole array A should get sorted.


public class Solution {
	public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		ArrayList<Integer> sortedA = new ArrayList<Integer>(A);
		Collections.sort(sortedA);
		int start=-1;
		int end=-1;
		for(int i = 0 ; i < sortedA.size() ; i++){
			if(A.get(i)!=sortedA.get(i)){
				start=i;
				break;
			}
		}
		for(int j = sortedA.size()-1; j > start; j--){
			if(A.get(j)!=sortedA.get(j)){
				end=j;
				break;
			}
		}
		
		ArrayList<Integer> op = new ArrayList<>();
		if(start==-1 && end==-1){
			op.add(-1);
		}else{
			op.add(start);
			op.add(end);
		}
		return op;
		
		
	}
}
