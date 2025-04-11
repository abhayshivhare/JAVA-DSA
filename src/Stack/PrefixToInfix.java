package Stack;

import java.util.Stack;

//Algorithm for Prefix to Infix: 
//
//Read the Prefix expression in reverse order (from right to left)
//If the symbol is an operand, then push it onto the Stack
//If the symbol is an operator, then pop two operands from the Stack 
//Create a string by concatenating the two operands and the operator between them. 
//string = (operand1 + operator + operand2) 
//And push the resultant string back to Stack
//Repeat the above steps until the end of Prefix expression.
//At the end stack will have only 1 string i.e resultant string
public class PrefixToInfix {

//	
//	Examples: 
//
//
//		Input :  Prefix :  *+AB-CD
//		Output : Infix : ((A+B)*(C-D))
//
//		Input :  Prefix :  *-A/BC-/AKL
//		Output : Infix : ((A-(B/C))*((A/K)-L))
///*+A-B/C-D*E/F
	public static String prefixToInfix(String prefix) {
		StackUsingArray<String> stack = new StackUsingArray<>(20);
		for (int i = prefix.length() - 1; i >= 0; i--) {
			//System.out.println("i value:"+i);
			char current = prefix.charAt(i);
			//System.out.println("current value:"+ current);
			//System.out.println("stack value"+ stack.toString());
			if (Character.isLetterOrDigit(current)) {
				//System.out.println("1");
				stack.push(current+ "");
			} else if (Boolean.TRUE.equals(isOperator(current))) {
				//System.out.println("");
				//System.out.println("stack.pop():"+stack.pop());
					String op1 =  stack.pop();
					String op2 = stack.pop() ;
					String newoperand = "(" + op1 + current + op2 + ")";
					//System.out.println("newoperand" + newoperand);
					stack.push(newoperand);
			}

		}
		return stack.pop();
	}

	public static Boolean isOperator(char operator) {
		switch (operator) {
		case '^':
		case '/':
		case '*':
		case '+':
		case '-':
		//case '%':
			return true;
		}
		return false;
	}

	


	    
	   
	
	public static void main(String[] args) {
		//System.out.println(prefixToInfix("*+AB-CD"));
		//System.out.println(prefixToInfix("*-A/BC-/AKL"));
		//System.out.println("*-A/BC/D+EF");
		//System.out.println(prefixToInfix("*-+/ABCDE"));
		
		System.out.println(prefixToInfix("*+A-B/C-D*E/F"));
		//"*+A-B/C-D*E/F";
		//Infix: ((A+(B-(C/D)))*(E/F))
		
		//Prefix: *+A-B/C-D*E/F => Infix: ((A+((B/C)-D))*((E/F)))

		
	}



}
