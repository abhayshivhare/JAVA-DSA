package Strings;

import java.util.Stack;
//Given a string, reverse it using stack. 
//
//Example:
//
//Input: str = “GeeksQuiz”
//Output: ziuQskeeG

//
//Input: str = “abc”
//Output: cba
public class ReverseStringUsingStack {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("GeeksQuiz");
		StringBuffer s2 = new StringBuffer("abc");
		//reverseStringUsingStack(s);
		reverseStringUsingStack(s2);

	}
	
	static void reverseStringUsingStack(StringBuffer s)
	{
		StringBuffer revstr= new StringBuffer("");
		Stack<Character> stck = new Stack<>();
		for(int i=0; i<s.length(); i++ )
		{
			stck.push(s.charAt(i));
			
			
		}
		
		
		while(!stck.isEmpty())
		{
			Character pop = stck.pop();
			revstr=revstr.append(pop);
		
		}
		System.out.println("Stack values:"+ revstr);
	}

}
