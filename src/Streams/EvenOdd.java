package Streams;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,45);
		List<Integer> evenNum = list.stream().reduce(new ArrayList<Integer>(),
				(a,b)->
		{
			if(b%2==0)
				a.add(b);
			return a;
			
		},
		(a,b)->
		{
		a.addAll(b);
		return a;

	});
		System.out.println("list of even numbers:" + evenNum);
//		
//		List<Integer> evenlist= list.stream().reduce(new ArrayList<Integer>(),
//				(a,b)->
//		{
//			if(b%2==0)
//				a.add(b);
//			return a;
//			
//		},
//		(a,b)->
//		{a.addAll(b);
//		return a;
//			
//		});

}
}
