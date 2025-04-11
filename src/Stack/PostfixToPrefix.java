package Stack;

//
//Input :  Postfix : AB+CD-*
//Output : Prefix :  *+AB-CD
//
//Input :  Postfix : ABC/-AK/L-*
//Output : Prefix :  *-A/BC-/AKL
// 
//Algorithm for Postfix to Prefix:
//Read the Postfix expression from left to right
//If the symbol is an operand, then push it onto the Stack
//If the symbol is an operator, then pop two operands from the Stack 
//Create a string by concatenating the two operands and the operator before them. 
//string = operator + operand2 + operand1 
//And push the resultant string back to Stack
//Repeat the above steps until end of Postfix expression.
public class PostfixToPrefix {

	public static String postfixToPrefix(String prefix) {
		StackUsingArray<String> stack = new StackUsingArray<>(20);
		for (int i = 0; i < prefix.length(); i++) {
			char current = prefix.charAt(i);
			System.err.println("Cureent :" + current);
			if (Character.isLetterOrDigit(current)) {
				stack.push(current + "");
			} else {
				String oper1 = stack.pop();
				String oper2 = stack.pop();
				String newoperand = current + oper2 + oper1;
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
		System.out.println(postfixToPrefix("ABC/-AK/L-*"));
	}

}
