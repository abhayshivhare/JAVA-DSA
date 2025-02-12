package Strings;

import java.util.HashMap;
import java.util.Map;

//Sort string of characters
//Last Updated : 29 Feb, 2024
//Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.
//
//Examples: 
//
//Input : bbccdefbbaa 
//Output : aabbbbccdef
//Input : geeksforgeeks
//Output : eeeefggkkorss

public class SortStringOfCharacters {

	public static void main(String[] args) {
		String str1="bbccdefbbaa ";
		String str2="geeksforgeeks";
		System.out.println("Sorted order is :" + SortingUsingHashMap(str1));
		System.out.println("Sorted order is :" + SortingUsingHashMap(str2));

	}

	/*
	 * Certainly! Let's break down the getOrDefault method with an example:
	 * 
	 * Suppose we have a HashMap named charCounts that stores the count of
	 * characters. Initially, it's empty. We want to count the occurrences of
	 * characters in a string.
	 * 
	 * java Copy code Map<Character, Integer> charCounts = new HashMap<>(); Now,
	 * let's say we have a string "abbccc".
	 * 
	 * java Copy code String str = "abbccc"; getOrDefault(c, 0):
	 * 
	 * This method retrieves the value associated with the specified key c in the
	 * map charCounts. If c is present in the map, it returns the corresponding
	 * value (count of c). If c is not present in the map, it returns the default
	 * value 0. Example:
	 * 
	 * Let's say we want to get the count of character 'b' in the map charCounts.
	 * Initially, the map is empty, so 'b' is not present in the map. Thus,
	 * getOrDefault('b', 0) will return 0. getOrDefault(c, 0) + 1:
	 * 
	 * After getting the count of character c, we add 1 to it. This effectively
	 * increments the count of character c in the map charCounts. Example:
	 * 
	 * Continuing from the previous example, let's say we add 1 to the count of
	 * character 'b' obtained from getOrDefault('b', 0). Since the count of 'b' was
	 * 0, 0 + 1 equals 1. So, after this operation, the count of character 'b' in
	 * the map becomes 1. So, charCounts.getOrDefault(c, 0) + 1 is a concise way to
	 * increment the count of character c in the map charCounts, ensuring that if c
	 * is not present, its count starts from 1.
	 */	
	
	static String SortingUsingHashMap(String str)
	{
		
		Map<Character, Integer> charCounts= new HashMap<>();
		
		for(char c: str.toCharArray())
		{
			charCounts.put(c, charCounts.getOrDefault(c, 0)+1);
		}
		
		StringBuilder sortedString = new StringBuilder();
		for(char c= 'a';  c<='z'; c++)
		{
			if(charCounts.containsKey(c))
			{
				int count=charCounts.get(c);
				for(int i=0; i< count; i++)
				{
					sortedString.append(c);
				}
				
			}
			
		}
		
		return sortedString.toString();
	}

}
