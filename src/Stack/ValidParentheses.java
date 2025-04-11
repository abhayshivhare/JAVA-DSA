package Stack;

import java.util.Stack;

//

//Valid Parentheses in an Expression
//Last Updated : 13 Jan, 2025
//Given a string s representing an expression containing various types of brackets: 
//{}, (), and [], the task is to determine whether the brackets in the expression are balanced or not.
//A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.
//
//Example: 
//
//Input: s = “[{()}]”
//Output: true
//Explanation:  All the brackets are well-formed.
//
//
//Input: s = “[()()]{}”
//Output: true
//Explanation: All the brackets are well-formed.
//
//
//Input: s = “([]”
//Output: false
//Explanation: The expression is not balanced as there is a missing ‘)’ at the end.
//
//
//Input:  s = “([{]})”
//Output: false
//Explanation: The expression is not balanced because there is a closing ‘]’ before the closing ‘}’.

//[Expected Approach 1] Using Stack – O(n) Time and O(n) Space
//The idea is to put all the opening brackets in the stack. Whenever you hit a closing bracket, 
//search if the top of the stack is the opening bracket of the same nature. 
//If this holds then pop the stack and continue the iteration. In the end if the stack is empty, 
//it means all brackets are balanced or well-formed. Otherwise, they are not balanced.
//
//
//Step-by-step approach:
//
//Declare a character stack (say temp).
//Now traverse the string s. 
//If the current character is an opening bracket ( ‘(‘ or ‘{‘  or ‘[‘ ) then push it to stack.
//If the current character is a closing bracket ( ‘)’ or ‘}’ or ‘]’ ) and the closing bracket matches with 
//the opening bracket at the top of stack, then pop the opening bracket. Else s is not balanced.
//After complete traversal, if some starting brackets are left in the stack then the expression is not balanced, else balanced
public class ValidParentheses {

	// [Expected Approach 1] Using Stack – O(n) Time and O(n) Space
//	The idea is to put all the opening brackets in the stack. 
//	Whenever you hit a closing bracket, search if the top of the stack is the opening bracket of the same nature. 
//	If this holds then pop the stack and continue the iteration. In the end if the stack is empty, 
//	it means all brackets are balanced or well-formed. Otherwise, they are not balanced.
	public static Boolean ValidParentheses(String input) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			// System.out.println(stack.toString());
			char current = input.charAt(i);
			if (current == '(' || current == '{' || current == '[') {
				stack.push(current);

			} else {
				if (!stack.isEmpty() && ((stack.peek() == '(' && current == ')')
						|| (stack.peek() == '{' && current == '}') || (stack.peek() == '[' && current == ']'))) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		System.out.println(ValidParentheses("[{()}]"));
		System.out.println(ValidParentheses("[()()]{}"));
		System.out.println(ValidParentheses("([{]})"));

	}

}
