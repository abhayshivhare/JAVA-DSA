package StriverA2ZDSA.EasyArraysProblems;
/*In this article we will learn how to solve the most asked coding interview problem: "Move all Zeros to the end of the array"

Problem Statement: You are given an array of integers, your task is to move all the zeros 
in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Examples

Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining ord*/

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/

public class MoveAllZeroesToEndOfArray {

	/*
	 * Optimal Approach(Using 2 pointers): We can optimize the approach using 2
	 * pointers i.e. i and j. The pointer j will point to the first 0 in the array
	 * and i will point to the next index.
	 * 
	 * Assume, the given array is {1, 0, 2, 3, 2, 0, 0, 4, 5, 1}. Now, initially, we
	 * will place the 2-pointers like the following:
	 * 
	 * 
	 * The algorithm will be the following.
	 * 
	 * Algorithm: First, using a loop, we will place the pointer j. If we don’t find
	 * any 0, we will not perform the following steps. After that, we will point i
	 * to index j+1 and start moving the pointer using a loop. While moving the
	 * pointer i, we will do the following: If a[i] != 0 i.e. a[i] is a non-zero
	 * element: We will swap a[i] and a[j]. Now, the current j is pointing to the
	 * non-zero element a[i]. So, we will shift the pointer j by 1 so that it can
	 * again point to the first zero. Finally, our array will be set in the right
	 * manner.
	 */
	static void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
			System.out.print("Nums of j " + nums[j]);
		}
		System.out.print("araay ");
		for (int i : nums) {
			System.out.print(i + ",");
		}
		// Step 2: Fill the rest of the array with zeros
		while (j < nums.length) {
			nums[j++] = 0;
		}
		System.out.print("final array");
		for (int i : nums) {
			System.out.println(i + ",");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 1, 0, 4, 0 };
		moveZeroes(arr);

	}

}
