package car.inherit;

public class car {

	void shiftgear()
	{
		System.out.println("shifting gear of a car");
	}
	void start()
	{
		System.out.println("starting the car");
	}
	void breake()
	{
		System.out.println("breaking system of a car");
	}
	void clutch()
	{
		System.out.println("cluth of a car");
	}
	void accelarator()
	{
		System.out.println("accelarator of car");
	}
	void headlights()
	{
		System.out.println("LED lights of a car");
	}
	
	public static void main(String[] args) {
	

		car c1=new car();
		c1.shiftgear();
	}

}
