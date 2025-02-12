package SearchingAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {41,25,63,85,96,74,64,28};
		int len= arr.length;
		int x = 85;
		
		System.out.println("Index of searched number is "  + binarySearch(arr, len, x) );

	}

	public static int binarySearch( int arr[], int len, int num)
	{
		int low=0;
		int high=len;
		
		while(low<=high)
		{
			int mid = low+ (high-low)/2;
			
			if(arr[mid]==num)
			{
				return mid;
			}
			if(arr[mid]> num)
			{
				high= mid-1;
				
			}
			else
			{
				low= mid +1;
			}
			
			
		}
		
		
		return -1;
	}
}
