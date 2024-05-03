package BasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit ");
		int  a = sc.nextInt();
		isArmstrong(a);
		
		sc.close();


	}	
	static void isArmstrong(int num)
	{
		int temp=num;
		int sum=0;
		int rem;
		
		int digits=0;
		
		while(temp>0)
		{
			temp=temp/10;
			digits++;
			
		}
		temp=num;
		while(num >0)
		{
			rem= num%10;
			sum= (int) (sum+ Math.pow(rem, digits));
			num=num/10;
		}
		System.out.println("temp vaalue : "+ temp);
		System.out.println("sum value : "+ sum);
		if(temp==sum)
		{
			System.out.println("this is a armstrong number");
		}
		else
		{
			System.out.println("this is Not a armstrong number");
		}
		
		
	}

}
