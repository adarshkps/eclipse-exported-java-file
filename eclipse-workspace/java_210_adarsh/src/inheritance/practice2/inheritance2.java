package inheritance.practice2;

class A
{
	int a;
	void printmyname(String name)
	{
		System.out.println(name);
	}
}
class B 
{
	
	int id;						// The default of the int is 0
	String course;   			// The default of the string is null
	void printmycourse(String course,int id)
	{
		this.id=this.id;
		course=this.course;
		System.out.println(this.course+"_"+this.id);
	}
	void printvalueofID()
	{
		System.out.println(id);
		System.out.println(course);
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		B obj1=new B();
		
	//	obj1.printmyname();  		this is an error because the method is not available in the classB
		obj1.printvalueofID();
		obj1.printmycourse("testing ", 100);
		obj1.printvalueofID();
		
		
	}
}
