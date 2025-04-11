package Stack;

//
//Algorithm for Prefix to Postfix: 
//Read the Prefix expression in reverse order (from right to left)
//If the symbol is an operand, then push it onto the Stack
//If the symbol is an operator, then pop two operands from the Stack 
//Create a string by concatenating the two operands and the operator after them. 
//string = operand1 + operand2 + operator 
//And push the resultant string back to Stack
//Repeat the above steps until end of Prefix expression
//
//Input :  Prefix :  *+AB-CD
//Output : Postfix : AB+CD-*
//
//Input :  Prefix :  *-A/BC-/AKL
//+*A-B/CD+E*FG/H
///Postfix Expression: ABCD/-*EFG*++
//Output : Postfix : ABC/-AK/L-*
public class PrefixToPostfix {

	public static String prefixToPostfix(String prefix) {
		StackUsingArray<String> stack = new StackUsingArray<>(20);
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char current = prefix.charAt(i);
			// System.err.println("Cureent :" + current);
			if (Character.isLetterOrDigit(current)) {
				stack.push(current + "");
			} else {
				String oper1 = stack.pop();
				String oper2 = stack.pop();
				String newoperand = oper1 + oper2 + current;
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
		System.out.println(prefixToPostfix("+*A-B/CD+E*FG/H"));
	}

}
