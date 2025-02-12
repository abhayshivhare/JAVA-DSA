package Strings;

//Given a string as an input. We need to write a program that will print all non-empty substrings of that given string.
//
//Examples : 
//
//Input :  abcd
//Output :  a 
//          b
//          c
//          d
//          ab
//          bc
//          cd
//          abc
//          bcd
//          abcd
public class PrintAllSubstrings {

	public static void main(String[] args) {
		
		String str1="abcd";
	
		String str2="spacing";
		
		printAllSubstrings(str1);
		//printAllSubstrings(str2);
		
	} 
	
	//using substring function
    static void printAllSubstrings(String str)
    
    {
    	int length= str.length();
    	System.err.println("Length is :"+ length);   
    	
    	for(int i=0; i<length; i++)
    	{
    		for(int j=i+1; j<=length; j++)
    		{
    			System.out.println(str.substring(i,j));
    			
    		}
    		
    	}


    	
    }

}
