package com.abstractpractice1;

public interface RBI {
		public abstract void withdraw();
		public abstract void deposit();
		
		static void nfc()			// we can use the default or static to provide the body or code in the interface.
		{
			System.out.println("non-abstract method in interface");
		}
		default void scanner()
		{
			System.out.println("non-abstract method in the interface2");
		}

}
