package jdbc;
import java.sql.*;
import java.util.Scanner;
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			String query="select * from customers where id=";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id");
			int id=sc.nextInt();
			pst.setInt(1,id);
			ResultSet x=pst.executeQuery(query);
			if(x.next()) {
			System.out.println(x.next());
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
