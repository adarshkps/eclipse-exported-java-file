package controlstructure_practice;

public class greatest_of_three_num {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b&&a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>c&&b>a)
		{
			System.out.println("b is greater than a and c");
		}
		else
		{
			System.out.println("c is greater than a and b");
		}
	}

}
