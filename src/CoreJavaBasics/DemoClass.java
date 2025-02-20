package CoreJavaBasics;

import java.util.ArrayList;

public class DemoClass {

	void demo() {
		ConstructorDemo cd = new ConstructorDemo();
		System.out.println("cd : "+  cd);
		System.out.println( "cd : "+ cd.getClass());
		System.out.println("Hello abhay");

	}

	public static void main(String[] args) {

		System.out.println("main Method");
		DemoClass d = new DemoClass();
		d.demo();
		
	    var list = new ArrayList<>();
		list.add(5);
		list.add("abhay");
		System.out.println(list);

		var myNum = new Integer(123);

		var myClassObj = new DemoClass();

	}
}
