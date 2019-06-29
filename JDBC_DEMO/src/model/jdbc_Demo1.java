package model;
import java.sql.*;
public class jdbc_Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from qualification");
		while(rs.next())
		{
			System.out.println(rs);
		}
		
		con.close();
		
		
	}
}
