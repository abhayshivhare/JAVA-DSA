package Streams;

import java.util.ArrayList;
import java.util.List;

public class DemoStreamLoop {
	
	public static void main(String[] args) {
		List<Integer> list = new  ArrayList<>();
		list.add(96);
		list.add(45);
		list.add(75);
		
		list.add(66);
		list.add(78);
		
		list.stream().sorted().forEach(System.out::println);
		
	
	}

}
