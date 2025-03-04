package CoreJavaBasics;

public class DemoInterfaceImplementation implements DemoInterface {

	public static void main(String[] args) {
		DemoInterfaceImplementation dii = new DemoInterfaceImplementation();
		System.out.println(" value of x : " + dii.x);
		System.out.println(" value of y : " + dii.y);
		dii.dance();
		dii.sleep();
		DemoInterface.drink();
		dii.exceptionDemo();
		
		DemoInterface di = new DemoInterfaceImplementation();
		
		

	}
	

	
	public void drink() {
		System.out.println("hello rom static method  overriding in implementation class ");
	};
	
	public void sleep() {
		System.out.println("hello from default method in implementation class");
	}

	@Override
	public void exceptionDemo() throws ArithmeticException {
		int a = 8;
		int xy = 8 / 0;
		System.out.println(" value of xy : " + xy);

	}

	@Override
	public void dance() {

		System.out.println(" Lets dance ");
	}

}
