package model;
import java.sql.*;
public class Jdbc_Demo5 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		System.out.println(con);
		
		
		

	}

}
