package day9;
import java.sql.*;
import java.util.Scanner;

	public class PreparedStatementDemo
	{
		public static void main(String[] args) throws SQLException
		{
			
		Connection connection = MyConnection.getConnection();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll : ");
		int roll = scanner.nextInt();
		
		System.out.println("Enter the name : ");
		String name = scanner.next();
		
		java.sql.PreparedStatement ps = connection.prepareStatement("insert into this_student values(?,?)");
	
		ps.setInt(1, roll);
		ps.setString(2, name);
		
		ps.executeUpdate();
		
		System.out.println("this_student Updated !!");
	
		connection.close();
		
		}
	}
		



