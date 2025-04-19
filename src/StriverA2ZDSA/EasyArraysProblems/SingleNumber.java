package StriverA2ZDSA.EasyArraysProblems;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

 */
public class SingleNumber {

//	/[4,1,2,1,2]
	// Brute force method
	static int singleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;

				}

			}
			if (count == 1)
				return nums[i];

		}

		return -1;
	}

	// XOR
	/*
	 * How it works: Uses the XOR bitwise operator.
	 * 
	 * XOR of two same numbers is 0 (e.g., a ^ a = 0)
	 * 
	 * XOR of any number with 0 is the number itself (e.g., 0 ^ a = a)
	 * 
	 * So, if you XOR all the elements, the duplicates cancel out, and you're left
	 * with the unique one.
	 * 
	 * 📊 Time Complexity: O(n) – loops through the array once.
	 * 
	 * 💾 Space Complexity: O(1) – only one variable is used.
	 * 
	 * ✅ Pros: Fast and efficient, even for very large arrays.
	 * 
	 * Meets the constraint of linear runtime and constant extra space.
	 */
	static int singleNumberXOR(int[] nums) {
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			num ^= nums[i];

		}

		return num;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 2, 1 };
		System.err.println(singleNumberXOR(arr1));

	}

}
