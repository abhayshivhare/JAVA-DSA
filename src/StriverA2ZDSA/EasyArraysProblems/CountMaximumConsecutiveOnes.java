package StriverA2ZDSA.EasyArraysProblems;

/*Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Examples:

Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1} 

Output: 2

Explanation: There are two consecutive 1's in the array. 
*/public class CountMaximumConsecutiveOnes {

	static int countMaximumOnes(int[] nums) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;

			} else {
				count = 0;
			}
			maxCount = count > maxCount ? count : maxCount;
		}
		System.out.println("count : " + count);
		System.out.println("maxCount : " + maxCount);
		return maxCount;
	}

	public static void main(String[] args) {
		int[] nums2 = { 1, 1, 0, 1, 1, 1 };
		int[] nums = { 1, 0, 1, 1, 0, 1 };

		System.err.println(countMaximumOnes(nums));

		System.err.println(countMaximumOnes(nums2));
	}

}
