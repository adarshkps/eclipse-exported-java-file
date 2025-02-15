package oops.concept;

public class my_object {
	
	public static void main(String[] args) {
		student s1=new student();
		
		
		s1.roll_no=20;
		s1.ch ='a';
		s1.dist =2.5f;
		System.out.println(s1.roll_no);
		System.out.println(s1.ch);
		System.out.println(s1.dist);
		
		student s2=new student();
		s2.roll_no=12;
		s2.ch='b';
		s2.dist=3.5f;
		System.out.println(s2.roll_no);
		System.out.println(s2.ch);
		System.out.println(s2.dist);
		
		student s3=new student();
		s3.roll_no=90;
		s3.ch='c';
		s3.dist=3.6f;
		System.out.println(s3.roll_no);
		System.out.println(s3.ch);
		System.out.println(s3.dist);
		
		student.d=20;
	}

}
