package inheritance.AccessSpec1;

public class Cal {
private	 int num1,num2;
public int res;
protected int pro;
int def;
	
	public void div(int a, int b)
	{
		if(b==0)
		{
			System.out.println("division is not possible");
		}
		else
		{
			num1=a;
			num2=b;
		
			System.out.println(num1/num2);
			
		}
	}
	private void prMethod()
	{
		System.out.println("this is private");
	}
	public Cal()
	{
		System.out.println("this is constructor");
	}
	
	public static void main(String[] args) {
		
		Cal c1=new Cal();
		c1.prMethod();
		c1.div(12, 2);
		
		
		
	}

}
