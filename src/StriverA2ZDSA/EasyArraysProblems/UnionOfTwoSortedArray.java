package StriverA2ZDSA.EasyArraysProblems;

/*Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

Examples

Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}

Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5} 

Example 2:
Input:
n = 10,m = 7.
arr1[] = {1,2,3,4,5,6,7,8,9,10}
arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12} */
public class UnionOfTwoSortedArray {

	static void union(int[] arr1, int[] arr2) {
		int maxUnionSize = arr1.length > arr2.length ? arr1.length : arr2.length;
		System.out.println("max union array size : " + maxUnionSize);
		int[] unionArray = new int[maxUnionSize];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					unionArray[k++] = arr1[i];
					break;
				}
			}
		}
		for (int l : unionArray) {
			System.out.println("union elements are: " + l);
		}
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5}  ;
		int arr2[] = {2,3,4,4,5};
		union(arr1, arr2);

	}

}
