package StriverA2ZDSA.KnowBasicMath;

/*You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called it's divisor.
Examples:
Input: n = 6

Output = [1, 2, 3, 6]

Explanation: The divisors of 6 are 1, 2, 3, 6.

Input: n = 8

Output: [1, 2, 4, 8]

Explanation: The divisors of 8 are 1, 2, 4, 8.

Problem Statement: Given an integer N, return all divisors of N.

A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Examples
                Example 1:
                Input:N = 36
               
                Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
                
                Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
                                        
                Example 2:
                Input:N =12                
                
                Output: [1, 2, 3, 4, 6, 12]
                
                Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12. */   
public class PrintAllDivisors {

	static void printAllDivisors(int n)
	{ for(int i =1; i<=n ; i++)
	{
		if(n%i==0)
		{
			System.out.print(i + ",");
		}
	}
		
	}
	
	public static void main(String[] args) {
		printAllDivisors(36);
		// TODO Auto-generated method stub

	}

}
