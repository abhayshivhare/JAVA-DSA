package StriverA2ZDSA.EasyArraysProblems;
/*Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6

Input: nums = [3, 3, 0, 99, -40]

Output: 99

Explanation: The largest element in array is 99

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. */

public class LargestElementInArray {

	static int largestElement(int[] array) {
		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;

	}

	public static void main(String[] args) {
		int[] demo = { 3, 3, 6, 1 };
		int[] nums = { 3, 3, 0, 99, -40 };
		int arr[] = { 8, 10, 5, 7, 9 };
		System.err.println(largestElement(demo));
		System.err.println(largestElement(nums));
		System.err.println(largestElement(arr));
	}

}
