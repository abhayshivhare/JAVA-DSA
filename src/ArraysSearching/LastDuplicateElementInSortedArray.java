package ArraysSearching;


/*We have a sorted array with duplicate elements and we have to find the index of 
 last duplicate element and print index of it and also print the duplicate element. 
 If no such element found print a message. 

Examples: 

Input : arr[] = {1, 5, 5, 6, 6, 7}
Output :
Last index: 4
Last duplicate item: 6

Input : arr[] = {1, 2, 3, 4, 5}
Output : No duplicate found*/
public class LastDuplicateElementInSortedArray {
	final int a = 0;
	public static void main(String[] args) 
	
	{
		int arr[] = {41,52,52,53,56,78,78,80,98};
		int  arr4[] = {1, 5, 5, 5,6, 6, 7};
		int arr2[] = {41,52,53,56,78,80,98};
		int arr3[]= {};
		
		//duplicateElement(arr3);
		//getDuplicateUsingBruteForce(arr4);
		String x= "abhayShivhare";
		int lastIndexOf = x.lastIndexOf("h");
		System.out.println("lastIndexOf:"+lastIndexOf);
		//char[] demo = x.toCharArray();
           int a=10;
		
		System.err.println(a);
		
	}
	
	static int getDuplicateUsingBruteForce(int arr[])
	{
		
		for(int i =0; i<arr.length; i++)
		{
			//int lastIndexOf = x.lastIndexOf(i);
		}
		return 1;
		
	}
	
	
	
	
	
	
	static void duplicateElement(int arr[])
	{
		int len= arr.length-1;
		if(arr==null || len ==0)
			return;
		for(int i =len; i>0; i--)
		{
			if (arr[i]== arr[i-1])
			{
				System.out.println("Duplicate element is :" + arr[i] + " its index is "+ i);
				return;
			}
			
		}
		System.out.println("No duplicate element found.");
	
	}

}
