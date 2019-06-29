package model;
import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into qualification values (5,'mca')");
		System.out.println(i);
	}

}
