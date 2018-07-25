//Using BufferedReader and BufferedWriter to read from prompt and write to a file
//take name, price and quantity from user and store in a file
//Only drawback is that it only stores as a String/ASCII.
//Not stored in the format required.

package day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Assignment
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(stream);
		
		System.out.println("Enter the name");
		String name =  br.readLine(); //accepts input as string 
		
		System.out.println("Enter price: ");
		int price = Integer.parseInt(br.readLine()); //since it accepts input in string format, we have to wrap it into an integer
		
		System.out.println("Enter Quantity : ");
		int quantity = Integer.parseInt(br.readLine());
		
		//now we write :-
		
		File f = new File("C:\\Batch\\newfile.txt");

		//Here you have an option to write using FileWriter or write using BufferedWriter or OutputStream
		/* Using FileWriter :-
		   FileWriter w = new FileWriter(f);
		   w.write(name+" "+price+" "+quantity);  
		   w.close();
		   
		   
		//to write it using Filewriter --1. create the file f 2.Create obj of FileWriter w, pass file obj as parameter to constructor
		//the file newfile.txt will automatically be created 
		
		*/

		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(name+" "+price+" "+quantity);  
		

		
		bw.close();
	
		

	}
}
