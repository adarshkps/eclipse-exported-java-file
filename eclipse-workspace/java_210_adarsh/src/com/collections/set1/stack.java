package com.collections.set1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
//		Set<Integer> s1=new HashSet<Integer>();
//		
//		 s1.add(100);
//		 s1.add(20);
//		 s1.add(30);
//		 s1.add(1680);
//		 s1.add(20);
//		 s1.add(30);
//		 s1.add(123);
		
		Stack <Integer> q1=new Stack<>();
		
		
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		for (int i=0;i<q1.size();i++)
		{
			System.out.println(q1.pop());
			System.out.println(q1.pop());
			
			
		}
	
		
	}
}
