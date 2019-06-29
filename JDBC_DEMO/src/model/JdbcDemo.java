package model;
import java.sql.*;
public class JdbcDemo {
	
			public static void main(String args[])
			{
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from qualification");
			while(rs.next())
			{
			System.out.println(rs.getDouble("id")+" " +rs.getString("name"));
			}
			
			con.close();
			
			}
			catch(Exception e){
			e.printStackTrace();
			}
			
			}
	}
			
		
						
			
		


