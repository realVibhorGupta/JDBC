package model;
import java.io.*;
import java.sql.*;
public class InsertImage {

	public static void main(String[] args)throws ClassNotFoundException,SQLException, FileNotFoundException,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		PreparedStatement ps=con.prepareStatement("insert into student3 values(?,?,?,?)");
		ps.setInt(1,6);
		ps.setString(2," vibhor");
		ps.setString(3, "coolestvibh@gmail.com");
		
	/*	FileInputStream fis=new FileInputStream("D:/IMAGES/vibhor.jpg");
		ps.setBinaryStream(4, fis);
		*/
		 
//		FileInputStream fis2=new FileInputStream("D:/IMAGES/selfie.mp3");
//		ps.setBinaryStream(4, fis2, max_allowed_packet );
		FileInputStream fis = new FileInputStream("D:/IMAGES/selfie.mp3");
         ps.setBinaryStream(4, (InputStream) fis, (int) ("D:/IMAGES/selfie.mp3"
                 .length()));

		
		/*
		FileInputStream fis3=new FileInputStream("D:/IMAGES/selfie.mp4");
		ps.setBinaryStream(4, fis3);
		
		FileInputStream fis4=new FileInputStream("D:/IMAGES/resume.docx");
		ps.setBinaryStream(4, fis4);
		*/
		int i=ps.executeUpdate();
		System.out.println("rows affected="+i);
		
	}

}
