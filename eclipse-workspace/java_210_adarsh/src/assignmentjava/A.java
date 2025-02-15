package assignmentjava;

public class A {
	
	A()
	{
		System.out.println("hello world this is adarsh");
	}
	A(String s)
	{
		System.out.println("im leaning java"+s);
	}
	A(int a, int b)
	{
		System.out.println("im leaning selenium"+(a+b));	// the concatination will done only when the
		   //braces are not placed and if we place the braces and inserting the values it will be addition
		}
	A(char ch)
	{
		System.out.println("testing engineer");
	}
	public static void main(String[] args) {
		

		A obj1=new A();
		A obj2=new A(" and SQL");
		A obj3=new A(12,12); 
		A obj4 = new A("a");
		
	}

}
