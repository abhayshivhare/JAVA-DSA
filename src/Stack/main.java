package Stack;

public class main {

	public static void main(String[] args) {
//		StackUsingArray<Character> stack = new StackUsingArray<>(5);
//		stack.push('c');
//		stack.push('a');
//		stack.push('b');
//		stack.push('d');
//		stack.push('p');
//
//		System.out.println(" Stack values are :" + stack.toString());
//		System.out.println(" Stack top value is :" + stack.peek());
//		System.out.println(" Stack is empty ? " + stack.isEmpty());
//		System.out.println(" Stack before popped values are :" + stack.toString());
//		System.out.println(" Stack pooped value is :" + stack.pop());
//		System.out.println(" Stack pooped value is :" + stack.pop());
//		System.out.println(" Stack after popped values are :");
//
//		while (!stack.isEmpty()) {
//
//			System.out.println(stack.peek() + " ");
//			stack.pop();
//		}
        //STACK USING LINKED LISt
//		StackUsingLinkedList st = new StackUsingLinkedList();
//		// Push elements onto the stack
//		st.push(11);
//		st.push(22);
//		st.push(33);
//		st.push(44);
//
//		// Print top element of the stack
//		System.out.println("Top element is " + st.peek());
//
//		// removing two elemements from the top
//		System.out.println("Removing two elements...");
//		st.pop();
//		st.pop();
//
//		// Print top element of the stack
//		System.out.println("Top element is " + st.peek());
//
//		st.push(50);
//
//		System.out.println("Top element is " + st.peek());
//
//		// Push elements onto the stack
//		st.push(11);
//		st.push(22);
//		st.push(33);
//		st.push(44);
//
//		// Print top element of the stack
//		System.out.println("Top element is: " + st.peek());
//
//		System.out.println("Removing two elements...");
//		st.pop();
//		st.pop();
//
//		// Print top element of the stack
//		System.out.println("Top element is " + st.peek());
////	        
//		st.push(50);
////	        
//		System.out.println("Top element is " + st.peek());
//		System.out.println(st.isEmpty());
//
//		System.out.println("Removing two elements...");
//		st.pop();
//		st.pop();
//		st.pop();
//		st.pop();
//		System.out.println("Top element is " + st.peek());
		
		
		InfixToPostFix test = new InfixToPostFix();
		//InfixToPostFixDemo test = new InfixToPostFixDemo();
		//System.out.println(test.infixToPostfix("A*(B+C)/D"));
//		/s = "((A+B)*(C-(D/E^F)*G)-H)*I"
//		/s = "A^(B^C*(D+E)^F)^(G-H)"


		System.out.println(test.infixToPostfix("A^(B^C*(D+E)^F)^(G-H)"));
	}
//	Input: s = “a+b*(c^d-e)^(f+g*h)-i”
//			Output: abcd^e-fgh*+^*+i- 
//			        

}
