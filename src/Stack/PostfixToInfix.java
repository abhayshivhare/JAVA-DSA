package Stack;


//Input: abc++
//Output: (a + (b + c))
//Explanation: Infix expression is  (a + (b + c)) for expression abc++
//
//Input: ab*c+
//Output: ((a*b)+c)
//Explanation: Infix expression is  ((a*b)+c) for expression ab*c+
//
//Input: abc+*d/
//Output: (((a * (b + c))) / d)
//Explanation: Infix expression is (((a * (b + c)))/d) for expression abc+*d/
//
//Initialize Stack – Create an empty stack.
//Process Input Symbols – Read symbols one by one from the input
//Handle Operands – Push operands onto the stack.
//Handle Operators – Pop the top two values, form an infix expression, and push it back.
//Retrieve Final Expression – The remaining value in the stack is the desired infix expression.
/*
s.push("(" + op2 + exp.charAt(i) +
        op1 + ")");*/
public class PostfixToInfix {
	
	public static String postfixToInfix(String prefix) {
		StackUsingArray<String> stack = new StackUsingArray<>(20);
		for (int i = 0; i < prefix.length(); i++) {
			char current = prefix.charAt(i);
			//System.err.println("Cureent :" + current);
			if (Character.isLetterOrDigit(current)) {
				stack.push(current + "");
			} else {
				String oper1 = stack.pop();
				String oper2 = stack.pop();
				String newoperand = "(" + oper2 + current +
						oper1 + ")";
				// System.out.println("New operand=" + newoperand);
				stack.push(newoperand);
			}

		}
//		/System.out.println("Postfix :"+ stack.pop());
		return stack.pop();
	}

	public static Boolean isOperator(char c) {
		switch (c) {
		case '^':
		case '/':
		case '*':
		case '+':
		case '-':
			// case '%':
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(postfixToInfix("abc+*d/"));
	}



}
