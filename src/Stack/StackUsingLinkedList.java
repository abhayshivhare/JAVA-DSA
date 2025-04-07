package Stack;

public class StackUsingLinkedList {

	Node head;

	StackUsingLinkedList() {
		this.head = null;
	}

	boolean isEmpty() {
		return head == null;

	}

	void push(int element) {
		Node new_node = new Node(element);
		new_node.next = head;
		head = new_node;

	}

	void pop() {
		if (isEmpty()) {
			System.out.println("stack is underflow");
		} else {
			Node tempNode = head;
			head = head.next;
			tempNode = null;

		}
	}

	int peek() {
		if (!isEmpty()) {
			return head.data;
		}
		else
			System.out.println("stack is underflow");
			return 0;

	}

}
