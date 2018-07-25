//demonstrating Gerneric Classes
package day7;

public class GenericClassDemo <Z>
{

	
	public void disp(Z name)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
	
		GenericClassDemo <Integer> d= new GenericClassDemo<Integer>();
		d.disp(32);
		GenericClassDemo <String> d1 = new GenericClassDemo<String>();
		d1.disp("Hello");
		
		GenericClassDemo<Double> d2 = new GenericClassDemo<Double>();
		d2.disp(21.76);
		
		Integer[] intArray = {1,4,5};
		
	}
}
