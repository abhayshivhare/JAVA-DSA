package Strings;

import java.util.HashMap;
import java.util.Map;

//Given a string str, the task is to print the frequency of 
//each of the characters of str in alphabetical order.
//Example: 
//
//Input: str = “aabccccddd” 
//Output: a2b1c4d3 
//Since it is already in alphabetical order, the frequency 
//of the characters is returned for each character. 
//Input: str = “geeksforgeeks” ” 
//Output: e4f1g2k2o1r1s2 
public class PrintFrequencyOfChar {

	public static void main(String[] args) {
		String str1="aabccccddd ";
		String str2="geeksforgeeks";
		System.out.println(" the frequency of each of the characters is :" + PrintFrequencyOfChar(str1));
		System.out.println(" the frequency of each of the characters is :" + PrintFrequencyOfChar(str2));

	}
	
	static  String PrintFrequencyOfChar(String str)
	{
		
		Map<Character, Integer> countChar= new HashMap<>();
		for(char c: str.toCharArray())
		{
			countChar.put(c, countChar.getOrDefault(c, 0)+1);
			
		}
		StringBuilder outputString = new StringBuilder();
		for(char c='a'; c<='z'; c++)
		{
			if(countChar.containsKey(c))
			{
				int count= countChar.get(c);
				
				outputString.append(c);
				outputString.append(count);	
			}
		}
		
		//using TreeSet: The output of the given code will be the characters of the string along with their frequencies, 
		//sorted in ascending order of characters due to the use of TreeMap. Here's the expected output for the given code:
//		// given string
//        String s = "geeksforgeeks";
//        // map char-int pair
//        Map<Character, Integer> mp = new TreeMap<Character, Integer>();
//        // map over string
//        for (char c : s.toCharArray()) {
//            if (mp.containsKey(c)) {
//                mp.put(c, mp.get(c) + 1);
//            } else {
//                mp.put(c, 1);
//            }
//        }
//        // printing the char with their frequency
//        System.out.println("All character in string with their frequency :");
//        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
//            System.out.print(entry.getKey() + "" + entry.getValue());
//        }
		
		return outputString.toString();
	}
	

		

}
