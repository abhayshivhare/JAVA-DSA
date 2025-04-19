package StriverA2ZDSA.EasyArraysProblems;

import java.util.Arrays;

/*Longest Subarray with given Sum K(Positives)

Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

Examples

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3*/
public class LongestSubArrayWithSumK_PositivesValuesOnly {

	static int lengthOfLongestSubArray(int[] nums, int sum) {
		int count = 0;
		int total = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (total != sum) {
				total = total + nums[i];
				count++;
			}
			else
				return count;
		}
		return -1;

	}

	public static void main(String[] args) {
		int array[] = {2,3,5,1,9};
		System.out.println(lengthOfLongestSubArray(array,10));

	}

}
