package Strings;

import java.util.Arrays;

//Longest Common Prefix using Sorting
//Last Updated : 13 Apr, 2024
//Problem Statement: Given a set of strings, find the longest common prefix.
//Examples:
//
//Input: {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
//Output: “gee”
//
//Input: {“apple”, “ape”, “april”}
//Output: “ap”
public class LongestCommonPrefixUsingSorting {

	public static void main(String[] args) {
		String [] list = {"geeksforgeeks", "geeks", "geek", "geezer"};
		
		Arrays.sort(list);
		
		for(String i : list)
		System.out.println(i);
		
		String first=list[0] ;
		String last=list[list.length-1] ;
		int k=0;
		while( k <first.length() && k< last.length() && first.charAt(k)== last.charAt(k)) 
		{
			k++;
		}
		
		System.out.println("Longest common prefix is :"+ first.substring(0, k));


	}

}
