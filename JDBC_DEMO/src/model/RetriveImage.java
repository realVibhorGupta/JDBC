package model;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
public class RetriveImage {

	public static void main(String[] args)throws SQLException,ClassNotFoundException, FileNotFoundException {
		// TODO Auto-generated method stub
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select photo from student2 where id=5 ");
	
	FileOutputStream fos=new FileOutputStream("vibhor.jpg");
	while(rs.next())
	{
		InputStream input=rs.getBinaryStream("photo");
//		while(input.read(buffer)>0)
//		{
//			output.write(buffer);
//			
//		}

		}
	
	
	}

}
