package LogicBuildingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationOfNumber {

	public static void main(String[] args) {
//    getMultiplication(9);
		getMultiplicationUsingStream(18);
		
	}
	
	public static void getMultiplication(int n)
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(i*n);
		}
	}
	public static void getMultiplicationUsingStream(int n)
	{
		List<Integer> multiples = new ArrayList<>();
		System.out.println(IntStream.range(1, 11).boxed().map(i-> i*n).collect(Collectors.toList()));
		//multiples.stream().map(n -> n*i).collect(Collectors.toList());
		
		
	}
	
	
	

}
