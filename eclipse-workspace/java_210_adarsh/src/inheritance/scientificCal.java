package inheritance;

public class scientificCal extends calculator {

	void power(int num1,int num2)
	{
		System.out.println(Math.pow(num1, num2));
	}
	public static void main(String[] args) {
		
		scientificCal calc1= new scientificCal();
		calc1.add(5, 10);
		calc1.power(5, 2);			// why it is showing the float value in the console when executing this code
		
		calculator c1=new calculator();
		c1.add(10,12);				 // by creating the calculator class we can only call the methods those in the parent class
									// we can't call other methods those in the child class. 
		
//		Grandfather.c2=new Grandfather();  	// it is not possible because we should not create object of an another class
//		c2.oldmethod();
		
		
		
		
		
		
	}
	
}
