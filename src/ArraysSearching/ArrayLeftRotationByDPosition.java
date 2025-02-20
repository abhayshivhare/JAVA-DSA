package ArraysSearching;



//git status
//git add .
//git commit -m "Your commit message"
//git push origin main  # Optional if pushing to a remote repository

//Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
//Examples:  
//
//Input: 
//N = 5, d = 2 ,arr[] = {1, 2, 3, 4, 5, 6, 7}
//Output: 3 4 5 6 7 1 2
//
//Input: N = 7, d=2 , arr[] = {3, 4, 5, 6, 7, 1, 2},
//Output: 5 6 7 1 2 3 4
public class ArrayLeftRotationByDPosition {
	public static void main(String[] args) {
	
	int arr[] = {1, 2, 3, 4, 5, 6, 7};
	int d=2;
	rotate(arr,d);
	
	}
	static void rotate(int arr[], int d)
	{
		
		int newArray[] =  new int[arr.length];
		int k=0;
		
		//adding elements after d position
		for(int i=d;i<arr.length;i++)
		{
			newArray[k]= arr[i];
			k++;
			
		}
		
	
		
		//adding d elements
		for(int i=0; i<d; i++)
		{
			newArray[k]=arr[i];
			k++;
			
		}
		
		//new array
		for(int i: newArray)
		System.out.println(i);
		
	
	}
	
	
	

}
