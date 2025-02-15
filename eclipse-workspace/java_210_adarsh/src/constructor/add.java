package constructor;

public class add {
	
	int a;
	int b;
	
	void getdata(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
	void add()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		add obj1= new add();
		obj1.getdata(12, 21);
		obj1.add();
		
	}

}
