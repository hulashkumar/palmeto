<%@page import="java.sql.Statement"%>
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
<% try {
			//String name=request.getParameter("name");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			Statement pst=con.createStatement();
			//pst.setString(1, name);
			ResultSet rs=pst.executeQuery("select * from employee;");
			while(rs.next());
			//int count=pst.executeUpdate();
			response.setContentType("text/html");
			//PrintWriter out=response.getWriter();
			out.println("<html><body>");
			out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			pst.close();
			con.close();
			out.close();
		}
		catch(Exception e) {
			
		}%>
</body>
</html>