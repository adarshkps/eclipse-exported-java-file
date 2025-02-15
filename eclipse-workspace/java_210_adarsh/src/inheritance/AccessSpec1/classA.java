package inheritance.AccessSpec1;

public class classA {

	public int pub=10;
	private int pri=20;
	protected int pro=30;
	          int def=40;
	void printData()		// we should not any access specifier so it will be default access specifier
	{
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	}
	private void printPrivateData()
	{
		System.out.println("hello ");
	}
	public static void main(String[] args) {
		
		classA obj=new classA();
	    obj.printData();		// it will print the values in the instance variables
		 
		obj.pub=100;
		obj.pri=200;
		obj.pro=300;
		obj.def=400;
	    obj.printData(); 	// there is already a print data up so it will print the instance variable values 
	    					//and new values also
	    obj.printPrivateData();	// it will print the private method because it is created in the same class
	    						// if we want to access it in another class it is not possible
		 
		
		
		
		
		
	}
}
