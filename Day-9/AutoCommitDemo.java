//execute all the queries correctly or undo execution of all upon error
//We have to first set the autoCommit to false (system will stop commiting by itself)
//Put queries in try-catch block
//commit manually
//In the catch block, rollback will undo all the previously executed queries
//Example :input wrong values in the second iteration, the code will terminate and the table in sql will not contain the first iteration either. 

package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AutoCommitDemo
{
	public static void main(String[] args) throws SQLException 
	{
		Connection connection = MyConnection.getConnection();
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = null;
		
		connection.setAutoCommit(false);
	try {	
		for(int i=0;i<3;i++)
		{ps = connection.prepareStatement("insert into this_student values(?,?)");
		System.out.println("Enter roll no. ");
		int roll = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.executeUpdate();
		}
		
		connection.commit();
	}

	catch(Exception e)
	{
		connection.rollback(); //In case of error rollback and undo all previous executions/query updates
	}
	
	sc.close();
	connection.close();
		
		
		
		
	}

}
