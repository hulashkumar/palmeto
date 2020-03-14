<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
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
<%
String Empno=request.getParameter("Empno");
String Ename=request.getParameter("Ename");
String Job=request.getParameter("Job");
String Manager=request.getParameter("Manager");
String HireDate=request.getParameter("HireDate");
String Salary=request.getParameter("Salary");
String Commission=request.getParameter("Commission");
String Department_no=request.getParameter("Department_no");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts1","root","root");
PreparedStatement pst=con.prepareStatement("insert into Employee value(?,?,?,?,?,?,?,?)");
pst.setString(1,Empno);
pst.setString(2,Ename);
pst.setString(3,Job);
pst.setString(4,Manager);
pst.setString(5,HireDate);
pst.setString(6,Salary);
pst.setString(7,Commission);
pst.setString(8,Department_no);
pst.execute();
%>
<h2>Data Saved</h2>
</body>
</html>