package JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
	
		Set<Integer> st1 = new HashSet<>();
		st1.add(45);
		st1.add(65);
		st1.add(456);
		
		Set<Integer> st2= new HashSet<>();
		st2.add(36);
		st2.add(32);
		st2.add(65);
		
		
		// it maintains insertion order
		Set<Integer> st3= new LinkedHashSet<>();
		st3.add(36);
		st3.add(32);
		st3.add(65);
		
		//gives intersection output
		st1.retainAll(st2);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
//		st1.removeAll(st2);
//		System.out.println(st1);
//		System.out.println(st2);
//		st1.addAll(st2);
//		System.out.println(st1);
//		System.out.println(st2);
		
		
		
	}

}
