package LearnTheBasic;

import java.util.Scanner;

public class DataType {

	/*
	 * Problem statement Data type refers to the type of value a variable has and
	 * the way the computer interprets it.
	 * 
	 * 
	 * 
	 * Each data type has a different size. You’ve studied 5 different data types
	 * and the sizes of the data types:
	 * 
	 * Integer: 4 bytes Long: 8 bytes Float: 4 bytes Double: 8 bytes Character: 1
	 * byte
	 * 
	 * 
	 * You’re given a data type. Print its size in bytes.
	 * 
	 * 
	 * 
	 * Example : Input: Long
	 * 
	 * Output: 8
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any data type: ");
		String a = sc.nextLine();
		int result= checkdatatype(a);
		System.out.println("size is : "  + result + " Bytes.");
		sc.close();

	}
	
	static int  checkdatatype(String x)
	{
		return switch (x) {
		case "Integer"-> 4;	
		case "Float"->4;
		case "Long"-> 8;
		case "Double"->8;
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " );
    };
	}

	}