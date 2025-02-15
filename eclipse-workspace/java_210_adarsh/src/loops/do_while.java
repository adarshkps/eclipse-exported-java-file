package loops;

public class do_while {
	public static void main(String[] args) {
		for (int i=0;i<3;i++)
		{
			System.out.println("java "+i);
		}
		int j=4;
		do
		{j--;
			System.out.println("hello world");
			j++;										//this is an infinite loop
		}while(j<5);
		System.out.println(j);
	}	
}