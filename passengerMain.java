
public class passengerMain
{
	public static void main(String[] args)
	{
		Passenger p1 = new Passenger(1927,"Yami",25);
		Passenger p2 = new Passenger(1927,"Yami",25);
		Passenger p3 = p1;
		
		System.out.println(p3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}

}
