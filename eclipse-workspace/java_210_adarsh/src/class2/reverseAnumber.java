package class2;

public class reverseAnumber {

	public static void main(String[] args) {
		
		int num1=12345;
		int ori=num1;
		int rev=0;
		int r=0;
		while(num1>0)
		{
			r=num1%10;
			rev=rev*10+r;
			num1=num1/10;
		}
		System.out.println(rev);
		if(ori==rev)
		{
			System.out.println("plain drome");
		}
		else
		{
			System.out.println("not plaindrome");
		}
	}

}
