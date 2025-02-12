package Strings;
//Swap characters in a String

//Last Updated : 26 Oct, 2023
//Given a String S of length N, two integers B and C, the task is to traverse 
//characters starting from the beginning, swapping a character with the character 
//after C places from it, i.e. swap characters at position i and (i + C)%N. 
//Repeat this process B times, advancing one position at a time. 
//Your task is to find the final String after B swaps.
//
//Examples: 
//
//Input : S = "ABCDEFGH", B = 4, C = 3;
//Output:  DEFGBCAH
//Explanation:
//         after 1st swap: DBCAEFGH
//         after 2nd swap: DECABFGH
//         after 3rd swap: DEFABCGH
//         after 4th swap: DEFGBCAH
//Input : S = "ABCDE", B = 10, C = 6;
//Output : ADEBC
//Explanation:
//         after 1st swap: BACDE
//         after 2nd swap: BCADE
//         after 3rd swap: BCDAE
//         after 4th swap: BCDEA
//         after 5th swap: ACDEB
//         after 6th swap: CADEB
//         after 7th swap: CDAEB
//         after 8th swap: CDEAB
//         after 9th swap: CDEBA
//         after 10th swap: ADEBC

public class SwapCharactersInString {

	public static void main(String[] args) {
		String str1 = "ABCDEFGH ";
		int b1 = 4;
		int c1 = 3;
		String str2 = "ABCDE";

		int b2 = 10;
		int c2 = 6;
		// System.out.println("Sorted order is :" + swapChars(str1,b1,c1));
		System.out.println("Sorted order is :" + swapChars(str2, b2, c2));

	}

	static String swapChars(String str, int b, int c) {
		
		int n = str.length();
		 c =c % n;
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < b; i++) {
			char temp = charArray[i%n];

			charArray[i%n] = charArray[(i + c) % n];
			charArray[(i + c) % n] = temp;

		}

		return String.valueOf(charArray);
	}

}
