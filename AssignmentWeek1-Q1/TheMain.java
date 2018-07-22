package shapesQ1;
import java.util.Scanner;



public class TheMain
{
	public static void main(String[] args)
	{
		System.out.println("Enter shape to calculate area and volume");
		System.out.println("1--Rectangle\n2--Triangle\n3--Sphere\n4--Cube");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		double aans; //this variable stores area
		double vans; //this variable stores the volume
		
		switch(choice)
		{
		case 1 : Rectangle r = new Rectangle();
				 aans = r.area();
				 System.out.println(aans);
				 vans = r.volume();
				 System.out.println(vans);
				 break;
				 
		case 2 :  Triangle t = new Triangle();
		 		  aans = t.area();
		 		  System.out.println(aans);
		 		   vans = t.volume();
		 		  System.out.println(vans);
		 		  break;
		case 3:  Sphere sp = new Sphere();
		 		 aans = sp.area();
		 		 System.out.println(aans);
		 		 vans = sp.volume();
		 		 System.out.println(vans);
		 		 break;
		case 4:  Cube c = new Cube();
		 		 aans = c.area();
		 		 System.out.println(aans);
		 		 vans = c.volume();
		 		 System.out.println(vans);
		 		 break;
	  default: System.out.println("Invalid Input");
		}
	s.close();	
		
	}

}
