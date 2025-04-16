package StriverA2ZDSA.EasyArraysProblems;

import java.util.HashSet;

/*Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Examples

Example 1: 

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2: 

Input: arr[1,1,1,2,2,3,3,3,3,4,4]

Output: arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
*/
public class RemoveDuplicatesInPlaceFromSortedArray {

	/*
	 * Solution 1: Brute Force Intuition: We have to think of a data structure that
	 * does not store duplicate elements. So can we use a Hash set? Yes! We can. As
	 * we know HashSet only stores unique elements.
	 * 
	 * Approach:
	 * 
	 * Declare a HashSet. Run a for loop from starting to the end. Put every element
	 * of the array in the set. Store size of the set in a variable K. Now put all
	 * elements of the set in the array from the starting of the array. Return K.
	 */
	static int sortedArray(int[] nums) {
		HashSet<Integer> sortedArray = new HashSet<>();
		for (int i = 0; i < nums.length; i++)

		{
			sortedArray.add(nums[i]);
		}
		// System.out.print("Sorted Array is:" + sortedArray);
		return sortedArray.size();
		/*
		 * if (nums.length == 0) return 0;
		 * 
		 * int k = 1; // Index to place the next unique number
		 * 
		 * for (int i = 1; i < nums.length; i++) { if (nums[i] != nums[i - 1]) { nums[k]
		 * = nums[i]; k++; } }
		 * 
		 * return k;
		 */
	}

	/*
	 * Solution 2: Two pointers Intuition: We can think of using two pointers ‘i’
	 * and ‘j’, we move ‘j’ till we don't get a number arr[j] which is different
	 * from arr[i]. As we got a unique number we will increase the i pointer and
	 * update its value by arr[j].
	 * 
	 * Approach: Take a variable i as 0; Use a for loop by using a variable ‘j’ from
	 * 1 to length of the array. If arr[j] != arr[i], increase ‘i’ and update arr[i]
	 * == arr[j]. After completion of the loop return i+1, i.e size of the array of
	 * unique elements.
	 */
	static int sortedArrayUsingTwoPointer(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, };
		int[] arr2 = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };
		//System.out.println("Total number of unique elements are" + sortedArray(arr));
		//System.out.println("Total number of unique elements are" + sortedArray(arr2));
		System.out.println("Total number of unique elements are" + sortedArrayUsingTwoPointer(arr));
		System.out.println("Total number of unique elements are" + sortedArrayUsingTwoPointer(arr2));

	}

}
