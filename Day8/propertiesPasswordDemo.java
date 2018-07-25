/*
* So here we are storing our username and password in a file called 'config.properties'
*We are then accessing the data in the file using 'username' and 'password' as key! Thus even if
 the username and password changes, we dont have to worry about those changes applying through the 
 architecture of the project.
*REMEMBER TO STORE THE FILE 'config.properties' in double quotes so it stores as a '.properties' file and 
not as a '.txt' file
*/

package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesPasswordDemo
{
	public static void main(String[] args) throws IOException
	{
		InputStream stream = new FileInputStream("C:\\Batch\\config.properties"); //stores the location of file
		Properties prop = new Properties();
		prop.load(stream);
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		
		System.out.println("User name is : "+username);
		System.out.println("Password is: "+password);
		
		stream.close();
	}

}
