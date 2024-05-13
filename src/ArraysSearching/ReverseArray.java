package ArraysSearching;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr1[]= {4, 5, 1, 2};
		//reversedArrayUsingArray(arr1);
		reversedArrayBruteForce(arr1);
	
	}
	//using array
	static void reversedArrayUsingArray(int arr[])
	{
		
		for(int i: arr)
		{
			System.out.println("Old Array Elements"+ i);
		}
		int newArray[] =  new int[arr.length];
		
		for(int i=0; i<newArray.length; i++)
		{
			newArray[i]= arr[arr.length-1-i];
		}
		
		for(int i: newArray)
		{
		System.out.println("Reversed Array Elements"+ i);
		}
		
		
	}
	//using Bruteforce method
	static void reversedArrayBruteForce(int arr[])
	{
		
		for(int i: arr)
		{
			System.out.println("Old Array Elements"+ i);
		}
		int start=0; 
		int end= arr.length-1;
		System.out.println(end);
		while (start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			start++;
			end--;
			
			
		}
		
		for(int i: arr)
		{
		System.out.println("Reversed Array Elements"+ i);
		}
		
		
	}


}
