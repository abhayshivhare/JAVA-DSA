package BasicPrograms;

import java.util.Scanner;

public class FinbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit till which u want fibonacci Series: ");
		int  a = sc.nextInt();
		fibonacci(a);
		
		sc.close();

	}

	 static void fibonacci(int num)
	{
		 int n1=0;
		 int n2=1;
		 int n3=0;
		 System.out.print(n1 + ",");
		 for(int i=0; i<num;i++)
		 {
			 n3=n1+n2;
			 System.out.print(n3 + ",");
			 n1=n2;
			 n2=n3;		 
			 
		 }
		
	
	}
}
