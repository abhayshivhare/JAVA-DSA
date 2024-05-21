package Strings;

public class DemoSpring {

	public static void main(String[] args) {
		String s= "abhay";
		//s= s+ "fgshsh";
		String concat2 = s.concat("dfff");
		System.out.println(concat2);
		
		String demoString = new String("GeeksforGeeks");
		demoString.concat("gho");
		System.out.println(demoString);

		String concat = demoString.concat("hello");
		System.out.println(concat);

	}

}
