package CoreJavaBasics;

public class ConstructorDemo {

	public static void main(String[] args) {

		System.out.println("main Method");
		ConstructorDemo cd = new ConstructorDemo(65);

	}

	ConstructorDemo() {

		System.out.println("Hello from constructor1");
	}

	public ConstructorDemo(int a) {

		System.out.println("Hello from constructor2 :" + a);
	}

	public ConstructorDemo(int a, String s) {
		System.out.println("Hello from constructor3" + a + s);
	}
}
