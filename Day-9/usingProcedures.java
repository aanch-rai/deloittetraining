package day9;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class usingProcedures 
{
	public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter roll : ");
	int roll = sc.nextInt();
	System.out.println("Enter name : ");
	String name = sc.next();
	
	Connection connection = MyConnection.getConnection();
	CallableStatement cs = connection.prepareCall("{call firstq(?,?)}");
	cs.setInt(1, roll);
	cs.setString(2,name );
	cs.execute();
	
	}
}
