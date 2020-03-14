package jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class RBFConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("d://ctsdb.properties.txt");
			Properties p=new Properties();
			p.load(fis);
			String dname=(String) p.get("Dname");
			String url=(String) p.get("URL");
			String username=(String) p.get("Uname");
			String password=(String) p.get("pwd");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the table name ");
			String tablename=sc.next();
			
			Class.forName(dname);
			System.out.println("Drivers loaded");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection created");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from "+tablename);
			ResultSetMetaData rsmd=rs.getMetaData();
			//printing coloumn name
			System.out.println("=====================");
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnClassName(i)+" ");
			}
			System.out.println("");
			System.out.println("=============================");
			while(rs.next()) {
				for(int j=1;j<=rsmd.getColumnCount();j++) {
					System.out.print(rs.getString(j)+" ");
			}
				System.out.println(" ");
			}
			con.close();
			}
		catch(Exception e){
			System.out.println(e);
		}
	}

}