package com.java.finalkeywords;
final class Cal
{
	int a,b,c;				// if we are using final key word we can't able to inherited to another class.
	public void method1()	// if we try to do inherit it will throw error
	{
		System.out.println("this is the code of cal");
		
	}
}
public class SC  {		// we can not extend the class while using the final keyword

	public static void main(String[] args) {
		Cal c1=new Cal();			// but we can access it by creating the object .
		
		
		
	}

}
