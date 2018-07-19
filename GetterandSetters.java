
public class GetterandSetters
{
	public static void main(String[] args)
	{
		ConstructorsOverloading c = new ConstructorsOverloading(10,"neeta");
		int v = c.getBillAmount();
		c.Display();
		System.out.println();
		String name;
		GetterandSetters l = new GetterandSetters();
		l.initi();
	}

	public void initi() {
		int i=0;
		String name = "Hollani";
		System.out.println(name + i);
	}

}
