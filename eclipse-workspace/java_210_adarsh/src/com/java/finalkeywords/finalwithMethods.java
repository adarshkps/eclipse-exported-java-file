package com.java.finalkeywords;
class A
{
	public void brake()
	{
		System.out.println("hello");
	}
final public void shiftGear()
	{
		System.out.println("shiftGear");
	}
public void shiftGear(int a)
	{
	System.out.println("shifting the gear of the car");
	}
	
}
public class finalwithMethods extends A{
	
	public void brake()
	{
		System.out.println("stop the vehicle");
	}
//	public void shiftGear()
	{
		System.out.println("the car having 5 shiftGears");
	}
	public static void main(String[] args) {
	
		finalwithMethods f1=new finalwithMethods();
		f1.brake();
		f1.shiftGear();
		
		
		
		
		
		
		
		
		
	}

}
