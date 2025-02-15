package inheritance;
class A 
{
	void fun1()
	{
		System.out.println("i am class A fun1");
	}
}
	
class B extends A
{
	void fun2()
	{
		System.out.println("i am class B fun2");
	}
}
class C extends B
{
	void fun3()
	{
		System.out.println("i am class C fun3");
	}
}

public class D extends C
{
	void fun4()
	{
		System.out.println("fun4 is in D");
	}

	public static void main(String[] args) {
		D obj1=new D();
	//	obj1.fun1();		// this is not possible to call the fun1 because we are calling the fun1 that is in the Class A.
								// that is not in the D class and in the extended class C also so it will throw error.
		obj1.fun3(); // it will be executed because the object is created to the class D but there is an extend for the class to class C.
		
		obj1.fun2();  // it will be executed because the D class extended to the class C and class c extended to the class B.
		
		obj1.fun1(); // it will be executed when the class extended to class D accordingly
		obj1.fun4();
		
		B obj2=new B();
		obj2.fun1();
		obj2.fun2();
		
		C obj3= new C();
		obj3.fun3();
		obj3.fun2();
		obj3.fun1();
		
		A obj4= new A();
		obj4.fun1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
