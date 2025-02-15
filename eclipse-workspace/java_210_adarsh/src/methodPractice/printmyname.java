package methodPractice;

public class printmyname {
	
	void myname()
	{
		System.out.println("john");
	}
	void printtwoint(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	void sumtwonumbers(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		System.out.println("hellow world");
		printmyname e1=new printmyname();
		e1.myname();
		e1.printtwoint(20,25);
		e1.sumtwonumbers(20, 93);
		
	}

}
