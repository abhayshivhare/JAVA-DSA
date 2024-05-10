package ArraysSearching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//Find the first repeating element in an array of integers
//Last Updated : 06 Jul, 2023
//Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest. 
//
//Examples: 
//
//Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//Output: 5 
//Explanation: 5 is the first element that repeats
//
//Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
//Output: 6 
//Explanation: 6 is the first element that repeats
public class FirstRepeatingElement {

	public static void main(String[] args) {
		
		
		
		List<Integer> list1 = List.of(10, 5,2 ,3,2, 4, 3,2, 6);
		List<Integer> list2 = List.of( 10, 5, 4,6, 9, 120, 4, 6, 10);
		//FirstRepeatingElementUsingHashSet(list1);
		//FirstRepeatingElementUsingHashSet(list2);
		//System.out.println(FirstRepeatingElementUsingHashMap(list2));
        int arr[] = { 6, 10, 5, 4, 9, 6,120, 4, 6, 10};
        //printFirstRepeating(arr);
        System.out.println(firstRepeatingElement(arr));
		
		
	}
	
	//using Hashmap
		static int FirstRepeatingElementUsingHashMap(List<Integer> list)
		{
			HashMap<Integer, Integer> hashMap = new HashMap<>();
			int minIndex=Integer.MAX_VALUE;
			int result=-1;
			for(int i =0; i<list.size()-1; i++)
			{
				if(hashMap.containsKey(list.get(i)))
				{
					if(hashMap.get(list.get(i)) < minIndex)
					{
						minIndex= hashMap.get(list.get(i));
						result= list.get(i);
						
					}
				}
				
				else
				{
				hashMap.put(list.get(i), i);
				}
			}
			return result;
		}
	
		//using LinkedHashMap
		public static int firstRepeatingElement(int[] arr) {
	        Map<Integer, Integer> elementIndices = new LinkedHashMap<>();
	        int result = -1;

	        for (int num : arr) {
	            if (elementIndices.containsKey(num)) {
	                result = num;
	                break;
	            } else {
	                elementIndices.put(num, 1);
	            }
	        }

	        return result;
	    }

		
	//using hashset
	static void FirstRepeatingElementUsingHashSet(List<Integer> list)
	{
		HashSet<Integer > hashSet = new HashSet<>();
		int min=-1;
		System.out.println("Size"+ list.size());
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.println(list.get(i));
			System.out.println((hashSet.contains(list.get(i))));
			if(hashSet.contains(list.get(i)))
			{
				min=i;
				 System.out.println("min is : "+ min);
			}
			else
				hashSet.add(list.get(i));
				
			System.out.println(hashSet);
		}
		if (min != -1)
            System.out.println(
                "The first repeating element is "
                + list.get(min));
        else
            System.out.println(
                "There are no repeating elements");
		
		
		
	}

}
