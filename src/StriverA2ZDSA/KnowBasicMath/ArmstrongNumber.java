package StriverA2ZDSA.KnowBasicMath;

//You are given an integer n. You need to check whether it is an armstrong number or not. 
//Return true if it is an armstrong number, otherwise return false.
//An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
//
//Examples:
//Input: n = 153
//
//Output: true
//
//Explanation: Number of digits : 3.
//
//1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27 = 153.
//
//Therefore, it is an Armstrong number.
//
//Input: n = 12
//
//Output: false
//
//Explanation: Number of digits : 2.
//
//1 ^ 2 + 2 ^ 2 = 1 + 4 = 5.
//
//Therefore, it is not an Armstrong number.
public class ArmstrongNumber {
	public static boolean isArmstrong(int n) {

		String num = String.valueOf(n);
		int length = num.length();
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int x = n % 10;
			sum = (int) (sum + Math.pow(x, length));
			n = n / 10;
		}
		return sum == temp;

	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
