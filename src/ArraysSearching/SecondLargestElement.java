package ArraysSearching;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//Find Second largest element in an array
//Last Updated : 20 Apr, 2024
//Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array. 
//
//Examples:
//
//Input: arr[] = {12, 35, 1, 10, 34, 1}
//Output: The second largest element is 34.
//Explanation: The largest element of the array is 35 and the second largest element is 34
//
//Input: arr[] = {10, 5, 10}
//Output: The second largest element is 5.
//Explanation: The largest element of the array is 10 and the second largest element is 5
public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		secondLargestElement(arr);
		int arr1[] = { 10, 5, 10 };
		// secondLargestElement(arr1);
	}

	static void secondLargestElement(int arr[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : arr) {
			pq.offer(i);

		}
		Set<Integer> set = new HashSet<>();
		int count = 0;
		int max = pq.peek();
		System.out.println(pq);
		while (!pq.isEmpty() & count < 2)

		{
			int poll = pq.poll();
			if (poll < max) {
				System.out.println("second Largest Element is " + poll);
				break;
			} else if (set.add(poll)) {

				count++;
			}
		}

	}

}
