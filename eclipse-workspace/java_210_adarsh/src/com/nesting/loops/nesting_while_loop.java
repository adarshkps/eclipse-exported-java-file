package com.nesting.loops;

public class nesting_while_loop {
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		while(i<3)
		{
			while(j<2)
			{
				System.out.println("hello world");
				j++;
			}
			i++;
		}
	}

}
