package ArraysSearching;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInASortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 3, 3, 10 }; // x = 3
		int arr2[] = { 1, 1, 2, 4, 4, 4, 6, 6 }; // x = 4
		int arr3[] = { 1, 1, 1, 2, 2 };// x = 1
		//isMajority(arr3, 1);
		isMajorityUsingHashMap(arr3, 1);
	}

	//bruteforce mrthod
	static void isMajority(int arr[], int x) {
		int count = 0;
		int arraylength = arr.length;
		for (int i : arr) {

			if (i == x)
				count++;
		}
		if (count > arraylength / 2) {

			System.out.println(x + " appears more than n/2 times in the given array and its Count is :" + count);
		} else
			System.out.println(x + " doesn't appear more than n/2 times in the given array nd its Count is " + count);

	}

	// using hashmap
	static void isMajorityUsingHashMap(int arr[], int x) {
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int length = arr.length;
		for (int i : arr) {
			hmap.put(i, hmap.getOrDefault(i, 0) + 1);

		}
		System.out.println(hmap);
		int count = hmap.getOrDefault(x, 0);
		if (count > length / 2) {

			System.out.println(x + " appears more than n/2 times in the given array and its Count is :" + count);
		} else {
			System.out.println(x + " doesn't appear more than n/2 times in the given array nd its Count is " + count);
		}
	}

}
