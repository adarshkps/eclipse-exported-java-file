package constructorChaining;

class setup {
	setup() {
		System.out.println("this is setup");
	}

	setup(int a) {
		System.out.println("this is setup" + a);
	}

	void f1() {
		System.out.println("f1");
	}
}

public class Base extends setup {

	Base() {
		super(); // it automatically created by the java to search for the default constructor in
					// the parent class.
		// we can pass values in to it when there is an argument. it should be in the
		// child class and in the first line only.
		System.out.println("this is base");
	}

	void f2() {
		System.out.println("f2");
	}

	public static void main(String[] args) {

		Base b1 = new Base();

	}
}
