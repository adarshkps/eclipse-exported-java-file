package class2;

public class multi {
	int a;
	int b;
	void multip(int nu1,int nu2)
	{
		int nu3=nu1*nu2;
		System.out.println(nu3);
	}

	public static void main(String[] args) {
	
		multi m1=new multi();
		m1.multip(5, 3);

	}

}
