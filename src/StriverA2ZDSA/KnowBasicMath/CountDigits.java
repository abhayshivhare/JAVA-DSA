package StriverA2ZDSA.KnowBasicMath;

public class CountDigits {
//	Count all digits of a number
//	100
//	Easy
//	Hint
//	You are given an integer n. You need to return the number of digits in the number.
//
//
//
//	The number will have no leading zeroes, except when the number is 0 itself.
//
//
//	Examples:
//	Input: n = 4
//
//	Output: 1
//
//	Explanation: There is only 1 digit in 4.
//
//	Input: n = 14
//
//	Output: 2
//
//	Explanation: There are 2 digits in 14.	

	public static int countDigits(int n) {
		// return (int) (Math.log(n)+1);
		int count = 0;
		if (n == 0)
			return 1;
		if (n < 0)
			n = -n;

		while (n > 0) {
			count++;
			n = n / 10;

		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigits(1000000000));
	}

}
