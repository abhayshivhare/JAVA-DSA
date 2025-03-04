package CoreJavaBasics;


/*Abstract Methods
An abstract class can have abstract methods. You declare a method abstract by adding the abstract keyword in front of the method declaration. Here is a Java abstract method example:

public abstract class MyAbstractClass {

    public abstract void abstractMethod();
}
An abstract method has no implementation. It just has a method signature. Just like methods in a Java interface.

If a class has an abstract method, the whole class must be declared abstract. Not all methods in an abstract class have to be abstract methods. An abstract class can have a mixture of abstract and non-abstract methods.

Subclasses of an abstract class must implement (override) all abstract methods of its abstract superclass. The non-abstract methods of the superclass are just inherited as they are. They can also be overridden, if needed.

Here is an example subclass of the abstract class MyAbstractClass:

public class MySubClass extends MyAbstractClass {

    public void abstractMethod() {
        System.out.println("My method implementation");
    }
}
Notice how MySubClass has to implement the abstract method abstractMethod() from its abstract superclass MyAbstractClass.

The only time a subclass of an abstract class is not forced to implement all abstract methods of its superclass, is if the subclass is also an abstract class.
*/public class DemoAbstractImplement extends DemoAbstract {

	
//	DemoAbstractImplement ()
//	{
//		super();
//	}
	public static void main (String[] args) {
		
		DemoAbstractImplement dai = new DemoAbstractImplement();
		dai.eat();
		dai.swim();
		dai.drink();
		dai.dance();
		System.out.println("x =:" + dai.x);
		System.out.println("y =:" + dai.y);
		System.out.println("a =:" + dai.a);
		System.out.println(" hello 1");
		
		
		//System.out.println(" hello ad :" + ad);
//		ad.eat();
//		ad.swim();
        //ad.eat();
		
		
	}

	public void swim() {
		System.out.println("wanna swim?");
	}
	
	public void eat(){
		System.out.println("Hello lets eat from here");
	}
	
	public void dance()
	{
		System.out.println("hello lets dance");
	}
}
