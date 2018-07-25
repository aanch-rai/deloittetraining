package Day8;
import java.io.*;

public class showingprintln
{
	public static void main(String[] args) throws Exception
	{
	FileOutputStream fout = new FileOutputStream("Data.txt");
	PrintStream pout = new PrintStream(fout);
		
	//PrintStream pout = new PrintStream("DATA"));*/

	pout.println("hi");
	pout.close();
	fout.close();
	}
}
