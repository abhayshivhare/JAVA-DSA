package JavaCollection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lk1= new LinkedList<>();
		
		lk1.add(4);
		lk1.add(5);
		lk1.add(6);
		
		ListIterator<Integer> iterator = lk1.listIterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.previous());
		System.out.println(iterator.previous());
		System.out.println(iterator.next());
		System.out.println(lk1);
		
		
		
	}

}
