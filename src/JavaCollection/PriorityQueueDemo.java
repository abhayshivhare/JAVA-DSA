package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.offer(12);
		pq.offer(25);
		pq.offer(69);
		
		List<Integer> top2 = new ArrayList<>();
		int index=0;
		while(!pq.isEmpty())
		{
			if(index==2)
				break;
			top2.add(pq.poll());
			index ++;
			
			
		}
		System.out.println("PQ :"+ pq);
		System.out.println("top2 : "+ top2);
	}

}
