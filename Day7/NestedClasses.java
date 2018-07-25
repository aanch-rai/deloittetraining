//4 types of inner classes


package day7;

class A
{
	String pwd = "hello123";
	public class inner
	{
		int changeddate=10;
		public void display()
		{
			System.out.println(changeddate);
			System.out.println("Original Password : "+pwd);
			pwd = "hola123";
		}
	}
	
	public void changeddisp()
	{	inner i = new inner();
		i.display();
		System.out.println("Changed pwd = "+pwd);
	}
}






public class NestedClasses
{
	public static void main(String[] args)
	{
		A a = new A();
		a.changeddisp();
		A.inner nested = a.new inner(); //This is how you create object of inner class when it is not a static class
		nested.display();
		
	}

}
