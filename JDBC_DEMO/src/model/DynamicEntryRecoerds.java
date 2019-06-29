package model;
import java.sql.*;
import java.util.*;
public class DynamicEntryRecoerds {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		PreparedStatement  ps=con.prepareStatement("insert into student2 values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println(con);
		
		while(true)
		{
			System.out.println("ENTER ID=");
			int id=sc.nextInt();
			ps.setInt(1, id);
			System.out.println("ENTER NAME=");
			String name=sc.next();
			ps.setString(2, name);
			System.out.println("ENTER EMAIL=");
			String email=sc.next();
			ps.setString(3, email);
			int i=ps.executeUpdate();
			System.out.println("TO ENTER NEW RECORD ENTER 1 ELSE 2");
		
			int userinput=sc.nextInt();
			if(userinput!=1)
			{	
				System.exit(0);
			
			
		}
		
		
	}
	}
}
