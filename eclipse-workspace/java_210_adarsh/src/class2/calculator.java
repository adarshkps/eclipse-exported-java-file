package class2;

class Cal
{
	int a;
	int b;
	void add(int num1,int num2)
	{
		int num3=num1+num2;
		System.out.println(num3);
	}
	void sub()
	{
		int d=a-b;
		System.out.println(d);
	}
	void multi(int num1, int num2)
	{
		int num3=num1*num2;
		System.out.println(num3);
	}
	int div(int num1, int num2)
	{
		int num3=num1/num2;
		return num3;
	}
	double multithreenumbers(int x, float y, double z)
	{
		double d=x*y*z;
		return d;
	}
}
public class calculator {

	public static void main(String[] args) {
		
		Cal c1 =new Cal();
		c1.add(7,9);
		Cal c2=new Cal();
		c2.sub();
		c1.multi(5,6);
		Cal c3=new Cal();
		int z= c3.div(10, 2);
		System.out.println(z);
		Cal c4=new Cal();
		double d=c4.multithreenumbers(10,23.4f,28.9901);
		System.out.println(d);
		System.out.println(c4.multithreenumbers(10,23.4f,28.9901));
	}

}
