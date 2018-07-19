class A
{  	
	int x = 300;
	private A()
	{
	
	}
	
	
	
	public static void Afun()
	{
		int x=100;
		x=400;
		A a = new A();
		System.out.println("Printing x = "+a.x+"And this is local x: "+x);
	}
}

/*class B extends A
{
	
}*/

public class Demo
{
	public static void main(String[] args) 
	{
		A.Afun(); 
		
	}
	}