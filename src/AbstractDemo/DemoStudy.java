package AbstractDemo;

public interface DemoStudy {

	default void studying (int time) {
		System.out.println("studying default method");
	}
	void study(int time);
}
