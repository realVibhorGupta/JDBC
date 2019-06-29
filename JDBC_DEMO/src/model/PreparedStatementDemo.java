package model;
import java.sql.*;
import java.util.Scanner;
public class PreparedStatementDemo {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner(System.in);
			System.out.println("ENTER YOUR ID");
		 int id=obj.nextInt();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		/*PreparedStatement ps=con.prepareStatement("insert into student1  values(?,?,? )");
		ps.setInt(1, 3);
		ps.setString(2, "priya");
		ps.setString(3,"abc@gmail.com");
		ps.executeUpdate();
		//ps.executeQuery();
		ps.setInt(1, 4);
		ps.setString(2, "pia");
		ps.setString(3,"abc@gmail.com");
		ps.executeUpdate();*/
		
		PreparedStatement ps1=con.prepareStatement(" select * from student1 where id=?");
		
		ps1.setInt(1, id);
		
		ResultSet rs=ps1.executeQuery();
		
		while(rs.next())
		{
			for(int i=0;i<=0;i++)
			{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
			
	}

}
