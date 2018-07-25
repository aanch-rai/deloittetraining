package day7;

import java.io.File;
import java.io.IOException;

public class filesdemo
{
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Batch\\BatchMates.txt");
		File f2 = new File("C:\\Batch");
		if(f1.exists())
		{
			System.out.println("Exists");
		}
		else 
		
		{
			boolean result = f2.mkdir();
			if(result)
			{	
				f1.createNewFile();
				System.out.println("New file created");
			}
		}
		
		for (File eachFile: f2.listFiles())
		{
			System.out.println(eachFile);
		}
	}

}
