package inheritance;

public class calculator {

	int a;
	int b;
	int res;
	
	void add(int num1, int num2)
	{
		a=num1;
		b=num2;
		res=num1+num2;
		System.out.println("addition of numbers "+res);
	}
	void sub(int num1, int num2)
	{
		a=num1;
		b=num2;
		res=num1-num2;
		System.out.println("substraction of numbers "+res);
	}
	void multi(int num1, int num2)
	{
		a=num1;
		b=num2;
		res=num1*num2;
		System.out.println("multiplication of numbers "+res);
	}
	void div(int num1, int num2)
	{
		a=num1;
		b=num2;
		res=num1/num2;
		System.out.println("division of numbers "+res);
	}
	
		public static void main(String[] args) {
			
			calculator obj=new calculator();
			obj.add(10,12);
			obj.sub(20,15);
			obj.multi(10, 12);
			obj.div(10,5);
		}
		 
	
	
	
	
	
	
	
	
	
	
}


