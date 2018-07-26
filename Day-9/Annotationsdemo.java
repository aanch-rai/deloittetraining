package day9;

public class Annotationsdemo
{
	@Deprecated
	@author(name="hihi",number="one")
	public void display()
	{
		System.out.println("Displaying");
	}
	
	public void JDBCInsertTest()
	{
		System.out.println("Testing the insert");
	}
	
	public static void main(String[] args)
	{
		System.out.println("In Main");
		Annotationsdemo a = new Annotationsdemo();
		a.display();
		
		
	}
}
