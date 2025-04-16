package StriverA2ZDSA.KnowBasicMath;
/*Find GCD of two numbers
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
The Greatest Common Divisor of any two integers is the largest number that divides both integers.
Examples
                Example 1:
                Input:N1 = 9, N2 = 12
                
                Output:3
                Explanation:Factors of 9: 1, 3 and 9
                Factors of 12: 1, 2, 3, 4, 6, 12
                Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

                Example 2:
                Input:N1 = 20, N2 = 15
                
                Output: 5
                Explanation:Factors of 20: 1, 2, 4, 5
                Factors of 15: 1, 3, 5
                Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.*/

public class GCDorHCF {

	// bruteforcemethod
	/*
	 * Time Complexity: O(min(N1, N2)) where N1 and N2 is the input number. The
	 * algorithm iterates from 1 to the minimum of N1 and N2 and each iteration
	 * checks whether both the numbers are divisible by the current number (constant
	 * time operations).
	 * 
	 * Space Complexity: O(1)as the space complexity remains constant and
	 * independent of the input size. Only a fixed amount of memory is required to
	 * store the integer variables.
	 */
	static int findGCD(int n1, int n2) {
		int min = n1 < n2 ? n1 : n2;
		int hcf = 0;
		for (int i = 1; i <= min; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
			}

		}
		return hcf;
	}

	/*
	 * We can optimise the time complexity of the previous approach. In the worst
	 * case, the loop iterates from 1 up to the minimum of N1 and N2. This could
	 * potentially result in a large number of iterations, especially when one input
	 * number is significantly larger than the other.
	 * 
	 * If we iterate from the minimum of N1 and N2 down to 1, we reduce the number
	 * of iterations because we start from the potentially largest common factor and
	 * work downwards.
	 * 
	 * The time complexity of this approach remains O(min(N1, N2)) but in practice,
	 * it will execute fewer iterations on average
	 */
	static int findGCDBetterApproach(int n1, int n2) {
		int min = n1 < n2 ? n1 : n2;
		int hcf = 0;
		for (int i = min; i >= 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
				break;
			}

		}
		return hcf;
	}

	/*
	 * // Optimal Approach : The Euclidean Algorithm is a method for finding the
	 * greatest common divisor of two numbers. It operates on the principle that the
	 * GCD of two numbers remains the same even if the smaller number is subtracted
	 * from the larger number.
	 * 
	 * To find the GCD of n1 and n2 where n1 > n2:
	 * 
	 * Repeatedly subtract the smaller number from the larger number until one of
	 * them becomes 0. Once one of them becomes 0, the other number is the GCD of
	 * the original numbers. Eg, n1 = 20, n2 = 15:
	 * 
	 * gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)
	 * 
	 * gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)
	 * 
	 * gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)
	 * 
	 * gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)
	 * 
	 * Hence, return 5 as the gcd.
	 */

	static int findGCDOptimalsApproach(int n1, int n2) {
		while(n1>0 &&  n2>0)
		{
			if(n1>n2)
			{
				n1=n1%n2;
			}
			else
			{
				n2=n2%n1;
			}
			
		}
		return n1==0? n2 : n1;
	}

	public static void main(String[] args) {
		System.out.println(findGCD(9, 12)); // 3
		System.out.println(findGCD(20, 15)); // 5
		System.out.println(findGCD(4, 6)); // 2
		System.out.println(findGCD(9, 8)); // 1

		System.out.println(findGCDBetterApproach(9, 12));
		System.out.println(findGCDBetterApproach(20, 15));
		System.out.println(findGCDBetterApproach(4, 6));
		System.out.println(findGCDBetterApproach(9, 8));
		
		System.out.println(findGCDOptimalsApproach(9, 12));
		System.out.println(findGCDOptimalsApproach(20, 15));
		System.out.println(findGCDOptimalsApproach(4, 6));
		System.out.println(findGCDOptimalsApproach(9, 8));


		// System.out.println(findGCD(9,12));

	}

}
