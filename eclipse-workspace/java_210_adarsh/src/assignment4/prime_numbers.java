package assignment4;

public class prime_numbers {
	public static void main(String[] args) {

		int n = 100;

		for (int a = 1; a < n; a++) 
		{
			int count = 1;
			for (int i = 2; i <= a; i++) 
			{
				if (a % i == 0) 
				{
					count++;

			    }
		
			}
			if (count == 2) 
			{
				System.out.println(a + " print prime number");
			}

		}
	}

}
