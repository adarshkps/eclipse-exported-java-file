package com.collections.set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set2 {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		
		
		
		 s1.add(100);
		 s1.add(20);
		 s1.add(30);
		 s1.add(1680);
		 s1.add(20);
		 s1.add(30);
		 s1.add(123);
		Iterator <Integer>i1=s1.iterator();
		 
		
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
		
		
	}
}
