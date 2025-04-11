package Stack;

import java.util.Arrays;

public class StackUsingArray<P> {

//	push
//	lets suppose size of stack is 5 so max elements can insert;
//	every tym we insert element top ++ so at max capcacity condition to check overflow
//	will be top >=capacity-1 that is 4 ,

	// pop
//	when we pop element we decrease top so at full capacity the condition for underflow will be
//	top <=0 then stack is underflow

	int top, capacity;
	P[] array;

	StackUsingArray(int capacity) {
		this.capacity = capacity;
		top = -1;
		//array = new P[capacity];
		  array = (P[]) new Object[capacity]; // Create an array of type P
	}

	public Boolean push(P num) {
		if (top >= capacity - 1) {
			System.out.println("Stack is overflow");
			return null;
		}
		array[++top] = num;
		return true;

	}

	public P pop() {
		if (top < 0) {
			System.out.println("Stack is underflow");
			return null;
		}
		return array[top--];
	}

	public P peek() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return null;
		}
		return array[top];
	}

	public Boolean isEmpty() {
		return top < 0;
	}

	@Override
	public String toString() {
		String str = "Array : " + Arrays.toString(array);
		return str;
	}


   
//    // String representation for debugging purposes
//    @Override
//    public String toString() {
//        return "Stack: " + Arrays.toString(Arrays.copyOfRange(array, 0, top + 1));
//    }
}
