package AbstractDemo;

public abstract class Person implements DemoStudy {
	
	 //public abstract int study(int time);
	//public abstract int setColor(int color);
	public void study(int time) {
		System.out.println("study method overrided from person");
		 
	}
	
	void study ()
	{
		System.out.println("person is studying");
	}
	
	@Override
	 public void studying(int time) {
		System.out.println("studying default method overrided from person");
	}
	public static void main(String[] args) {
		System.out.println("Hi from person");
		//Person person = new Person();
		//Person.study();
	}

	

}
