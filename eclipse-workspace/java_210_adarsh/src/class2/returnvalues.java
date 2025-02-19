package class2;

public class returnvalues {

	int printwith10(int value)
	{
		int ans=value*10;
		
		return ans;
		
	}
	public static void main(String[] args) {
		
		returnvalues r1=new returnvalues();
	//	r1.printwith10(10);
		int z=r1.printwith10(19);
		System.out.println(z);
  }
}
