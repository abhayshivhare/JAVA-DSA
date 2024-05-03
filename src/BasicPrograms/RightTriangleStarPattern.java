package BasicPrograms;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows ");
		int  a = sc.nextInt();
		starPattern(a);
		
		sc.close();


	}
	static void starPattern(int rows)
	{
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
		
		
	}
}
