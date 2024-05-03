package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main (String[] args)
	{
		//queue follows first in first out
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(23);
		q.add(54);
		//peek give topmost element
		System.out.println(q.peek());
		//poll removes top element
		System.out.println(q.poll());

		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q);
		
	}

}
