abstract class Vehicle
{	
	int price;
	public Vehicle()
	{
		System.out.println("In the abstract parent class - Vehicle's constructor");// TODO Auto-generated constructor stub
	}
	public abstract void start();
	public abstract void stop();
	public void music()
	{
		System.out.println("Music functionality available!");
	}
}


class Car extends Vehicle
{
	int price=500;
	public Car()
	{	
		int price = 1000;
		super.price = 2000;
		System.out.println("In the child -Car's constructor");
		System.out.println("And the price of the Car = "+price+"\n");// TODO Auto-generated constructor stub
	}
	
	public void start()
	{
		System.out.println("Starting the Car Engine!");
	}
	
	public void stop()
	{
		System.out.println("Stopping the CAR!");
	}
	
	

}



public class AbstractClasses
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();
		v.stop();
	}

}
