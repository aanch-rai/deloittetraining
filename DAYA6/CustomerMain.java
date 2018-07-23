//have tostring, constructors, equals- hashcode, getter and setter required in the CustomerList class 

import java.util.ArrayList;
import java.util.List;

public class CustomerMain
{
	public static void main(String[] args)
	{
		List<CustomerList> allCustomers = new ArrayList<CustomerList>();
		
		CustomerList c1 = new CustomerList(10,500,"Pune","Uma");
		allCustomers.add(c1);
		allCustomers.add(new CustomerList(20,500,"Raichur","Anu"));
		allCustomers.add(new CustomerList(70,500,"Nepal","Renu"));
		System.out.println(allCustomers);
		
		for(CustomerList c:allCustomers)
		{
			System.out.println(c);
		}
		

		
		
		
	}

}
