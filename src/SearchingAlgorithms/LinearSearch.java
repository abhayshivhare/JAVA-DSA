package SearchingAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[]= {41,25,63,85,96,74,64,28};
		int len= arr.length;
		int x = 85;
		
		System.out.println("Index of searched number is "  + linearSearch(arr, len, x) );

	}
	
	public static int linearSearch(int arr[], int len, int num)
	{
		for(int i=0; i<len; i++)
		{
			if(arr[i]==num)
			{
			return i;
			}
			
		}
		return -1 ;
	}

}
