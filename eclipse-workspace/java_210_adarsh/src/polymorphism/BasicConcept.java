package polymorphism;

public class BasicConcept {

	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	void add (float a,float b)
	{
		System.out.println(a+b);
	}
	void add(String a,String b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		BasicConcept obj1=new BasicConcept();
		obj1.add(23, 24);
		obj1.add(23, 25, 43);
		obj1.add(1.4f, 2.5f);
		obj1.add("hello"," world");
		
//		System.out.println("hello world");
//		System.out.println(12);
//		System.out.println('c');
//		System.out.println(true);
		
		
		
	}
}
