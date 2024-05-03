package BasicPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit ");
		int  a = sc.nextInt();
		FactorialValue(a);
		
		sc.close();

	}
	static void FactorialValue(int num)
	{
		int temp=num;
		int fact=1;
		while(num >0)
		{
			
			fact= num * fact;
			num--;
			
		}
		System.out.println("factorial of " + temp + " is :"+ fact);
	}

}
