package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountsDao {
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
     
    public AccountsDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
}
    public static void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    public void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
    public static void withdraw(float amount) {
    	
    }
 public static void diposit(String acctNumber,float amount) throws SQLException {
	 connect();
	 String sql="update Accounts set balance=balance+? where accountNumber="+acctNumber;
			PreparedStatement pst = jdbcConnection.prepareStatement(sql);
			pst.setFloat(1, amount);
			pst.setString(2, acctNumber);
     		int status = pst.executeUpdate(sql);
     		System.out.println("Amount deposited");
    }
 public static float getBalance(String acctNumber) throws SQLException {
	 connect();
	 String sql="select balance from accounts where acno="+acctNumber;
	 	Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		resultSet.next();
		System.out.println(resultSet.getFloat(1));
		return 0;
 } 
}