package model;
import java.sql.*;


public class Statement_jdbc {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String first = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		con.setAutoCommit(false);
		Statement smt=con.createStatement();
		/*boolean b=smt.execute("select * from qualification");
		*/
		String ddl="create table student3(id int not null ,name varchar(20) ,email varchar(50))";
		smt.execute(ddl);
		System.out.println("table created successfully");
		
//	con.rollback();
int rowsaffected=smt.executeUpdate("insert into student1 values(2,'rakesh','abc@gmail.com') ");
		con.commit();
		
		System.out.println(rowsaffected);
		}
	}
	


  