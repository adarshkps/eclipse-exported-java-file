package string;

public class stringpool {

	public static void main(String[] args) {
		String s1="john";
		String s2="john";
		String s3=new String ("john");
		
//		System.out.println(s1==s3);			//it will compare the ref.variables
//		System.out.println(s1.equals(s3));	//it will compare the values in the string
//		System.out.println(s1==s2);			//it also compare the ref.variables but it is having the same object because the string has not new keyword in the creation of the string
	
		String a1=new String ("jack");
		String a2=new String ("jack");
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}

}
