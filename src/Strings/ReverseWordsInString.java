package Strings;
//Reverse words in a given string
//Last Updated : 13 Sep, 2023
//Given a string, the task is to reverse the order of the words in the given string. 
//
//Examples:
//
//Input: s = “geeks quiz practice code” 
//Output: s = “code practice quiz geeks”
//
//Input: s = “i love programming very much” 
//Output: s = “much very programming love i” 
public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "     geeks quiz practice code" ;
		String str2="i love programming very much";
		ReverseWordsInString(str);
		ReverseWordsInString(str2);
		 
		 
		
	

	}
	static void ReverseWordsInString(String s)
	{
		String[] reverse= s.split("\\s+");
//		for(String i : reverse)
//		{
//			System.err.println("String result:"+ i);
//		}
	StringBuilder builder= new StringBuilder();
		for(int i=reverse.length-1; i>=0; i--)
		{
			builder.append(reverse[i]);
			if(reverse[i]!="")
			//System.err.println( reverse[i]);
			builder.append(" ");
			
			
		}
		
		System.out.println(builder);
		
		
	}
	

}
