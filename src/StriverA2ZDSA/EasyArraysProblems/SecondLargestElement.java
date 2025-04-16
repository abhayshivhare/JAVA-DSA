package StriverA2ZDSA.EasyArraysProblems;

/*Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
*/
public class SecondLargestElement {

	static int secondLargestElement(int[] array) {
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
		System.err.println(secondLargestElement(demo));
		System.err.println(secondLargestElement(nums));
		System.err.println(secondLargestElement(arr));

	}

}
