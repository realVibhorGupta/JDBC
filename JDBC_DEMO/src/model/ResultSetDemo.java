package model;
import java.sql.*;
public class ResultSetDemo {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student1");//drl commands
		while(rs.next())//boolean value returns
		{
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
		}
	}

}
