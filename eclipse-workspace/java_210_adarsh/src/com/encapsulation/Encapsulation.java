package com.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setEmail("adarshkp@gmail.com");
		String e=s1.getEmail();		// if we want to store this we can do like this 
		System.out.println(e);
		
		//if don't want to store we can do like this 
		System.out.println(s1.getEmail());
		s1.setId(12);
		int i=s1.getId();
		System.out.println(i);
		s1.setName("adithya");
		String a=s1.getName();
		System.out.println(a);
		s1.setPassword("124hdfh234");
		String P=s1.getPassword();
		System.out.println(P);
		
	}
}
