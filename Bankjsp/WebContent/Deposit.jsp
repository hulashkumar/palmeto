<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	public static void diposit(String acctNumber,float amount) throws SQLException {
	 connect();
	 Main sql="update Accounts set balance=balance+? where acno=?";
	PreparedStatement pst = jdbcConnection.prepareStatement(sql);
	pst.setFloat(1, amount);
	pst.setString(2, acctNumber);
    		int status = pst.executeUpdate();
    		System.out.println("Amount deposited");
   }
%>
</body>
</html>