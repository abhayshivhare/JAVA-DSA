package ArraysSearching;

public class FixedPoint_ValueEqualToIndex {

	public static void main(String[] args) {
		int arr1[] = { -10, -5, 0, 3, 7 };
		int arr3[] = { 0, 2, 5, 8, 17 };
		int arr2[] = { -10, -5, 3, 4, 7, 9 };
		int fixedPointIndex = fixedPoint(arr2);
		if (fixedPointIndex >=0)
			System.out.println("Fixed Point Is: " + fixedPointIndex);
		else
			System.out.println("No fixed Point Available");
	}

	static int fixedPoint(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			if (arr[i] == i) {
				return i;
			}

		}
		return -1;
	}

}
