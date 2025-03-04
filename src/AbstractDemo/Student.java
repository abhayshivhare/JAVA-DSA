package AbstractDemo;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	@Override
	public void study(int time) {
		 super.study(time);
		System.out.println("Student is studying at  :"+ time  + "am ");
		
	}
	
	public static void main (String[] args)
	{
		Student s1 = new  Student();
		s1.study(10);
		s1.study();
		
		ArrayList<Integer> l2 = new ArrayList<>();
		List<Integer>  l1= new ArrayList<>();
		//Student s2 =new pers
	}
}
