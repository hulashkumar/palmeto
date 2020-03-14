<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Searched.jsp">
<%
try {
	String id=request.getParameter("id");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	PreparedStatement pst=con.prepareStatement("select * from employee1 where id=?");
	pst.setString(1, id);
	ResultSet rs=pst.executeQuery();
	rs.next();
	/*int count=pst.executeUpdate();
	response.setContentType("text/html");
	PrintWriter out1=response.getWriter();
	out1.println("<html><body>");
	out1.println(rs.getString(1)+" "+rs.getString(3)+" "+rs.getString(4));*/
	%>
	
	<input type="text" value="<%out.println(rs.getString(1));%>" name="name" "><br>
	<input type="text" value="<%out.println(rs.getString(2));%>" name="id" "><br>
	<input type="text" value="<%out.println(rs.getString(3));%>" name="dept" "><br>
	<input type="text" value="<%out.println(rs.getString(4));%>" name="desg" "><br>
	<input type="text" value="<%out.println(rs.getString(5));%>" name="company" "><br>
	<input type="text" value="<%out.println(rs.getString(6));%>" name="emailid" "><br>

<%}
catch(Exception e) {
	
} %>
<input type="submit" value="Submit"></form>
</body>
</html>