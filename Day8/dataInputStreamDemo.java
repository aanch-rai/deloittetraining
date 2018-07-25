//Using Data output Stream we can store the integer values, double values etc, as it is
//the data wont be automatically converted to a string like in BufferedWriter in Assignment- Day7

package Day8;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataInputStreamDemo
{
	public static void main(String[] args) throws IOException 	{
		int quantity = 10;
		String name = "Aanch";
		int price = 20;
		
	FileOutputStream writer = new FileOutputStream("myrecord.txt");
	BufferedOutputStream bs = new BufferedOutputStream(writer);
	DataOutputStream ds = new DataOutputStream(bs);
	
	ds.writeUTF(name); //Uniform Text Format
	ds.writeInt(quantity);
	ds.writeInt(price);
	

	
	//!!!!ALWAYS CLOSE IN OPPOSITE ORDER i.e close ds,bs and then writer
	ds.close();
	bs.close();
	writer.close();
	
	
	
	}
	
}
