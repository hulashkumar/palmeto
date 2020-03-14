<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<form action="updated.jsp">
<body>
<%
String Empno=request.getParameter("Empno");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts1","root","root");
PreparedStatement pst=con.prepareStatement("select * from Employee where Empno=?");
pst.setString(1,Empno);
ResultSet rs=pst.executeQuery();
rs.next();
%>
<input type="text" value="<%out.println(rs.getString(1));%>" name="Empno"/><br>
	<input type="text" value="<%out.println(rs.getString(2));%>" name="Ename"/><br>
	<input type="text" value="<%out.println(rs.getString(3));%>" name="Job"/><br>
	<input type="text" value="<%out.println(rs.getString(4));%>" name="Manager"/><br>
	<input type="text" value="<%out.println(rs.getString(5));%>" name="HireDate"/><br>
	<input type="text" value="<%out.println(rs.getString(6));%>" name="Salary"/><br>
	<input type="text" value="<%out.println(rs.getString(7));%>" name="Commission"/><br>
	<input type="text" value="<%out.println(rs.getString(8));%>" name="Department_no"/><br>
	<input type="submit" value="Submit">



</body>
</html>