package string;

public class stringpractice {

	public static void main(String[] args) {
		String s="john";
		String s2="JOHN";
		
	//	char ch=s.charAt(0);
	//	System.out.println(ch);
	//	char ch2=s.charAt(4);				//it throws error cause the index number 4 is not available in the string
	//	System.out.println(ch2);			//it doesn't work
	//	char ch3= s.charAt(1);
	//	System.out.println(ch3);
	//	char ch4=s.charAt(2);
	//	System.out.println(ch4);
	//	char ch5=s.charAt(3);
	//	System.out.println(ch5);
		
	//	for (int i=0;i<4;i++)
	//	{
	//		char ch=s.charAt(i);
//			System.out.println(ch);                                                                                                                                  
//		}
		
		int l=s2.length(); 		//if the string values are same then the string length is also same
		System.out.println(l);
		
		boolean b=s.equals(s2);
		System.out.println(b);
		
		boolean b1=s.equalsIgnoreCase(s2);
		System.out.println(b1);
		
		 System.out.println(s.toUpperCase());
		 System.out.println(s2.toLowerCase());
		 
		 System.out.println(s.substring(2));
		 System.out.println(s.substring(0,2));
		 String s3= "i am learning java";
		 System.out.println(s3.substring(2,7));
		 
		 System.out.println(s3.concat(" im learning selenium"));	// we can also use the + in the place of concat.
		 System.out.println(s3.contains("java"));
		 
		 System.out.println(s3.indexOf("g"));
		 System.out.println(s3.lastIndexOf("i"));
		 
		 String s4="hello this is adarsh";
		 System.out.println(s4.startsWith("hello")); 		//true
		 System.out.println(s4.startsWith("helo"));			//false cause the inserted string is not matching with the string
		 System.out.println(s4.endsWith("adarsh"));			//true
		 System.out.println(s4.endsWith("adarsh "));		//false because the space is also matters in the string
		 
		 String s5="";
		 System.out.println(s5.isBlank()); 				//if the string is not having any values in that situations we use the concept of blank to check that it is blank
		// String s6 = null;
		// System.out.println(s6.isEmpty());				//it will throw error because the value less string cant be used
		 String s7="i am learning java";
		 System.out.println(s7.replace("java","selenium"));
		 
		 String s8="hello world im learning selenium";
		 String arr[]=s8.split(" ");
		 System.out.println(arr[0]);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
