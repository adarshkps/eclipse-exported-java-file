package com.collections.set1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set1 {
public static void main(String[] args) {
	
	Set<Integer> s1=new HashSet<Integer>();
	
	
	
	 s1.add(100);
	 s1.add(20);
	 s1.add(30);
	 s1.add(1680);
	 s1.add(20);
	 s1.add(30);
	 s1.add(123);
	 List <Integer>i1=new ArrayList<Integer>(s1);
	 
	 for (int i=0; i<i1.size();i++)
	 {
		 System.out.println(i1.get(i));
	 }
	 
	// for each 
	 for (int j:i1)
	 {
		 System.out.println(j);
	 }
}
}
