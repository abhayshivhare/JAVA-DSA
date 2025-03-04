package CoreJavaBasics;

public interface DemoInterface {

	
	default void sleep() {
		System.out.println("hello foirm default method");
	}
	void exceptionDemo() throws ArithmeticException;
	
	static void drink() {
		System.out.println("hello rom static method");
	};
	
	void dance();
	public static final int x = 80;
	int y=90;
	
}
