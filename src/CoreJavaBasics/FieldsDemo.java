package CoreJavaBasics;

public class FieldsDemo {
	int a=0;
	FieldsDemo()
	{
		System.out.println(a++);
		System.out.println("2nda " +a);
	}

	static{
		//System.out.println("hi "+Fields.e);

	}
	//Fields fsa = new Fields();
	 static void demo()
	{
		//System.out.println(Fields.e);
	}
	 
	 public static void main(String[] args) {
		//	System.out.println(" HI ");
			//FieldsDemo fsa = new FieldsDemo();
			//demo();
		 
		 int a2 = Fields.a;
		 System.out.println(a2);
//		 FieldsDemo f1= new FieldsDemo();
//		 FieldsDemo f2= new FieldsDemo();
//		 FieldsDemo f3= new FieldsDemo();
//		 FieldsDemo f4= new FieldsDemo();
		}


}
