package mypratice1;

public class classPractice {
public static void main(String[] args) {
	
	int num1=0;
	int num2=10;
	
	if (num1<num2)
	{
		System.out.println("the num1 has the lower value");
	}
	else
	{
		System.out.println("the num2 has the higher value");
	}
	
	int a=0;
	int b=10;
	int c=20;
	
	if (a>b||b>c)
	{
		System.out.println("a has the lowest value");
	}
	else if(b>c||c<a)
	{
		System.out.println("b has the medium value");
	}
	else 
	{
		System.out.println("c has the highest value");
	}
	
	//nested if
	 
	if (12>10)
	{
		if (10>5)
		{
			System.out.println("here is the lower value");
		}
	}
	
	for (int i=0;i<5;i++)
	{
		System.out.println(i);
	}
	
	for (int i=0;i<2;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==2)		
			{
				break;
			}
			System.out.println(i+"i hello world j"+j);
			
			
		}
	}
	
	for (int i=10;i>5;i--)
	{
		
			if(i==8)
			{
				continue;
			}
		
		System.out.println(i+"reverse the number from 10 to 5 ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
