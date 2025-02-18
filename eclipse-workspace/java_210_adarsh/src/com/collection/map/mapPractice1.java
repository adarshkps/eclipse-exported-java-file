package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapPractice1 {
public static void main(String[] args) {
	
	//key and value pair like roll_no -->name
	//Map<key_value> m1=new  HashMap<key,value>();
	
	Map<Integer,String> m1=new HashMap<>();
	
	m1.put(123,"adarsh");
	m1.put(1241, "selenium");
	m1.put(124, "selenium ");
	m1.put(1233,"adarsh is learning java");
	
	
//	System.out.println(m1.get(1233));
	
	Set<Integer>s1= m1.keySet(); 
	List <Integer>i1=new ArrayList<>(s1);
	
	for (int i:i1)
	{
		System.out.println(m1.get(i));
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
