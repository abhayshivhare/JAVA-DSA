package ArraysSearching;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

//Given an array of n integers, find the third largest element. All the elements in the array are distinct integers. 
//Example : 
//
//Input: arr[] = {1, 14, 2, 16, 10, 20}
//Output: The third Largest element is 14
//
//Explanation: Largest element is 20, second largest element is 16 
//and third largest element is 14
//
//Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
//Output: The third Largest element is 16
//
//Explanation: Largest element is 20, second largest element is 19 
//and third largest element is 16 
public class ThirdLargestElement {

	public static void main(String[] args) {

	int 	arr[] = {1, 14, 2, 16, 10, 20,15};
	//System.out.println(ThirdLargestElement(arr));
	
	System.out.println(ThirdLargestElementUsingPriorityQueue(arr));

	}
	// Bruteforce Method
	static int ThirdLargestElement(int arr[])
	{
		Arrays.sort(arr);
		System.out.println( arr[arr.length -3]);
		
        return arr[arr.length - 3];

	}
	
	
	/*
	 * In the provided Java code, the priority queue pq is initialized as a min-heap
	 * with a capacity of 3. When elements are inserted into this priority queue,
	 * they are ordered based on their natural ordering (if they implement the
	 * Comparable interface) or based on a custom comparator provided at the time of
	 * creation.
	 * 
	 * Let's examine how the elements are inserted and how their priorities are
	 * determined:
	 * 
	 * Initialization: A priority queue is created with a capacity of 3, meaning it
	 * can hold up to 3 elements. Since no custom comparator is provided, the
	 * natural ordering of integers is used (from smallest to largest). Insertion:
	 * The first 3 elements of the array (arr) are added to the priority queue using
	 * the offer() method. During insertion, the priority queue maintains the heap
	 * property, ensuring that the smallest element is at the root (top of the
	 * heap). Heap Property: After the initial insertion, if the size of the
	 * priority queue exceeds its capacity (3), the smallest element (root of the
	 * heap) is removed to maintain the capacity constraint. This is done by calling
	 * pq.poll(). Remaining Elements: The remaining elements of the array (arr) are
	 * then added to the priority queue. If the size of the priority queue exceeds 3
	 * at any point, the smallest element is removed to maintain the capacity
	 * constraint. Final Result: After all elements have been inserted, the top
	 * element of the priority queue (the root of the heap) is returned. This
	 * element represents the third largest element in the original array. So, while
	 * inserting elements into the priority queue, their priority is determined
	 * based on their natural ordering (from smallest to largest), and the priority
	 * queue ensures that it only retains the top 3 elements, discarding any smaller
	 * ones beyond that.
	 */static int ThirdLargestElementUsingPriorityQueue(int arr[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>(3);
		for(int i =0; i<3; i++)
		{
			pq.offer(arr[i]);
		}
		
		System.out.println("queue elements: "+ pq);
		
		for(int i=3;i<arr.length; i++)
		{
			pq.offer(arr[i]);
			System.out.println("queue added elements: "+ pq);
			if(pq.size()>3)
			{
				pq.poll();
			}
			
		}
		System.out.println("queue elements after loop: "+ pq);
		return pq.peek();
		
		
	}
	
	/*
	 * A PriorityQueue in Java is an implementation of the Queue interface that
	 * provides a way to store elements in a priority order. Unlike a regular queue,
	 * where elements are retrieved in a first-in-first-out (FIFO) manner, a
	 * priority queue retrieves elements based on their priority.
	 * 
	 * Here's how a PriorityQueue works:
	 * 
	 * Priority Ordering: Elements in a priority queue are ordered based on their
	 * natural ordering (if they implement the Comparable interface) or a custom
	 * comparator provided at the time of PriorityQueue creation. Adding Elements:
	 * When you add an element to a priority queue using the offer() method, it is
	 * inserted into the queue according to its priority. The element with the
	 * highest priority (i.e., the smallest according to the natural ordering or the
	 * one that comes first according to the comparator) will be at the front of the
	 * queue. Removing Elements: When you retrieve an element from the priority
	 * queue using methods like poll() or peek(), the element with the highest
	 * priority is removed from the queue and returned. If there are multiple
	 * elements with the same highest priority, any one of them may be removed.
	 * Internal Data Structure: Internally, a priority queue typically uses a binary
	 * heap data structure to maintain the elements in a partially ordered manner.
	 * This data structure allows for efficient addition and removal of elements
	 * while maintaining the priority order. Performance: The time complexity of
	 * adding an element to a priority queue (offer()) is O(log n), and the time
	 * complexity of removing an element (poll() or peek()) is also O(log n), where
	 * n is the number of elements in the queue. PriorityQueue is useful in
	 * scenarios where you need to process elements in order of their priority, such
	 * as in algorithms like Dijkstra's shortest path algorithm, Prim's minimum
	 * spanning tree algorithm, and A* search algorithm, among others.
	 */
}
