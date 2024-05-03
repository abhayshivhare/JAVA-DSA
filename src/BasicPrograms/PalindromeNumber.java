package BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit ");
		int  a = sc.nextInt();
		isPalindrome(a);
		
		sc.close();

	}
	static void isPalindrome(int num)
	{
		int temp=num;
		int rev=0, rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
				
		}
		if(temp==rev)
		{
			System.out.println("is a plaindrome number");
			
		}

		else
		{
			
			System.out.println("not a plaindrome number");
		}
	}
}
