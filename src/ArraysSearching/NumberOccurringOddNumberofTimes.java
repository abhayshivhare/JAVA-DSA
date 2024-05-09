package ArraysSearching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Given an array of positive integers. All numbers occur an even number of times except one number which occurs an odd number of times. Find the number in O(n) time & constant space.
//
//Examples : 
//
//Input : arr = {1, 2, 3, 2, 3, 1, 3}
//Output : 3
//
//Input : arr = {5, 7, 2, 7, 5, 2, 5}
//Output : 5
public class NumberOccurringOddNumberofTimes {
	public static void main(String[] args) {

		List<Integer> list = List.of(5, 7, 2, 7, 5, 2, 5);
		List<Integer> list2 = List.of(1, 2, 3, 2, 3, 1, 3);
		// oddOccurenceUsingHashMap(list);
		oddOccurenceUsingHashMapGetDefaultFun(list);
	}

	// using hashmap
	static void oddOccurenceUsingHashMap(List<Integer> list) {
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			int Key = list.get(i);
			if (hmap.containsKey(Key)) {
				int count = hmap.get(Key);
				count++;
				hmap.put(Key, count);

			} else {
				hmap.put(Key, 1);
			}

		}
		System.out.println(hmap);
		for (int key : hmap.keySet()) {
			int count = hmap.get(key);
			System.out.println("Number " + key + " occurs " + count + " times.");
		}
		for (Entry<Integer, Integer> mapvalue : hmap.entrySet()) {

			if (mapvalue.getValue() % 2 != 0) {
				System.out.println("Key which occurs odd times: " + mapvalue.getKey());
			}
		}

	}

	static void oddOccurenceUsingHashMapGetDefaultFun(List<Integer> list) {
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i : list) {
       System.out.println("hello ");
			hmap.put(i, hmap.getOrDefault(i, 0) + 1);

		}
//above and below loop looks same but these is big diffrence
//		for (int i = 0; i < list.size(); i++) {
//
//			hmap.put(i, hmap.getOrDefault(i, 0) + 1);
//
//		}
		System.out.println(hmap);
		for (int key : hmap.keySet()) {
			int count = hmap.get(key);
			System.out.println("Number " + key + " occurs " + count + " times.");
		}
		for(Entry<Integer, Integer> mapvalue: hmap.entrySet())
		{
			
			if(mapvalue.getValue() %2 != 0 )
			{
				System.out.println("Key which occurs odd times: "+mapvalue.getKey());
			}
		}

	}

}
