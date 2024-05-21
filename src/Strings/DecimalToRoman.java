package Strings;
import java.util.*;

public class DecimalToRoman {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
    //using recursive call
    public static String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }
    //using Loop call
    static String toRomanValue(int number)
    {
    	StringBuilder romanNumBuilder= new StringBuilder();
    	while (number>0)
    	{
    		int  l= map.floorKey(number);
    		romanNumBuilder.append(map.get(l));
    		number= number-l;
    	}
    	return romanNumBuilder.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {9, 40, 1904};
//        for (int number : numbers) {
//            System.out.println("Decimal " + number + " = Roman " + toRoman(number));
//        }
        for (int number : numbers) {
            System.out.println("Decimal " + number + " = Roman " + toRomanValue(number));
        }
        
    }
}
