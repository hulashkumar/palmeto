package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PreparedStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			String query="insert into customers values(?,?,?,?)";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter customer name");
			String name=sc.next();
			System.out.println("Enter customer type");
			String ctype=sc.next();
			System.out.println("Enter customer age");
			int age=sc.nextInt();
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3,ctype);
			pst.setInt(4,age);
			int x=pst.executeUpdate();
			System.out.println(x+"record inserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
