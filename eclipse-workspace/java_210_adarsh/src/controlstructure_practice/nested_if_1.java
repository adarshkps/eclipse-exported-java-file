package controlstructure_practice;

public class nested_if_1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
	//	if(a>b)
	//	{
	//		if(a>c)
	//		{
	//			System.out.println("inside if");
	//		}
	//	}
	//	System.out.println("hello");
	
		if (a>b)
		{
			System.out.println("first if");
			if (a>c)
			{
				System.out.println("inside if");
				if (a>30)
				{
					System.out.println("java");
				}
			}
			System.out.println("last if");
		}
	
	
	}


}
