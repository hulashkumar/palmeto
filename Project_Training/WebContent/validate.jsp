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
String a = request.getParameter("id");
String b = request.getParameter("pwd");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts1","root","root");

PreparedStatement pst = con.prepareStatement("select type from login where id = ? ");
PreparedStatement pst1 = con.prepareStatement("select pwd from login where id = ?");
PreparedStatement pst2 = con.prepareStatement("select uname from login where id = ? ");
pst.setString(1, a);
pst1.setString(1, a);
pst2.setString(1, a);

ResultSet rs = pst.executeQuery();
ResultSet rs1 = pst1.executeQuery();
ResultSet rs2 = pst2.executeQuery();

rs.next();
rs1.next();
rs2.next();
//float n = rs.getFloat(1);
if(b.equals(rs1.getString(1)) && rs.getString(1).equals("Admin") ){
%>

Name: <%=rs2.getString(1)%><br>
Account Type: <%=rs.getString(1)%><br>


<nav>
<a href="home.html">HOME</a><br>
<a href="add.html">Add Employee</a><br>
<a href="update.html">Update Employee</a><br>
<a href="delete.html">Delete Emp</a>
</nav>


<%
}
else{
out.println("Password Error");
}

%>
</body>
</html>