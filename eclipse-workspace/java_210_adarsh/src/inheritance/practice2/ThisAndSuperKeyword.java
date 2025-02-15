package inheritance.practice2;

class S {
	int id= 10;
	
}

class T  extends S{
	int id = 30;

	public void printId() {
		
		int id=40;
		System.out.println(id+this.id+this.id+super.id);
	}
}

public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		
		T obj1=new T();
	//	obj1.printId();
		
		int a=10; int b=20;
		System.out.println("the sum is "+a+b);
		System.out.println("the sum is "+(a+b));
	}
}
