package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main (String[] args)
	{
		
		List<Integer> arrayList = new ArrayList();
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		
		Integer[] array = arrayList.toArray(new Integer[0]);
		for(int i : array)
		{
			
			System.out.println("value of i:"+ i);
			
		}
		System.out.println("element that got replaced is :" + arrayList.set(1, 112));
		
		System.out.println("Array List :"+ arrayList);
		
		
		
		List<Integer> arrayList2= new ArrayList<>(arrayList);
		arrayList2.add(115);
		
		System.out.println("Array List 2 : "+ arrayList2);
		
		
		List<Integer> arrayList3 = new ArrayList();
		arrayList3.add(110);
		arrayList3.add(120);
		arrayList3.add(130);
		arrayList3.addAll(arrayList);
		
		System.out.println("Array List 3 : "+ arrayList3);
		System.out.println("Array List 3 : "+ arrayList3.lastIndexOf(110));
		
		List<Integer> arrayList4 = arrayList2.subList(0, 3);
		System.out.println("Array List 4 with sublist : "+ arrayList4);
		
		// this will modify arraylist4 as well arraylist2 index 1
		arrayList4.set(1,502);
		
		System.out.println("Array List 4 after sublist function : "+ arrayList4);
		
		System.out.println("Array List 2 after sublist function : "+ arrayList2);
		
		
		
		
		
	}

}