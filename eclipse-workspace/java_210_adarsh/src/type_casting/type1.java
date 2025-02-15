package type_casting;

public class type1 {

	public static void main(String[] args) {
		
		int a=5;
		float b;
		b=a;
	//	a=b;		//it is not possible to convert the float value value into int
					//instead of that we do type casting. like datatype1=(datatype1)datatype2
		
				System.out.println("int a-> "+a);
				System.out.println("float b-> "+b);
				
				
		float x=5.5f;
		int z;
		
		z=(int)x;
		System.out.println("float x--> "+x);
		System.out.println("int z--> "+z);

	}

}
