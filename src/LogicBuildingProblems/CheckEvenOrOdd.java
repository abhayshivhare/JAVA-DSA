package LogicBuildingProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Logic building is about creating clear, step-by-step methods to solve problems using simple rules and principles. It’s the heart of coding, enabling programs to think, reason, and arrive at smart solutions just like we do.
//
//Here are some tips for improving your programming logic:
//
//Understand the problem: Read and understand the problem statement.
//Generate Examples: Create additional input and output cases for each problem.
//Draw observations: Draw observations and patterns based on the examples you created.
//Start with Basic: First, think of the basic way to solve the problem and apply further conditions.
public class CheckEvenOrOdd {

	public static void main(String[] args) {

		int num =89;
		//Boolean even = isEven(num);
		Boolean even = isEvenBO(num);
		
		if(even==true)
		{
			System.out.println(" Num " + num + " is even number." );
		}
		else
		{System.out.println(" Num " + num + " is odd number." ); }
		
		checkOddEvenUsingStream();
	}
	
	//Approach: By Finding the Remainder
	public static Boolean isEven(int num)
	{
		return (num %2 ==0); 
	}
	
//	Approach:Using Bitwise AND Operator
//	The last bit of all odd numbers is always 1, while for even numbers it’s 0. So, 
//	when performing bitwise AND operation with 1, odd numbers give 1, and even numbers give 0.
	public static Boolean isEvenBO(int num) 
	{
		return ((num & 1 )==0); 
	}
	
	public static  void checkOddEvenUsingStream()
	{
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		  List<Integer> odddNumbers = numbers.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		  List<Integer> evenNumbers = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
		  System.out.println("Even Number  :"+ evenNumbers);
		  System.out.println("odddNumbers  :"+ odddNumbers);
	}
	


}
