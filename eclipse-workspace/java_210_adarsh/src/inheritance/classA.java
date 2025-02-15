package inheritance;
class classB
{
	void method1()
	{
		System.out.println("hello method1");
	}
	void method2()
	{
		System.out.println("hello method2");
	}
}

public class classA extends classB
{
	void method3()
	{
		System.out.println("hello method3");
	}
	void method4()
	{
		System.out.println("hello method4");
}
	public static void main(String[] args) {
		
		classA obj1=new classA();
		classB obj2= new classA();
		
		obj1.method3();
	//	obj2.method3();
		obj2.method1();
		obj2.method2();
		obj1.method1();
		obj1.method2();
		obj1.method4();
}

	
}
