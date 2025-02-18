package com.collections.set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setPractice {

	public static void main(String[] args) {
		
		Set <Character> c1=new HashSet<>();
		c1.add('s');
		c1.add('h');
		c1.add('y');
		c1.add('a');
		c1.add('r');
		c1.add('a');
		c1.add('n');
		
		
		Iterator<Character> i2=c1.iterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
