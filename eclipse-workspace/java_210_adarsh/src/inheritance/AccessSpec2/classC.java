package inheritance.AccessSpec2;

import inheritance.AccessSpec1.classA;

public class classC extends classA{
         
	public void printDataInSubClass()
	{
		System.out.println(pub);	// we can access the public variable inside the package and outside the package also
	//	System.out.println(pri);	// we can't access the private variable outside the class and outside the package
		System.out.println(pro);	// we can access protected when we are extending the class when outside the package
									//but we can't access it by creating an object
	//	System.out.println(def);	// we can access it in another class within the package but we can't access it outside
									//the package
	}
	public static void main(String[] args) {

		classA obj1=new classA();
		obj1.pub=12;
//		obj1.pri=10;	// it not possible to access the private variable outside the created class
//		obj1.def=19;	// it is not possible to access the default variable or method outside the package
//     	obj1.pro=14;	// it is not possible to access the protected outside the package but we can access it when 
						//we use extends
		
	}
}


