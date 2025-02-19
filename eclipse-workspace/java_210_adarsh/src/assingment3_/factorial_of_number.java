package assingment3_;

public class factorial_of_number {

	public static void main(String[] args) {
		
		// factorial means if we want to find the factorial value then 
		// 5 factorial or 5!
		//5x4x3x2x1
		
		int num=10;
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println(fact);
	}

}
