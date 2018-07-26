/*
 * In this file we are downloading the driver to connect to database and then connec to database
 *  To load driver--
 * First find the link online as to what you want to download and download the zip file
 * Extract the zip file onto a folder and a jar file will get created
 * right-click on project + Build path + configure Path + libraries +Add external libraries
 * Add the external jar file
 * Refresh the project and check the referenced libraries--it should be there 
 */

package day9;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTest
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		//define the connection URL
		//Establish the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		System.out.println("Connected");
		//Create statement object
		Statement stat = connection.createStatement();
		//Execute the query
		ResultSet resultSet = stat.executeQuery("select * from stud ");
		System.out.println("The result is");
		
		
		while(resultSet.next()) //resultset.next will fetch the row
		{
			System.out.print(resultSet.getString(1)+ "    "); //resultset.getString will get the value of the first column
			System.out.print(resultSet.getString(2)+ "    ");
			System.out.print(resultSet.getString(3)+ "    ");
			System.out.print(resultSet.getString(4)+ "    ");
			System.out.println();
		}
		
		
		 	
		ResultSetMetaData rsmd = resultSet.getMetaData();
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{String name = rsmd.getColumnLabel(i);
		 System.out.print(name+"     ");
		}
		
		
		
		DatabaseMetaData dbinfo = connection.getMetaData();
		System.out.println(dbinfo.getDatabaseProductName());
		
		
	}

}
