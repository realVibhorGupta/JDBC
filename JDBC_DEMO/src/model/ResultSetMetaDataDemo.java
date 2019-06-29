package model;
import java.sql.*;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		System.out.println(con);
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from  student1");
		
		ResultSetMetaData metaData=rs.getMetaData();
		int noofcolumns  =metaData.getColumnCount();
		System.out.println(noofcolumns);
		
		for(int i=1;i<=max(noofcolumns);i++)
		{
		/*String columnname	=	metaData.getColumnName(i);
		System.out.println( " column number ="+ i +"column name ="+ columnname );*/
			System.out.println(metaData.getColumnName(i));
		}
		
		
		for(int i=1;i<=max(noofcolumns);i++)
		{
			System.out.println(metaData.getColumnTypeName(i));//sql only
		}
		for(int i=1;i<=max(noofcolumns);i++)
		{
			System.out.println(metaData.getColumnType(i));
		}
		for(int i=1;i<=max(noofcolumns);i++)
		{
			System.out.println(metaData.getTableName(i));
		}
		for(int i=1;i<=max(noofcolumns);i++)
		{
			System.out.println(metaData.getCatalogName(i));//package name
		}
		for(int i=1;i<=max(noofcolumns);i++)
		{
			System.out.println(metaData.getColumnDisplaySize(i));
		}
		
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
		System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email"));
		}
	}

	 static int max(int noofcolumns) {
		// TODO Auto-generated method stub
		return noofcolumns;
	}
}
