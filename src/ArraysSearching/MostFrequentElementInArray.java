package ArraysSearching;

import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//Input : arr[] = {1, 3, 2, 1, 4, 1}
//Output : 1
//Explanation: 1 appears three times in array which is maximum frequency.
//
//Input : arr[] = {10, 20, 10, 20, 30, 20, 20}
//Output : 20
public class MostFrequentElementInArray {

	public static void main(String[] args) {
		int arr1[] = {1,2,1, 2, 2, 2,1, 4, 1,1};
		int arr2[] = {10, 20, 10, 20, 30, 20, 20};
		//mostFrequentElementInArray(arr2);
		
		//mostFrequentElementInArrayUsingSingleLoop(arr1);
		mostFrequentElementInArrayUsingHashMap(arr1);
	}
	
	//Two Loop Methods : Tc : O(n^2) as two for loop are running.
	static void mostFrequentElementInArray(int arr[])
	{
		int length= arr.length-1;
		int maxcount=0;
		int mostfrequenetelement=0;
		if(arr == null || length <=0)
		{
			System.out.println("No elements in the array. ");
			
		}
		
		for(int i =0; i<=length; i++)
		{
			int count =0;
			for(int j=0; j<=length; j++)
			{
				if(arr[i]==arr[j])
				{
				count++;
				}
			}
			if(count> maxcount)
			{
				maxcount=count;
				mostfrequenetelement=arr[i];
			}
			
		}
		System.out.println("Most frequent element is: " + mostfrequenetelement + " and its occurence is : " + maxcount);
	}
	
	
	static void mostFrequentElementInArrayUsingSingleLoop(int arr[])
	{
		int length= arr.length-1;
		int maxcount=1;
		int count=1;
		int mostfrequenetelement=1;
		Arrays.sort(arr);
		if(arr == null || length <=0)
		{
			System.out.println("No elements in the array. ");
			
		}
		//int arr2[] = {10, 10, 20, 20, 20, 30}; sorted array
		for(int i =1; i<=length; i++)
		{
			if(arr[i]==arr[i-1] )
			{
				count++;		
			}
			else 
				count =1;
			if(count> maxcount)
			{
			maxcount=count;
			mostfrequenetelement=arr[i-1];
			
			}
		}
		System.out.println("Most frequent element is: " + mostfrequenetelement + " and its occurence is : " + maxcount);
	}
	
	
	static void mostFrequentElementInArrayUsingHashMap(int arr[])
	{
		int length= arr.length;
		int maxcount=0;
		
		int mostfrequenetelement=1;
		Map<Integer, Integer> hmap= new HashMap<Integer,Integer>();
		
		for(int i =0; i<length; i++)
		{
			int key = arr[i];
			if(hmap.containsKey(key))
			{
				int count=hmap.get(key);
				count ++;
				hmap.put(key, count);
		    }
			else
			hmap.put(key, 1);
		}
		
		for (Entry<Integer, Integer> value: hmap.entrySet())
		{
			if(maxcount < value.getValue())
			{
				mostfrequenetelement= value.getKey();
				maxcount= value.getValue();
	
			}
			
		}
		
		
		System.out.println("Most frequent element is: " + mostfrequenetelement + " and its occurence is : " + maxcount);
	}

}

