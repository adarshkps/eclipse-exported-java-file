package polymorphism;

public class methodOverloading {

	int num1;
	int num2;
	int num3;
	public void add(int a, int b)
	{
		num1=a;
		num2=b;
		System.out.println(a+b);
	}
	public void add(float a, float b)
	{
		System.out.println(a+b);
	}
	public int add(String a,String b)
	{
		System.out.println(a+b);
		return 4;
	}
	
	public static void main(String[] args) {
		methodOverloading obj1=new methodOverloading();
		obj1.add(20, 30);
		obj1.add(2.5f, 3.6f);
		obj1.add("my name ","is adarsh");
		System.out.println(obj1.add("12","10"));
				
	}
}
