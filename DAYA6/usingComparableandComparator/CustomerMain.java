//have tostring, constructors, equals- hashcode, getter and setter required in the CustomerList class 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain
{
	public static void main(String[] args)
	{
		List<CustomerList> allCustomers = new ArrayList<CustomerList>();
		
		CustomerList c1 = new CustomerList(10,500,"Uma","Pune");
		allCustomers.add(c1);
		allCustomers.add(new CustomerList(20,500,"Rai","Mumbai"));
		allCustomers.add(new CustomerList(70,500,"Sita","Nepal"));
		System.out.println(allCustomers);
		
		for(CustomerList c:allCustomers)
		{
			System.out.println(c);
		}
		
		System.out.println("\n\n");
		System.out.println("Sort on CusomerName using comparable");
		 Collections.sort(allCustomers); //to use sort implement COMPARABLE interface by CustomerList
		 //and we must override compareto function
	//	 System.out.println(allCustomers);
			for(CustomerList l:allCustomers)
			{
				System.out.println(l);
			}
			
			
			//Now if we have to take input to decide what to sort create a new class superclass util
			System.out.println("Sort based on address using comparator");	
			Collections.sort(allCustomers,new CustomerAddressComparator());
			for(CustomerList l:allCustomers)
			{
				System.out.println(l);
			}
			
		
			
			//to sort based on id --using comparator customerIdComparator
			System.out.println("\n\nBased on id using comparator");
			Collections.sort(allCustomers, new customerIdComaprator());
			for(CustomerList h: allCustomers)
			{
				System.out.println(h);
			}
	}

}
