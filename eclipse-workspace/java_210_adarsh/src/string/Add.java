package string;

public class Add {
	
	int a;
	int b;
	void myvalues(int num1, int num2)
	{
		a=num1;
		b=num2;
	}
	void addition()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		Add obj=new Add();
		obj.myvalues(12,23);
		obj.addition();
	}

}
