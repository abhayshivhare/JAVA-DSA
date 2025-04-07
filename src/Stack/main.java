package Stack;

public class main {

	public static void main(String[] args) {
//		StackUsingArray stack = new StackUsingArray(5);
//		stack.push(10);
//		stack.push(98);
//		stack.push(58);
//		stack.push(67);
//		stack.push(36);
//
//		System.out.println(" Stack values are :" + stack.toString());
//		System.out.println(" Stack top value is :" + stack.peek());
//		System.out.println(" Stack is empty ? " + stack.isEmpty());
//		System.out.println(" Stack before popped values are :" + stack.toString());
//		System.out.println(" Stack pooped value is :" + stack.pop());
//		System.out.println(" Stack pooped value is :" + stack.pop());
//		System.out.println(" Stack after popped values are :" );
//
//		while (!stack.isEmpty()) {
//
//			System.out.println(stack.peek() + " ");
//			stack.pop();
//		}
//
//	}
		 StackUsingLinkedList st = new StackUsingLinkedList();

	        // Push elements onto the stack
	        st.push(11);
	        st.push(22);
	        st.push(33);
	        st.push(44);

	        // Print top element of the stack
	        System.out.println("Top element is " + st.peek());

	        // removing two elemements from the top
	  		System.out.println("Removing two elements...");
	        st.pop();
	        st.pop();

	        // Print top element of the stack
	        System.out.println("Top element is " + st.peek());	
	        
	        st.push(50);
	        
	        System.out.println("Top element is " + st.peek());	
	}

}
