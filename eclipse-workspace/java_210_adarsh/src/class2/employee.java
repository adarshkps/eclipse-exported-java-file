package class2;

public class employee {
	
	int age;
	int id;
	char ch;
	float salary;
	int num1,num2;
	
	void getage(int a)
	{
		age=a;
	}
	void printAge()
	{
		System.out.println(age);
	}
	void div()
	{
		System.out.println(num1/num2);
	}

	public static void main(String[] args) {
		
		employee e1=new employee();
		e1.getage(20);
		e1.printAge();
		e1.num1=10;
		e1.num2=5;
		e1.div();
	}

}
