package exceptions;

public class practice1 {

	public void div(int a, int b)
	{
		System.out.println("selenium");
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("there is an exception");
		}
		finally
		{
		System.out.println("java");
		System.out.println("close the connection with the database");
     	}
	
}
	public static void main(String[] args) {
		practice1 p1=new practice1();
	//	p1.div(10,0);
		
		//FileInputStream fis=new FileInputStream("myfile.logs");
		
		 int arr []= {1,54,32,11,53};
		// for (int i=0;i<=5;i++)
		// {
		//	 System.out.println(arr[i]);
		// }
		 try
		 {
		 	System.out.println(arr[4]); 
		 	System.out.println(5/0);
		 }
		 catch(ArithmeticException e)   // it will throw error because of the exception we are mentioning is incorrect.
		 {
			 System.out.println("Arithmetic exception generated");
		 }
		 catch(ArrayIndexOutOfBoundsException e)  // we can create multiple catch blocks
		 {
			e.printStackTrace();
		 }
		 System.out.println("there is an exception");
		
	}
}
