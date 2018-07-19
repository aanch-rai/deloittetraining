
public class customer
{int p;
	public void dis()
	{System.out.println("No parameters");}
	
	
	
	public void dis(int n1, int n2)
	{
		System.out.println("2 integers are given as parameters");
	}
	
	public void dis(int...num)
	{for (int i:num)
	{
		System.out.println(i);
	}
	}
	

	public static void main(String[] args) {
		customer c = new customer();
		c.dis();
		c.dis(3,6);
		c.dis(3,5,7,8,9,5,3,5);
		}

}
