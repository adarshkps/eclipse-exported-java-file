package string;

public class string2 {

	public static void main(String[] args) {
		
	//	String s=new String ("adarsh");
	//	System.out.println(s);

	//	String s2="12";
	//	String s3="12";
	//	System.out.println(s2+s3);	//it will concatinate the string not add the values so it will print as 1212
		
	//	System.out.println(s2==s3);		// it will passes the condition to equals to the ref.variable that in the inner mechanism
	//	System.out.println(s2.equals("12"));// we can pass the ref.variable name also this condition is applies to the values in the string
		
	//	String s="john";
	//	for(int i=s.length()-1;i>=0;i--)
	//	{
	//		System.out.print(s.charAt(i));
	//	}
		
		String a="madam";
		String or=a;
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
		char ch=a.charAt(i);
		rev=rev+ch;
		}
	//	System.out.println(or);
	//	System.out.println(rev);
		if(a.equals(rev))
		{
			System.out.println("it is plaindrome");
		}
		else
		{
			System.out.println("it is not plaindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
