package model;
import java.sql.*;

public class Jdbc_Demo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	A.load the driver into the jvm by 3 ways
		//1.Class.forname
		//2.driver manager.register driver(driver instance)
		//3.using system properties.from the command line interface.
		//java-d driver=driver name driver implementation class application name
	 	
		//B. getConnection
		//1.using driverManager.getConnection(url)for msaccess
		//2.using driverManager.getConnection(url,username,password)
		//3.using driverManager.getConnection(url,properties)properties pass user,pass
		
		//C.Execute sql queries
		//using Statement
		//using PreparedStatement
		//using Callable Statement
		
		//D.execute sql statements
		//by statements
		//1.Execute()========DDL==
		//2.ExecuteQuery();==DRL==
		//3.ExecuteUpdate();=DML==
		//by prepared statement==same methods without sql quries;
		//by calable statements for proceedures and functions
		//
		//E.Result Set:read data from database
		//	WE CAN ITERATE DATA WHICH IS COMING FROM DATABASE
		//	
		
				try{
					Class.forName("com.mysql.jdbc.Driver");
					
				}catch(ClassNotFoundException cnfe)
				{
					cnfe.printStackTrace();
				}
				try{
			Connection con=		DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
				System.out.println(con);		
				}catch(SQLException se)
				{
					se.printStackTrace();
				}
				
				
	}

}
