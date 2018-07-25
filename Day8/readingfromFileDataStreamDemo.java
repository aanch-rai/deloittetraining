//Now we are retrieving in the same order as we input in the dataInputStreamDemo class
//ie name, quantity, price
//Here we specify from which file we want to read from and then use stream.readUTF or stream.readInt
package Day8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readingfromFileDataStreamDemo
{
	public static void main(String[] args) throws IOException {
		String n;
		int p=0;int q=0;
		
		DataInputStream stream = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(
								new File("myrecord.txt"))));
				
				n=stream.readUTF();
				q=stream.readInt();
				p=stream.readInt();
						
				
				q=2*q;
				p=2*p;
				System.out.println("Name:"+n);
				System.out.println("New  Price : "+p);
				System.out.println("quantity"+q);
	}

}
