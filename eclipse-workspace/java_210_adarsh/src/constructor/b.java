package constructor;

public class b {

	void fun1()
	{
		System.out.println("hello world");
	}
	b(String s)
	{
		System.out.println("hello this is adarsh"+s);
	}
	public static void main(String[] args) {

	//	b obj=new b();		this is an error when the string is mentioned in the constructor
	//	obj.fun1();
		b obj=new b(" hello");
		
		
	}

}
