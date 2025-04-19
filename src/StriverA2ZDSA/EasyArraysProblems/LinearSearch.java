package StriverA2ZDSA.EasyArraysProblems;
//Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.
//
//Examples:
//
//Example 1:
//Input: arr[]= 1 2 3 4 5, num = 3
//Output: 2
//Explanation: 3 is present in the 2nd index
//
//Example 2:
//Input: arr[]= 5 4 3 2 1, num = 5
//Output: 0
//Explanation: 5 is present in the 0th index

//Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1
//
//
//Examples:
//Input: nums = [2, 3, 4, 5, 3], target = 3
//
//Output: 1
//
//Explanation: The first occurence of 3 in nums is at index 1
//
//Input: nums = [2, -4, 4, 0, 10], target = 6
//
//Output: -1
//
//Explanation: The value 6 does not occur in the array, hence output is -1
public class LinearSearch {
	
	static int linearSearch(int [] nums, int element)
	{
		int i=0;
		while(i <nums.length)
		{
			if(nums[i]== element)
			{
				return i;
				//break;
			}
			i++;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, -4, 4, 0, 10};
		System.out.println(linearSearch(arr, 6));

	}

}
