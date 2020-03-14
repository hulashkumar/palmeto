package jdbc;

import java.sql.*;
public class MetaDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	System.out.println("DRIVERS LOADED");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	System.out.println("CONNECTION ESTABLISHED");
	DatabaseMetaData dmd=connection.getMetaData();
	System.out.println("Database name:"+dmd.getDatabaseProductName());
	System.out.println("Database version"+dmd.getDatabaseProductVersion());
	System.out.println("Name of the driver"+dmd.getDriverName());
	System.out.println("Version of driver name"+dmd.getDriverVersion());
	System.out.println("Mazor vesrion of driver"+dmd.getDriverMajorVersion());
	System.out.println("Minor vesrion of driver"+dmd.getDriverMinorVersion());
	//USER DATABASE DETAILS
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select * from emp");
	ResultSetMetaData rsmd=rs.getMetaData();
	System.out.println("number of colomn :"+rsmd.getColumnCount());
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
