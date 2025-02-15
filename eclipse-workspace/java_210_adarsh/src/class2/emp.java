package class2;

public class emp {
	
	int age;
	int id;
	float sal;
	
	void getage(int a)
	{
		 age=a;
	  System.out.println(a);
	}
	void getid(int b)
	{
		 id=b;
		System.out.println(b);
	}
	void getsal(float c)
	{
		 sal=c;
		System.out.println(c);
	}
	void printalldetails()
	{
		System.out.println("age--> "+age+"    id--> "+id+"   sal--> "+sal);
	}
	  

	public static void main(String[] args) {
		
		emp e1=new emp();
	
		e1.age=10;
		e1.id=120;
		e1.sal=123433.34f;
		e1.printalldetails();
		
	
	}

}
