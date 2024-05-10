package ArraysSearching;

import java.util.HashSet;
import java.util.Set;

//Find lost element from a duplicated array
//Last Updated : 16 Oct, 2023
//Given two arrays that are duplicates of each other except one element, that is one element from one of the array is missing, we need to find that missing element.
//
//Examples: 
//
//Input:  arr1[] = {1, 4, 5, 7, 9}
//        arr2[] = {4, 5, 7, 9}
//Output: 1
//1 is missing from second array.
//Input: arr1[] = {2, 3, 4, 5}
//       arr2[] = {2, 3, 4, 5, 6}
//Output: 6
//6 is missing from first array.
public class LostElementInDuplicateArray {

	public static void main(String[] args) {
		int arr1[] = { 4, 5, 7, 9,1};
		int  arr2[] = {4, 5, 7, 9};
		System.out.println(LostElementInDuplicateArrayUsingHashSet(arr1, arr2));
	

	}

	static int LostElementInDuplicateArrayUsingHashSet(int arr1[], int arr2[]) {
		
		Set<Integer> set1 = new HashSet<>();
		for(int i: arr2)
		{
			set1.add(i);
		}
		
		for(int i: arr1)
		{System.out.println("i:   +"+i);
			System.out.println("11");
			if(!set1.contains(i))
			{System.out.println("12");
			System.out.println(i);
				return i;
			}
		}
		
		return -1;
		
	}
	
	/*
	 * In Java, HashSet<Integer> set1 = new HashSet<>(); and Set<Integer> set1 = new
	 * HashSet<>(); both declare a variable named set1 and initialize it with a
	 * HashSet object. However, there's a difference in the declaration of the
	 * variable.
	 * 
	 * HashSet<Integer> set1 = new HashSet<>();: This explicitly declares the
	 * variable set1 to be of type HashSet<Integer>. It means that set1 can only
	 * reference objects of type HashSet<Integer>, and you can only access methods
	 * and properties defined in the HashSet class directly on set1. This approach
	 * provides more specificity and clarity in code but restricts the variable to
	 * only use methods and properties of HashSet. Set<Integer> set1 = new
	 * HashSet<>();: This declares the variable set1 to be of type Set<Integer>,
	 * which is an interface. Set is the interface, and HashSet is a class that
	 * implements this interface. Using Set as the variable type allows for more
	 * flexibility because it can reference any object that implements the Set
	 * interface, not just HashSet. It's considered good practice to use interfaces
	 * when declaring variables because it promotes coding to interfaces rather than
	 * implementations, which enhances code flexibility and maintainability. In
	 * summary, both declarations achieve the same outcome of initializing a
	 * HashSet, but the second approach (Set<Integer> set1) provides more
	 * flexibility and adheres to coding best practices by coding to interfaces.
	 */

}
 
