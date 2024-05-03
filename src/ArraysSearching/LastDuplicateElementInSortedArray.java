package ArraysSearching;

public class LastDuplicateElementInSortedArray {

	public static void main(String[] args) 
	
	{
		int arr[] = {41,52,52,53,56,78,78,80,98};
		int arr2[] = {41,52,53,56,78,80,98};
		int arr3[]= {};
		duplicateElement(arr3);

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
