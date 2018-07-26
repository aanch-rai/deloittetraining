package day9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class createTableDemo 
{
	public static void main(String[] args) throws SQLException {
		Connection connection = MyConnection.getConnection();
		Statement s = connection.createStatement();
		s.executeUpdate("create table this_student (roll numeric(3),sname varchar(10))");
		
	}

}
