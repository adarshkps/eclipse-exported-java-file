package com.encapsulation;

public class Student {
	private	int id;
	private	String name;
	private	String email;
	private	String password;
		
	public void setEmail(String e)
	{
		// we can write some logics for the variable here
		
		if (e.endsWith("@gmail.com"))
		{
			this.email=e;
			
		}
		else
		{
			System.out.println("emial is invalid");	
		}
	}
	public String getEmail ()
	{
		return this.email;
	}
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return this.name;
	}
	public void setPassword(String p)
	{
		if(p!=null)
		{
			this.password=p;
		}
		else
		{
			System.out.println("enter valid password");
		}
	}
	public String getPassword()
	{
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
}
