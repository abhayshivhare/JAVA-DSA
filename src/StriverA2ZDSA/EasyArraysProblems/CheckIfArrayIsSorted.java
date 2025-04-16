package StriverA2ZDSA.EasyArraysProblems;

/*Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Note: Two consecutive equal values are considered to be sorted.

Examples

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.


Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.

*/

class CheckIfArrayIsSorted {

	static boolean isSorted(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] demo = { 1, 2, 3, 3, 5 };
		int[] nums = { 5, 4, 6, 7, 8 };
		int arr[] = { 8, 10, 5, 7, 9, 7 };
		System.err.println(isSorted(demo));
		System.err.println(isSorted(nums));
		// System.err.println(isSorted(arr));

	}

}
