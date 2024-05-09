package ArraysSearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

//https://www.geeksforgeeks.org/find-the-missing-number/
//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
//
//Note: There are no duplicates in the list.
//
//Examples: 
//
//Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
//Output: 5
//Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5
//
//Input: arr[] = {1, 2, 3, 5}, N = 5
//Output: 4
//Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
public class FindTheMissingNumber {

	public static void main(String[] args) {
	int	arr[] = {1, 2, 4, 6, 3, 7, 8}; // N = 8
	System.out.println(FindTheMissingNumberUsingHashSet(arr));
	System.out.println("findmissing: "+ findmissing(arr));

	}
	
	static int FindTheMissingNumberUsingHashSet(int arr[])
	{
	HashSet<Integer>  hset=  new HashSet<>();
	for(int i: arr)
		hset.add(i);
	
	System.out.println(hset);
	
	for (int i = 1; i <= 8; i++) {
	    if (!hset.contains(i)) {
	        return i;
	    }
	}
	// below for loop will not work becoz
	//it will loop in hashset elements only which are already present.
//	for(int i : hset)
//	{
//		if(!hset.contains(i))
//			return i;
//		//System.out.println(i);
//		
//	}
	return -1;
	
	}
	
	// using stream
	static int findmissing(int arr[])
	{
		int n = 8;
		System.out.println("Length of arr "+ n);
//		  return IntStream.rangeClosed(1, n)         // Generate a stream of numbers from 1 to N
//		            .filter(num -> Arrays.stream(arr).noneMatch(x -> x == num)) // Filter out numbers not present in arr
//		            .findFirst()                            // Find the first missing number
//		            .orElse(-1);   
		return IntStream.rangeClosed(1, n)
				.filter(num-> Arrays.stream(arr).noneMatch(x-> x==num))
				.findFirst().orElse( -1);
		
	}
}
