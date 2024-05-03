package JavaCollection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STACK follow LIFO
		Stack<Integer> stck = new Stack<>();
		stck.push(1); //push to insert elemnt
		stck.push(24);
		stck.push(44);
		//stck.pop();
		
		System.out.println(stck);
		while(!stck.isEmpty())
		{
			System.out.println(stck.peek()); // peek return top element
			stck.pop();// pop to remove element
			
		}

	}

}
