class Animals
{
	public Animals()
	{
		System.out.println("In the parent- Animal Class");
		// TODO Auto-generated constructor stub
	}
	
	public void eat()
	{
		System.out.println("All Animals eat.");
	}

}


class Men extends Animals
{
	public Men() 
	{   
		System.out.println("In child - Men's Constructor.");// TODO Auto-generated constructor stub
	}

	
	
	public void eat()
	{  
		System.out.println("All men eat Veg and non-Veg!");
	}
}


class Dog extends Animals
{
	public Dog() 
	{
		System.out.println("In child - Dog's Constructor.");// TODO Auto-generated constructor stub
	}
	
	public void eat()
	{
		System.out.println("All dogs eat pedigree!");
	}
}



public class Inheritance 
{
public static void main(String[] args)
{	Men m = new Men();
	m.eat();
	System.out.println("");
	//Now, using references
	
	Animals a  = new Men();
	a.eat();
	a =new Dog();
	a.eat();
}


}



