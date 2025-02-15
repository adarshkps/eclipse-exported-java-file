package inheritance.AccessSpec1;

public class classB extends classA{
	void printDatawithInheritance()
	{
		System.out.println(pub);
		System.out.println(def);
		System.out.println(pro);
	//	System.out.println(pri); 	// we can't access it outside the class 
		
	}

	public static void main(String[] args) {
		
		classA obj1=new classA();
		obj1.pub=30;
		obj1.def=20;
		obj1.pro=10;
	//  obj1.pri=201;
		
	}
}
