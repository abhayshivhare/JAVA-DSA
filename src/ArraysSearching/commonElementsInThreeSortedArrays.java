package ArraysSearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class commonElementsInThreeSortedArrays {

	public static void main(String[] args) {
		
		int ar1[] = {1, 5, 10, 20, 40, 80}; 
		int ar2[] = {6, 7, 20, 80, 100} ;
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} ;
		
		

	}

	static void commonElementsUsingSet(int[]ar1,int[]ar2,int[]ar3 )
	{
	Set<Integer> set1 = new HashSet<>();
	for(int i: ar1)
	{
		set1.add(i);
		
	}
	Set<Integer> set2 = new HashSet<>();
	for(int i: ar2)
	{
		set2.add(i);
		
	}
	Set<Integer> set3 = new HashSet<>();
	for(int i: ar3)
	{
		set3.add(i);
		
	}
	set1.retainAll(set2);
	set1.retainAll(set3);
	
	System.out.println(set1);
	}
	
	
	//using 2 pointer
	
	static void commonElementsUsingTwoPointer(int[]ar1,int[]ar2,int[]ar3 )
	{
		
		for(int i=0; i<ar1.length; i++)
		{
			
			for (int j=0; j<ar2.length;j++)
			{
				
				
			}
		}
		
	}
}
