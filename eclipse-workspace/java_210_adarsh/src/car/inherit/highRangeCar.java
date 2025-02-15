package car.inherit;

public class highRangeCar extends car{

	void roof()
	{
		System.out.println("open roof of a high range car");
	}
	void display()
	{
		System.out.println("display of the high range car");
	}
	public static void main(String[] args) {
		
		highRangeCar hc1=new highRangeCar();
		hc1.accelarator();
		hc1.roof();
	}
}
