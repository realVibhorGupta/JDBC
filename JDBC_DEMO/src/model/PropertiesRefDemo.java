package model;
import java.io.*;
import java.sql.*;
import java.util.*;
public class PropertiesRefDemo {

	public static void main(String[] args) throws SQLException,ClassNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		p.load(new FileInputStream("D:/MyNewWork/JDBC_DEMO/src/resources/DB.properties"));
		//Class.forName("com.mysql.jdbc.Driver");
	//	DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", p/)
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		Class.forName(p.getProperty("driver"));
		Connection con=DriverManager.getConnection(p.getProperty("url"),p);
		System.out.println(con);
	}

}
