package ArraysSearching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

///Given an array, write functions to find the minimum and maximum elements in it. 
public class FindMinMaxElement {

	public static void main(String[] args) {

		List<Integer> elementList = List.of(9,90,5,90,55,12,5, 12, 37, 8, 22, 14, 55, 3, 33, 100);
		FindMinMaxElement fm = new FindMinMaxElement();
		Optional<Integer> minimum = fm.getMinElement(elementList);
		Optional<Integer> maximum = fm.getMaxElement(elementList);
//		minimum.ifPresent(min -> {
//			System.err.println("minimum is:  " + min);
//		});
//		maximum.ifPresent(max -> {
//			System.err.println("maximum is: " + max);
//		});
//		System.out.println("Minimum using Bruteforce : "+ fm.getMinimumElement(elementList));
//		System.out.println("maximum using Bruteforce : "+ fm.getMaximumElement(elementList));
		System.out.println("minimum using hashmap : "+ fm.getMinimumElementUsingHashMap(elementList));
		//System.out.println("minimum using hashset : "+ fm.getMinimumElementUsingHashSet(elementList));
		
	}

	//Using Stream
	Optional<Integer> getMaxElement(List<Integer> list) {
		return list.stream().max(Integer::compareTo);

	}
	Optional<Integer> getMinElement(List<Integer> list) {
		return list.stream().min(Integer::compareTo);

	}
	
	//Using Bruteforce Method
	
	int getMinimumElementUsingHashMap( List<Integer >  elementList) 
	{
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int i : elementList)
		{
			hmap.put(i, hmap.getOrDefault(i, 0)+1);
			
			
		}
		System.out.println("hmap values : "+ hmap);
		System.out.println(" ");
		//Optional<Integer> min = hmap.keySet().stream().min(Integer::compare);
		
		Optional<Integer> min = hmap.keySet().stream()
	            .min((key1, key2) -> {
	                // Print each comparison
	                System.out.println("Comparing " + key1 + " and " + key2);
	                return Integer.compare(key1, key2);  // Perform the actual comparison
	            });
		System.out.println("Min is  " + min);
		  return min.map(value -> value).orElse(null);
		
		
	}
	
	int getMinimumElementUsingHashSet( List<Integer >  elementList) 
	{
		HashSet<Integer> hset = new HashSet<>(elementList);
		Optional<Integer> min = hset.stream().min(Integer::compare);
		System.out.println(min);
		return min.map(x ->x ).orElse(null);
	
		
		
		
	}
	int getMinimumElement( List<Integer >  elementList) 
	{
		//8,3,9,10
		int size = elementList.size();
		int min=0;
		for(int i=0; i< size; i++)
		{
			int item = elementList.get(i);
			//if)
			if(min==0)
			{
			min=item;
			}
			
			if(item<min)
			{
				System.err.println("minimum method: "+item);
				min=item;
			}
			
		}
		return min;
	}
	
	int getMaximumElement( List<Integer >  elementList) 
	{
		int size = elementList.size();
		int max=0;
		for(int i=0; i< size; i++)
		{
			int item = elementList.get(i);
			//if)
			if(max==0)
			{
				max=item;
			}
			
			if(item>max)
			{
				System.err.println(item);
				max=item;
			}
			
		}
		return max;
	}
}
