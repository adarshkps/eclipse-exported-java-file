package mypratice1;

public class car implements vehicle{
	public void fueltype()
	{
		System.out.println("this is the fuel capacity of a car");
	}
	public void start()
	{
		System.out.println("this is the start function of a car");
	}
	public void stopEngine()
	{
		System.out.println("this is te stopping function of a car");
	}
	public static void main(String[] args) {
		car obj1=new car();
		obj1.fueltype();
		obj1.start();
		obj1.stopEngine();
    }
}
