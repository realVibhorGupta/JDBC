package model;

import java.sql.*;



public class JdbcDemo2 {


			public static void main(String args[]) throws SQLException
			{
			try
			{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException e)
			{
	
				e.printStackTrace();
			}
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:test");	
			System.out.println(con);
			
			
			
			
		
			}		
		
}