package LogicBuildingProblems;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		swap(8,9);
	}

	public static void swap(int x, int y) {
		System.out.println("Old x and y are :" + x + " ," + y);
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("New x and y are :" + x + " ," + y);
	}

	
}
