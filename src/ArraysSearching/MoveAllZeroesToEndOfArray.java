package ArraysSearching;
//Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
//
//Example: 
//
//Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
//
//Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
//Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
public class MoveAllZeroesToEndOfArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
	    int 	arr2[]  = {1, 2, 0, 0, 0, 3, 6};
		//moveAllZeroesToEndOfArray(arr);
		//moveAllZeroesToEndOfArray(arr2);
		moveAllZeroesToEndOfArrayUsingSingleLoop(arr);
		//moveAllZeroesToEndOfArrayUsingSingleLoop(arr2);
		
		

	}
	//using two loop
	static void moveAllZeroesToEndOfArray(int arr[])
	{
		
	
		int temp[]= new int[arr.length];
		int count=0;
		int k=0;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				temp[k]=arr[i];
				k++;
				count++;
			}
			
		}
		
		System.out.println("temp array elements");
		for(int i:temp)
		{
			
			System.out.println(i);
		}
		System.out.println("Count :"+count);
		System.out.println("K  :"+k);
		for(int i =count; i<temp.length; i++ )
		{
			temp[k]=0;
			k++;
		}
		System.out.println("After copying zero to new temp array");
		System.out.println("temp array elements");
		for(int i:temp)
		{
			
			System.out.println(i);
		}
		System.out.println("Count :"+count);
		System.out.println("K  :"+k);
		
		
		
	}
	
	
	//Using single loop
	static void moveAllZeroesToEndOfArrayUsingSingleLoop(int arr[])
	{
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]= arr[i];
				count++;
			}
			
		}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		
		for(int i: arr)
		System.out.println("array elements" + i);
		
	}
	

}
