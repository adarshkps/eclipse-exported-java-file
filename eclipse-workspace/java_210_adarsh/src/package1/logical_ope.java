package package1;

public class logical_ope {
	public static void main(String[] args) {
		
		boolean a=true;
		boolean b=false;
		
		boolean c=a&&b;
		
		System.out.println(c);
		boolean b1=a||b;
		
		System.out.println(b1);
		
		int num1=10;
		int num2=20;
		
		boolean num3=num1>num2;
		System.out.println(num3&&false);
		System.out.println(num3&&true);
		
		
		
		
		
	
		int age=21;
		char ch='s';
		
		if (age>18)
		{
			System.out.println(ch+" you are eligible ");
		}
		else 
		{
			System.out.println(ch+"you are not eligible");
		}
	}

}
