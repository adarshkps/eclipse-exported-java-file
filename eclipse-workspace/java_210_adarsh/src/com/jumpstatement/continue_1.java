package com.jumpstatement;

public class continue_1 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			if (i!=1)
			{
				continue;
			}
			System.out.println(" world");
		}
		for(int i=0;i<5;i++)
		{
			if (i==3)
			{
				continue;
			}
			System.out.println("hello world "+i);
		}
		
		int val1=1;
		int val2=2;
	
		if(val1>val2)
			System.out.println("sunday");
		else if(val2>val1)
			System.out.println("monday");
		else
			System.out.println("wrong input");
		
	}

}
