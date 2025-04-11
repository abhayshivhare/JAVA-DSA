package StriverA2ZDSA.KnowBasicMath;
//Palindrome Number

//Given an integer x, return true if x is a palindrome, and false otherwise.
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int rev = 0;
		int temp=x;
		while (x != 0) {
			int rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;

		}
		
		if (rev == temp) {
			return true;
		} else {
			return false;
		}
		
		
		  // If the number is negative or ends with 0 but isn't 0, it can't be a palindrome
//        if (x < 0 || (x % 10 == 0 && x != 0)) {
//            return false;
//        }
//        
//        int reversedHalf = 0;
//        while (x > reversedHalf) {
//            reversedHalf = reversedHalf * 10 + x % 10; // Build the reversed half
//            x /= 10; // Reduce the number by removing the last digit
//        }
//        
//        // If the number is even-length or odd-length, we can check if the two halves are equal
//        return x == reversedHalf || x == reversedHalf / 10;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}

}
