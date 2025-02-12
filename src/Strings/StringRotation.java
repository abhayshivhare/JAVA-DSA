package Strings;

//Left Rotation and Right Rotation of a String
//Last Updated : 03 May, 2024
//Given a string of size n, write functions to perform the following operations on a string-
//
//Left (Or anticlockwise) rotate the given string by d elements (where d <= n)
//
//Right (Or clockwise) rotate the given string by d elements (where d <= n).
//Examples: 
//
//Input : s = "GeeksforGeeks"
//        d = 2
//Output : Left Rotation  : "eksforGeeksGe" 
//         Right Rotation : "ksGeeksforGee"  
//Input : s = "qwertyu" 
//        d = 2
//Output : Left rotation : "ertyuqw"
//         Right rotation : "yuqwert"
public class StringRotation {

	public static void main(String[] args) {

		String str = "GeeksforGeeks";
		String str2 = "qwertyu";
		System.out.println("Left rotated string is: " + stringRotationLeft(str, 2));
		System.out.println("Left rotated string is: " + stringRotationLeft(str2, 4));
		
		System.out.println("Right rotated string is: " + stringRotationRight(str, 2));
		System.out.println("Right rotated string is: " + stringRotationRight(str2, 2));

	}

	static String stringRotationLeft(String str, int pos) {

		str = str.substring(pos) + str.substring(0, pos);
		return str;

	}

static String stringRotationRight(String str, int pos	) {
		int n= str.length();
	return str.substring(n-pos)+str.substring(0,n-pos);
		
	}

}
