package Strings;
//Write a method to replace all the spaces in a string with ‘%20’. 

//You may assume that the string has sufficient space at the end to hold the additional characters 
//and that you are given the “true” length of the string.
//Examples: 
//
//Input: "Mr John Smith", 13
//Output: Mr%20John%20Smith
//
//Input: "Mr John Smith   ", 13
//Output: Mr%20John%20Smith
         

public class UrlifyAGivenString {

	public static void main(String[] args) {
		String input = "Mr John Smith";
		String input2 = "Mr John Smith   ";
		
		//System.err.println(urlifyAGivenString(input));
		System.err.println(urlifyAGivenString(input2, 13));

	}

	public static String urlifyAGivenString(String input, int size) {
		StringBuilder sb = new StringBuilder();
		//int size = input.length();
		for (int i = 0; i < size; i++) {
			char c = input.charAt(i);
			if (c == ' ') {
				sb.append("%20");

			} else {
				sb.append(c);
			}

		}
		return sb.toString();
	}

}
