//Process of writing the state of an object into a file using byte Stream.
//Basically instead of using readUTF readUTF several times, we will store objects in the file
//It will directly store as an object that stores all types of variables etc.

package Day8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationDemo
{
	public static void main(String[] args) throws IOException
	{
		CustomerList customer = new CustomerList(122, 100, "Aanch", "Mumbai");
		FileOutputStream stream = new FileOutputStream("customer.txt");
		BufferedOutputStream bs = new BufferedOutputStream(stream);
		ObjectOutputStream ot = new ObjectOutputStream(bs);
		ot.writeObject(customer);
		ot.close();
		System.out.println(customer.getCustomerName()+"Your record is stored in customer.txt");
		
		
		
	}

}
