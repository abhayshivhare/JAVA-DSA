package CoreJavaBasics;

public class StaticKeyword {
	 final int x;
	// x=90;
	static
	{
		//System.out.println("Hello from static : " + x );
		//x=90;
	}
	StaticKeyword()
	{
		x=80;
	}

	public static void main (String[] args)
	{
		
		System.out.println("Value of x is : ");
	}
	
//	Corrected Code:
//		There are two ways to fix this depending on whether you want x to be a static or instance variable.
//
//		Case 1: Using a Constructor (for instance variable)
//		java
//		Copy
//		package CoreJavaBasics;
//
//		public class StaticKeyword {
//		    final int x;  // Instance final variable
//		    
//		    // Constructor to assign value to x
//		    public StaticKeyword() {
//		        x = 90;  // Assign value in constructor
//		    }
//
//		    public static void main(String[] args) {
//		        StaticKeyword obj = new StaticKeyword();  // Creating object to call constructor
//		        System.out.println("Value of x is: " + obj.x);  // Accessing instance variable
//		    }
//		}
//		Explanation:
//		x is now initialized in the constructor.
//		In the main method, we create an instance of StaticKeyword to initialize x and access it.
//		The output will be: Value of x is: 90.
//		Case 2: Making x Static (if you want it to be a class variable)
//		If you want x to be a static variable, then you can assign the value inside the static block.
//
//		java
//		Copy
//		package CoreJavaBasics;
//
//		public class StaticKeyword {
//		    static final int x;  // Static final variable
//
//		    // Static initializer block to assign value to static variable
//		    static {
//		        x = 90;  // Assign value to static final variable
//		    }
//
//		    public static void main(String[] args) {
//		        System.out.println("Value of x is: " + x);  // Accessing static variable directly
//		    }
//		}
//		Explanation:
//		x is now declared as a static variable.
//		The value 90 is assigned in the static block.
//		In the main method, we access x directly, as it is now a static variable.
//		The output will be: Value of x is: 90.
//		Key Takeaways:
//		Non-static final variables must be initialized either at the point of declaration, in a constructor, or in an instance initializer block.
//		Static final variables must be initialized in a static context (e.g., a static block or directly at the point of declaration).

}
