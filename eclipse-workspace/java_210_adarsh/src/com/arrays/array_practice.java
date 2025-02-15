package com.arrays;

public class array_practice {

	public static void main(String[] args) {
	
		int[] arr = new int[5];

		int num1 = 12;
		int num2;
		int num3;
		int num4;
		int num5;

	//	arr[0] = 12;
	//	arr[4] = 100;
	//	System.out.println(arr[0]);
	//	System.out.println(arr[4]);
	//	System.out.println(num1);
		
	arr[0]=12;
	arr[4]=100;
	int c= arr[0]+arr[4];
	System.out.println(c);
	
	arr[2]=c;
	System.out.println(arr[2]);
	
	}

}
