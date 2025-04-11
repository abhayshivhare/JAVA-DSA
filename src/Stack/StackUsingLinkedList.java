package Stack;

public class StackUsingLinkedList {

	private Node head;

	public StackUsingLinkedList() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;

	}

	public void push(int element) {
		Node newnode = new Node(element);
		newnode.next = head;
		head = newnode;

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
		} else
			System.out.println("stack is underflow");
		 throw new IllegalStateException("Stack is empty");

	}

}
