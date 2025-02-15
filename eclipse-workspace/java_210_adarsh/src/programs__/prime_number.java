package programs__;

public class prime_number {

	public static void main(String[] args) {

		
		int n=5;
		int count =0;
		
		for (int i=1;i<=n;i++)
	//	{
	//		System.out.println(i);
	//	}
		{
			if(n%i==0) 
			{
				count++;
				System.out.println(i+" hello world "+count);                                                                                    
			}
		}
		  
	}

}
