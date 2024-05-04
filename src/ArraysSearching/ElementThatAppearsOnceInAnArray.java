package ArraysSearching;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class ElementThatAppearsOnceInAnArray {

	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 4, 5, 3, 4};
		// elementThatAppearsOnceInAnArray(arr);
		//elementThatAppearsOnceInAnArrayUsingHashTable(arr);
		elementThatAppearsOnceInAnArrayUsingXOR(arr);

	}

	// Using Brute Force Method
	static void elementThatAppearsOnceInAnArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					count++;
				}

			}
			if (count == 1) {

				System.out.println("elementThatAppearsOnceInAnArray :" + arr[i]);
				return;
			}

		}
		System.out.println("No such element found.");

	}

	// Using HashMap
	static void elementThatAppearsOnceInAnArrayUsingHashTable(int arr[]) {
		int element;
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (hmap.containsKey(key)) {
				int count = hmap.get(key);
				count++;
				hmap.put(key, count);

			} else {
				hmap.put(key, 1);
			}

		}

		for (Entry<Integer, Integer> value : hmap.entrySet()) {
			if (value.getValue() == 1) {
				element = value.getKey();
				System.out.println("elementThatAppearsOnceInAnArray :" + element);
			}

		}

	}

//	When we XOR two equal numbers, the result is 0. So, if there are duplicate elements, their XOR will cancel each other out.
//	If an element occurs only once, its XOR with 0 (initial value) will be itself.
//	Therefore, after XORing all elements, the result will be the element that appears only once.
//	In summary, the XOR operation effectively cancels out the duplicates and leaves only the element that occurs once.
	static void elementThatAppearsOnceInAnArrayUsingXOR(int arr[]) {

		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {

			result = result ^ arr[i];

		}
		System.out.println("elementThatAppearsOnceInAnArrayUsingXOR " + result);
	}

}
