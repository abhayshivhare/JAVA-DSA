package Strings;
//How to insert characters in a string at a certain position?
//Last Updated : 21 Sep, 2023
//Given a string str and an array of indices chars[] that describes the indices in the original string where the characters will be added. For this post, let the character to be inserted in star (*). Each star should be inserted before the character at the given index. Return the modified string after the stars have been added.
//
//Examples:
//
//Input: str = “geeksforgeeks”, chars = [1, 5, 7, 9]
//Output: g*eeks*fo*rg*eeks
//Explanation: The indices 1, 5, 7, and 9 correspond to the bold characters in “geeksforgeeks”.
//
//Input: str = “spacing”, chars = [0, 1, 2, 3, 4, 5, 6]
//Output: “*s*p*a*c*i*n*g”
public class InsertCharactersInString {

	public static void main(String[] args) {
		String str1="geeksforgeeks";
		char[] charindex = {1, 5, 7, 9};
		String str2="spacing";
		char[] charindex2 = {0, 1, 2, 3, 4, 5, 6};
		System.out.println("Sorted order is :" + InsertStarts(str1, charindex));
		System.out.println("Sorted order is :" + InsertStarts(str2, charindex2));

		

	}
	// Bruteforce way
	static String InsertStarts(String str, char[] charindex)
	{
		String ans="";
		System.err.println("str.length() ="+ str.length());
		int j=0;
		for(int i=0; i< str.length(); i++)
		{
			if(j<charindex.length && i== charindex[j])
			{
				ans += '*';
				j++;
			}
			
			ans+=str.charAt(i);
			System.err.println("ans ="+ ans);
	
		}
		return ans;
		
	}

}
