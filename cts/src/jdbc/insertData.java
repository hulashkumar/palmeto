package jdbc;
import java.sql.*;
import java.util.Scanner;

public class insertData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the id to delete");
		int id=sc.nextInt();
		//String query="insert into customers values"+"(1006,'hulash','master',21),(1007,'reddy','master',22)";
		String query="delete from customers where id="+id;
		//String query="delete from customers where id=1002";
		int count =statement.executeUpdate(query);
		//boolean flag=statement.execute(query);
		
		System.out.println("Records deleted....");
		statement.close();
		connection.close();
	}

}