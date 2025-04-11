//package Stack;
//
//public class InfixToPostFix {
//
//	public int checkPrecedance(char i) {
//		if (i == '^') {
//			return 3;
//		} else if (i == '/' || i == '*') {
//			return 2;
//		} else if (i == '+' || i == '-') {
//			return 1;
//		}
//		return -1;
//	}
//
//	public String infixToPostfix(String infixString)
//	// Input: s = A*(B+C)/D
//	// Output: ABC+*D/
//
//	// postfixString = A
//	{
//		StackUsingArray<Character> stack = new StackUsingArray<>(9);
//		StringBuilder postfixString = new StringBuilder();
//		for (int i = 0; i < infixString.length(); i++) {
//
//			stack.toString();
//			System.out.println("stack.toString(); =" + stack.toString());
//
//			char current = infixString.charAt(i);
//			System.out.println("cureent =" + current);
//			// if (Boolean.TRUE.equals(checkAlphabetNumeric(current)))
//			if (Character.isLetterOrDigit(current)) {
//				postfixString.append(current);
//			}
//
//			else if (current == '(') {
//				// push char to stack
//				stack.push(current);
//			} else if (current == ')') {
//				// pop characters unitl i get a '('
//				while (Boolean.TRUE.equals(!stack.isEmpty()) && stack.peek() != '(') {
//					Character pop = stack.pop();
//					postfixString.append(pop);
//				}
//				if (!stack.isEmpty() && stack.peek() == '(') {
//					stack.pop();
//				}
//
//			} else {
//				Character topCharacter = stack.peek();
//				// this means char is operator so check precedance and push if precedeance is
//				// high else pop
//				while (!stack.isEmpty() && checkPrecedance(topCharacter) >= checkPrecedance(current)) {
//
//					stack.pop();
//					postfixString.append(topCharacter);
//				}
//				stack.push(current);
//			}
//
//		}
//
//		System.out.println("postfixString.toString(); : " + postfixString.toString());
//		// Pop all remaining operators in the stack to the postfix expression
//		while (Boolean.FALSE.equals(stack.isEmpty()))
//
//		{
//			Character pop = stack.pop();
//			postfixString.append(pop);
//		}
//
//		return postfixString.toString();
//
//	}
//
//	public Boolean checkAlphabetNumeric(char c) {
//		return (c >= 'A' && c >= 'Z') || (c >= 'a' && c >= 'z') || (c >= 0 && c >= 9);
//	}
//
//}

package Stack;

public class InfixToPostFix {

    // Function to check precedence of operators
    public int checkPrecedence(char operator) {
        if (operator == '^') {
            return 3; // Highest precedence for exponentiation
        } else if (operator == '*' || operator == '/') {
            return 2; // Higher precedence for multiplication and division
        } else if (operator == '+' || operator == '-') {
            return 1; // Lowest precedence for addition and subtraction
        }
        return -1; // For non-operators
    }

    // Function to convert infix expression to postfix
    public String infixToPostfix(String infixString) {
        // Create a stack to store operators
        StackUsingArray<Character> stack = new StackUsingArray<>(infixString.length());
        StringBuilder postfixString = new StringBuilder();

        // Iterate over the infix string
        for (int i = 0; i < infixString.length(); i++) {

            char current = infixString.charAt(i);

            // If the current character is an operand (alphabet or digit), append to result
            if (Character.isLetterOrDigit(current)) {
                postfixString.append(current);
            }
            // If the current character is '(', push it to the stack
            else if (current == '(') {
                stack.push(current);
            }
            // If the current character is ')', pop from stack until '(' is encountered
            else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixString.append(stack.pop());
                }
                stack.pop(); // Pop '('
            }
            // If the current character is an operator
            else {
                // Check precedence and pop operators from the stack to the postfix expression
                while (!stack.isEmpty() && checkPrecedence(stack.peek()) >= checkPrecedence(current)) {
                    if (current == '^' && stack.peek() == '^') {
                        break; // Handle right-associativity for exponentiation
                    }
                    postfixString.append(stack.pop());
                }
                stack.push(current);
            }
        }

        // Pop all remaining operators from the stack to the postfix expression
        while (!stack.isEmpty()) {
            postfixString.append(stack.pop());
        }

        return postfixString.toString();
    }

    // Method to check if the character is an alphabet or numeric (operand)
    public Boolean checkAlphabetNumeric(char c) {
        return Character.isLetterOrDigit(c);
    }

    
}

