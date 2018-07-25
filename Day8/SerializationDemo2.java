//Here we read from file which is serialized
//Also, if we mark a variable as TRANSIENT, that variable will not be stored in the file!!

package Day8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo2 {

		public static void main(String[] args) throws IOException, ClassNotFoundException
		{
			FileInputStream stream = new FileInputStream("customer.txt");
			BufferedInputStream bs = new BufferedInputStream(stream);
			ObjectInputStream ot = new ObjectInputStream(bs);
			CustomerList c = (CustomerList) ot.readObject();
			System.out.println(c);
			
		}
}
