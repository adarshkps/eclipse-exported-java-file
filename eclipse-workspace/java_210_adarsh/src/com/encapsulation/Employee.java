package com.encapsulation;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String email;
	private float salary;
	
	public void setID(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String N)
	{
		if(N!=null)
		{
			this.name=N;
		}
		else
		{
			System.out.println("enter valid name");
		}
	}
	public String getName()
	{
		return this.name;
	}
	public void setAddress(String A)
	{
		if(A.contains("-"))
		{
			this.address=A;
		}
		else
		{
			System.out.println("enter valid address");
		}
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setmail(String E)
	{
		if(E.endsWith("@gmail.com") ||E.endsWith("@gmail.in"))
		{
			this.email=E;
		}
		else 
		{
			System.out.println("enter valid Email");
		}
	}
	public String getmail()
	{
		return this.email;
	}
	public void setSalary(float S)
	{
		this.salary=S;
	}
	public float getSalary()
	{
	return this.salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
