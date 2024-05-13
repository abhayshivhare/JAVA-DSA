package ArraysSearching;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//Find the largest three distinct elements in an array
//Last Updated : 07 Mar, 2024
//Given an array with all distinct elements, find the largest three elements.
//
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1). 
//
//Examples :
//
//Input: arr[] = {10, 4, 3, 50, 23, 90}
//Output: 90, 50, 23
public class LargestThreeDistinct {

	public static void main(String[] args) {
		int arr[] = {10, 4, 3, 50, 23, 90};
		LargestThreeDistinct(arr);

	}

	/*
	 * We create a PriorityQueue with a custom comparator set to
	 * Collections.reverseOrder(), which creates a max-heap.
	 */
	
	static void LargestThreeDistinct(int arr[]) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i: arr)
		{
			pq.offer(i);
		}
		
		int count=0;
		Set<Integer> hset= new HashSet<>();
		while(!pq.isEmpty() &&count<3)
		{
			Integer poll = pq.poll();
			if(hset.add(poll));
			{
			System.out.println("Largest Three Distinct Elements"+ poll);
			count++;
			}
			
			
		}
	}
}
