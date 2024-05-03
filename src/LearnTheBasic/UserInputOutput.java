package LearnTheBasic;


import java.util.Scanner;
public class UserInputOutput {

	/*
	 * Problem statement Write a program that takes a character as input and prints
	 * 1, 0, or -1 according to the following rules.
	 * 
	 * 
	 * 
	 * 1, if the character is an uppercase alphabet (A - Z). 0, if the character is
	 * a lowercase alphabet (a - z). -1, if the character is not an alphabet.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character: ");
		char a = sc.next().charAt(0);
		int result= checkchar(a);
		System.out.println("result is : "  + result);
		sc.close();
	}

	
	static int checkchar(char x)
	{
		if(x >= 'A' && x<= 'Z')
			
		{
			return 1;			
		}
		else if(x<= 'a' && x>='z')
		{
			return 0;
			
		}
		else
		{
			return -1;
			
		}
		
	}

}
