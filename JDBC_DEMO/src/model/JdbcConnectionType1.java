package model;

import java.sql.*;
import java.util.*;


public class JdbcConnectionType1 {

	
		public static void main(String args[]) throws SQLException
		{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		Enumeration e=DriverManager.getDrivers();
		
		while(e.hasMoreElements())
		{
			Driver d= (Driver)e.nextElement();
			System.out.println(d.getClass().getName());
		}
		}
}
		
		
	
					
		
	
