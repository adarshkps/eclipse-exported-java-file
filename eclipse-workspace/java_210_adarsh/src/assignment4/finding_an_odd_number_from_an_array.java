package assignment4;

public class finding_an_odd_number_from_an_array {

	public static void main(String[] args) {
		
		int []arr=new int [1];
		
		arr [0]=10;
		
		for(int i=1;i<arr[0];i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd number "+i);
			}
		
		}
	
	}
}
