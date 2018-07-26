package day9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = MyConnection.getConnection();
		Statement s = connection.createStatement();
		connection.setAutoCommit(false);
		
		try {
			s.addBatch("insert into this_student values(10,'Simon')");
			s.addBatch("insert into this_student values(11,'Rimon')");
			s.addBatch("insert into this_student values(12,'limon')");
			s.addBatch("insert into this_student values(13,'timon')");
			
			int[] updateCounts = s.executeBatch();
			connection.commit();
		} 
		catch (Exception e)
		{
			connection.rollback();// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
