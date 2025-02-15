package oops.concept;

public class employee {

	int age;
	float sal;
	char ch;
	long id;
	static int inc;
	
	public static void main(String[] args) {
		
		employee e1=new employee();
		employee e2=new employee();
		
		e1.age=25;
		e1.sal=25000;
		e2.age=14;
		e2.sal=30000;
		employee.inc=10;
		
		System.out.println(e1.age);
		System.out.println(e1.sal);
		System.out.println(e2.age);
		System.out.println(e2.sal);
		System.out.println(employee.inc);
	}
}

