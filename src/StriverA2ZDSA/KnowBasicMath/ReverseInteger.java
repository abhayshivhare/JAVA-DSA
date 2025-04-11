package StriverA2ZDSA.KnowBasicMath;

//7. Reverse Integer
//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
// 
//
//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21
public class ReverseInteger {

	public static int reverse(int x) {

		int rev = 0;
		while (x != 0) {

			if (x < Integer.MIN_VALUE / 10 || x > Integer.MAX_VALUE / 10) {
				return 0;
			}

			int num = x;
			num = num % 10;
			rev = rev * 10 + num;
			x = x / 10;

		}

//		 int rev = 0;
//
//	        // Loop until the original number becomes zero
//	        while (x != 0) {
//	            // Extract the last digit of the number
//	            int rem = x % 10;
//
//	            // Check for potential overflow before multiplying
////	            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
////	                return 0; // Return 0 if overflow would occur
////	            }
//
//	            // Multiply the current reversed number by 10 and add the remainder
//	            rev = rev * 10 + rem;
//
//	            // Remove the last digit from the original number
//	            x /= 10;
//	        }

		return rev;

	}

	public static void main(String[] args) {
		System.out.println(reverse(-2147483412));
	}

}
