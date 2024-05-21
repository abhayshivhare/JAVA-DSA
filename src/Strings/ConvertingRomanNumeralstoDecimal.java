package Strings;

import java.util.HashMap;
import java.util.Map;

//Converting Roman Numerals to Decimal lying between 1 to 3999
//Last Updated : 29 Feb, 2024
//Given a Roman numeral, the task is to find its corresponding decimal value.
//
//Example : 
//
//Input: IX
//Output: 9
//Explanation: IX is a Roman symbol which represents 9
//
//Input: XL
//Output: 40
//Explanation: XL is a Roman symbol which represents 40
//SYMBOL       VALUE
//I            1
//IV           4
//V            5
//IX           9
//X            10
//XL           40
//L            50
//XC           90
//C            100
//CD           400
//D            500
//CM           900 
//M            1000
public class ConvertingRomanNumeralstoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//convertingRomanNumeralstoDecimal("IX");
		convertingRomanNumeralstoDecimal("CM");
		
		

	}
	
	static void  convertingRomanNumeralstoDecimal(String input)
	{
		Map<Character, Integer> hmap= new HashMap<>();
		hmap.put('I', 1);
		hmap.put('V', 5);
		hmap.put('X', 10);
		hmap.put('L', 50);
		hmap.put('C', 100);
		hmap.put('D', 500);
		hmap.put('M', 1000);
		
	int result = 0;
	int prevValue=0;
	for(int i=input.length()-1; i>=0; i--)
	{
		int currentValue= hmap.get(input.charAt(i));

		if(currentValue<prevValue)
		{
			result = result-currentValue;
		}
		else
		{
			result = result + currentValue;
		}
		prevValue= currentValue;
		
	}
	
	System.out.println("Result of Roman Literal:"+result);
	}

}
