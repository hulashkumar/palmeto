package jdbc;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		String query="create table student(htno int(5),name varchar(15),branch varchar(6),ccode varchar(10))";
		int count =statement.executeUpdate(query);
		System.out.println(count+"created");
		statement.close();
		connection.close();
	}

}
