package com.abstractpractice1;
interface P
{
	public abstract void register();
}
public class ICICI implements RBI {
	

	@Override
	public void withdraw()
	{
		System.out.println("ICICI logic for withdraw money");
	}

	@Override
	public void deposit() 
	{
	System.out.println("deposit logic for ICICI");	
	}

	@Override
	public void scanner()
	{
		System.out.println("scanner feature of ICICI");
	}
	public void register() {
		System.out.println("registration of P in ICICI");
	}
	public static void main(String[] args) {
		
		ICICI ob1=new ICICI();
		ob1.withdraw();
		ob1.deposit();
		
		
		
	}

}
