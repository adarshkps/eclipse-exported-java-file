package oops.concept;

public class my_object2 {

	public static void main(String[] args) {
		
		int roll_no;
		char ch;
		float dist;
	
		student s1=new student();
		s1.roll_no=20;
		s1.ch ='a';
		s1.dist =2.5f;
		s1.d=10;
		student s2=new student();
		s2.roll_no=12;
		s2.ch='b';
		s2.dist=3.5f;
		s2.d=12;
		
		System.out.println(s1.d);
		System.out.println(s2.d);
	}
}
