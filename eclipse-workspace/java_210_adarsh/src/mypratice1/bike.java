package mypratice1;

public class bike implements vehicle{

	@Override
	public void fueltype() {
		System.out.println("this is the fuel capacity of a bike");
	}

	@Override
	public void start() {
		System.out.println("this is the start function of the bike");
	}

	@Override
	public void stopEngine() {
		System.out.println("this is the stop engine function of a bike");
		
	}
	public static void main(String[] args) {
	bike ob1=new bike ();
	ob1.fueltype();
	ob1.start();
	ob1.stopEngine();
	}

}
