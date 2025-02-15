package com.abstractpractice1;

abstract class basic
{
	public abstract void reg();
}

abstract class Car extends basic
{
	int  adhi=20;	// in interface it will be final when we write a variable and we can not change it in abstract class it is not final 
	public abstract void brake();
	public abstract void clutch();
	public void accelator()
	{
		System.out.println("this is a normal method of accelator in class car");
	}
	public void shiftgear()
	{
		System.out.println("shiftgear of the car");
	}
	private int a=20;		// we can have the private methods/variables in the abstract class but we can have private method in interface.
	public void getdata(int num1)
	{
		a=num1;
		System.out.println(a);
	}
	Car()
	{
		System.out.println("here is the constructor");
	}
}
public class C1 extends Car {

	@Override
	public void brake() {
		System.out.println("this is the brake of the car");
		
	}

	@Override
	public void clutch() {
		System.out.println("this is the clutch of the car");
	}

	@Override
	public void reg() {
		System.out.println("reg of the car");		
	}
	public static void main(String[] args) {
		C1 obj1 = new C1();
		obj1.brake();
		obj1.clutch();
		obj1.accelator();
		obj1.reg();
	}
}
	
	

