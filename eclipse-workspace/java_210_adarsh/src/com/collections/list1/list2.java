package com.collections.list1;

import java.util.ArrayList;
import java.util.List;

public class list2 {

	public static void main(String[] args) {
		//List <datatype> name =new ArrayList <datatype>();
		
//		List<Integer> i1=new ArrayList <Integer>();
//		i1.add(0);
//		i1.add(10);
//		i1.add(1000);
//		i1.add(10);
//		i1.add(10);
//		
//		System.out.println("size "+i1.size());
//		System.out.println(i1.contains(10));
//		
//
//		for (int i=0;i<i1.size();i++)
//		{
//			System.out.println(i1.get(i));
//		}
//		
//		
//		//for each , there is no initialization no condition and no inc or decr
//		for (int i:i1)
//		{
//			System.out.println(i);
//		}
		
		List <String> s1=new ArrayList <String>();
		
		s1.add("this is adarsh");
		s1.add("this is adithya");
		s1.add("this is vikas");
		s1.add("this is laxman");
		
		System.out.println(s1.size());
		for (String i:s1)
		{
			System.out.println(i);
		}
		List<Character> c1=new ArrayList<Character>();
		
		c1.add('d');
		c1.add('2');
		c1.add('2');
		System.out.println(c1.size());
		for (char c:c1) 
		{
			System.out.println(c);
		}
		
		
		List<Object> o1=new ArrayList<Object>();
		o1.add("this is akhila");
		o1.add('A');
		o1.add(12.2f);
		o1.add(21);
		for (object i:o1)
		{
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
