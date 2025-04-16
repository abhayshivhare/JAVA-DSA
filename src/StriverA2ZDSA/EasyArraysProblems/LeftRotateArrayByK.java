package StriverA2ZDSA.EasyArraysProblems;

/*Problem Statement: Given an array of N integers, left rotate the array by one place.

Examples

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.


Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so 
the element at first index will be shifted to 
last index which is also by the way the first index.*/

/*Input: nums = [1, 2, 3, 4, 5]

Output: [2, 3, 4, 5, 1]

Explanation: Initially, nums = [1, 2, 3, 4, 5]

Rotating once to left -> nums = [2, 3, 4, 5, 1]

Input: nums = [-1, 0, 3, 6]

Output: [0, 3, 6, -1]

Explanation: Initially, nums = [-1, 0, 3, 6]

Rotating once to left -> nums = [0, 3, 6, -1]*/

/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
public class LeftRotateArrayByK {

	static int[] leftRotateByK(int[] nums, int k) {
		int j = 0;
		int[] leftRotateArray = new int[nums.length];
		for (int i = nums.length - k; i < nums.length; i++)

		{
			leftRotateArray[j++] = nums[i];

		}

		for (int l = 0; l < nums.length - k; l++) {
			leftRotateArray[j++] = nums[l];
		}
		System.out.println("array values: ");
		for (int i : leftRotateArray) {

			System.out.print(i + ",");
		}
		return leftRotateArray;
	}

	/*
	 * 🔁 Optimal Approach Using Reversal: To rotate an array to the right by k
	 * steps:
	 * 
	 * Reverse the whole array
	 * 
	 * Reverse the first k elements
	 * 
	 * Reverse the remaining (n - k) elements
	 * 
	 * 
	 * 
	 * For nums = [1,2,3,4,5,6,7], k = 3:
	 * 
	 * Reverse all: [7,6,5,4,3,2,1]
	 * 
	 * Reverse first 3: [5,6,7,4,3,2,1]
	 * 
	 * Reverse last 4: [5,6,7,1,2,3,4] ✅
	 */
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k%n;
		System.out.println(" Reverse the whole array : ");
		reverse(nums, 0, n - 1);
		System.out.println(" Reverse the first k elements : ");
		reverse(nums, 0, k-1);
		System.out.println(" Reverse the remaining (n - k) elements : ");
		reverse(nums, k, n - 1);

	}

	static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		for (int i : nums)
			System.out.print(i + ",");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr3 = { 1 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr4 = { -1, -100, 3, 99 };
//		System.out.println("Left Rotate Array By K is:" + leftRotateByK(arr, 3));
		// System.out.println("Left Rotate Array By K is:" + leftRotateByK(arr2, 3));
//		System.out.println("Left Rotate Array By K is:" + leftRotateByK(arr3, 1));
//		System.out.println("Left Rotate Array By K is:" + leftRotateByK(arr4, 2));

		rotate(arr2, 3);

	}

}
