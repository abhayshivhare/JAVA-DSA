package Stack;

import java.util.Arrays;

public class StackUsingArray {

//	push
//	lets suppose size of stack is 5 so max elements can insert;
//	every tym we insert element top ++ so at max capcacity condition to check overflow
//	will be top >=capacity-1 that is 4 ,

	// pop
//	when we pop element we decrease top so at full capacity the condition for underflow will be
//	top <=0 then stack is underflow

	int top, capacity;
	int[] array;

	StackUsingArray(int capacity) {
		this.capacity = capacity;
		top = -1;
		array = new int[capacity];
	}

	public Boolean push(int num) {
		if (top >= capacity - 1) {
			System.out.println("Stack is overflow");
			return false;
		}
		array[++top] = num;
		return true;

	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack is underflow");
			return 0;
		}
		return array[top--];
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return 0;
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
}
