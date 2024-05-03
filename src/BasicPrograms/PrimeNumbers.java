package BasicPrograms;



import java.util.Scanner;

public class PrimeNumbers {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit ");
		int  a = sc.nextInt();
		isPrime(a);
		
		sc.close();

	}
	static void isPrime(int a)
	{
		int flag=0;
		for (int i=2; i<a/2; i++)
		{
			if (a%i ==0)
			{
				System.out.println("Not a prime number");
				flag=1;
				break;
			}
			
		}
		if (flag==0)
			System.out.println("Is a prime number");

	}

}

