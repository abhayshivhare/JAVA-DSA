package StriverA2ZDSA.EasyArraysProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Examples

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.*/

/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

		 

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8

Explanation:

n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

*/
public class FindMissingInArray {

	static int missingNumber(int nums[]) {
		int length = nums.length;
		Arrays.sort(nums);
//		for (int i : nums) {
//			System.out.println(i);
//		}

		for (int j = 0; j < length; j++) {
			if (nums[j] != j) {
				return j;
			}
		}
		return length;
	}

//	Better Approach (using Hashing):
//		Intuition:
//		Using the hashing technique, we will store the frequency of each element of the given array. Now, the number( i.e. between 1 to N) for which the frequency will be 0, will be returned. Refer to the article link to know more about hashing.
//
//		Approach:
//		The algorithm steps are as follows:
//
//		The range of the number is 1 to N. So, we need a hash array of size N+1 (as we want to store the frequency of N as well).
//		Now, for each element in the given array, we will store the frequency in the hash array.
//		After that, for each number between 1 to N, we will check the frequencies. And for any number, if the frequency is 0, we will return it.
//		Dry run:
//
//		Assume the given array = {1,3} and N = 3. The hash array will look like the following:
//
//
//		We can clearly see that for index 2 the frequency is 0 and so 2 is our answer

	/*
	 * Summation Approach: Intuition: We know that the summation of the first N
	 * numbers is (N*(N+1))/2. We can say this S1. Now, in the given array, every
	 * number between 1 to N except one number is present. So, if we add the numbers
	 * of the array (say S2), the difference between S1 and S2 will be the missing
	 * number. Because, while adding all the numbers of the array, we did not add
	 * that particular number that is missing.
	 * 
	 * Sum of first N numbers(S1) = (N*(N+1))/2 Sum of all array elements(S2) = i =
	 * 0n-2a[i] The missing number = S1-S2 Approach: The steps are as follows:
	 * 
	 * We will first calculate the summation of first N natural numbers(i.e. 1 to N)
	 * using the specified formula. Then we will add all the array elements using a
	 * loop. Finally, we will consider the difference between the summation of the
	 * first N natural numbers and the sum of the array elements.
	 */
	
	/*
	 * Two important properties of XOR are the following:
	 * 
	 * XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1. XOR of a
	 * number with 0 will result in the number itself i.e. 0 ^ a = a. ←Property 2
	 * 
	 * Now, let’s XOR all the numbers between 1 to N. xor1 = 1^2^.......^N
	 * 
	 * Let’s XOR all the numbers in the given array. xor2 = 1^2^......^N (contains
	 * all the numbers except the missing one).
	 * 
	 * Now, if we again perform XOR between xor1 and xor2, we will get: xor1 ^ xor2
	 * = (1^1)^(2^2)^........^(missing Number)^.....^(N^N)
	 * 
	 * Here all the numbers except the missing number will form a pair and each pair
	 * will result in 0 according to the XOR property. The result will be = 0 ^
	 * (missing number) = missing number (according to property 2).
	 * 
	 * So, if we perform the XOR of the numbers 1 to N with the XOR of the array
	 * elements, we will be left with the missing number.
	 */	public static int missingNumberXOR(int[] nums) {
		int xorfull = 0;
		int xorarr = 0;
		for (int i = 0; i <= nums.length; i++) {
			xorfull = xorfull ^ i;
		}
		for (int num : nums) {
			xorarr = xorarr ^ num;
		}
		return xorfull ^ xorarr;
	}

	public static void main(String[] args) {
		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int[] nums2 = { 0, 1 };
		// System.err.println(missingNumber(nums));
//		/System.err.println(missingNumber(nums2));
		System.err.println(missingNumberXOR(nums));

		System.err.println(missingNumberXOR(nums2));
	}

}
