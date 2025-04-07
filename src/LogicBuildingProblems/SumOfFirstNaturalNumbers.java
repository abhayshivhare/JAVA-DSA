package LogicBuildingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfFirstNaturalNumbers {

	public static void main(String[] args) {

		//System.out.println("Sum is :" + sumOfNaturalNumbers(50));
		sumOfNaturalNumbersUsingStream(5);
	}

	public static int sumOfNaturalNumbers(int n) {
		int sum=0;
		for(int i=0; i <= n ; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	
	
//	public static void sumOfNaturalNumbersUsingStream(int n) {
//	    int sum = Stream.iterate(1, i -> i + 1)
//	                    .limit(n)
//	                    .collect(Collectors.summingInt(Integer::intValue));
//	    System.out.println("Sum: " + sum);
//	}

	
	public static void sumOfNaturalNumbersUsingStream(int n) {
		List<Integer> sum = new ArrayList<>();
		//using reduce
		//System.err.println(IntStream.range(1, n+1).reduce(0, (a,b)-> a+b));	
		
		//using sum
		
		System.err.println(IntStream.range(1, n+1).sum());	
	}
}
