//using readers and writers


package day7;
import java.io.*;


public class copypasting
{
	public static void main(String[] args) throws IOException
	{
		if(args.length<2)
		{
			System.out.println("Invalid no of inputs");
		}
		
		File f1 = new File("C:\\Batch\\"+args[0]);
		File f2 = new File("C:\\Batch\\"+args[1]);
		
		FileReader r = new FileReader(f1);
		FileWriter w = new FileWriter(f2);
		
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
		
		r.close();
		w.close();
	}
	}
