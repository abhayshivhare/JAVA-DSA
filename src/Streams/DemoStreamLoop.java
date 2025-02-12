package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamLoop {
	
	public static void main(String[] args) {
		List<Integer> list = new  ArrayList<>();
		list.add(96);
		list.add(45);
		list.add(75);
		
		list.add(50);
		list.add(25);
		//add 20 only in 75
		List<Integer> add20 = list.stream().map(jay->jay==75 || jay== 66 ? jay+20: jay).collect(Collectors.toList());
		System.err.println("add20 : "+ add20);
		// Remove elements whose sum is 100 using Java Stream API
//        List<Integer> filteredList = list.stream()
//                .map(i-> if(list.remove(100-i)) {
//                	
//                list.remove(i);
//                list.add(100);}
//                );
		
		// Filter elements whose sum is 100 using Java Stream API
        List<Integer> filteredList = list.stream()
                .filter(i -> !list.contains(100 - i)) // Filter out elements whose pair sums up to 100
                .toList(); // Collect remaining elements into a new list

        // Print filtered list
        System.out.println("Filtered list: " + filteredList);
                

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println(" Count is : "+ list.stream().count());
		
		
		List<Integer> collect = list.stream().filter(i -> i%2==0).collect(Collectors.toList());	
		System.out.println(" Even Number List is: "+collect);
		
		//Mapping values
		
		List<Integer> valuesAddition = list.stream().map(i -> i+5).collect(Collectors.toList());

		long count = list.stream().filter(i-> i<50).count();
		System.out.println("count :  "+ count);
		
		boolean anyMatch = list.stream().anyMatch(i-> i==96);
		
		
		System.out.println("anyMatch :  "+ anyMatch);
		
	}

}
