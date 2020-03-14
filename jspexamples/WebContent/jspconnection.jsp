<%@page import="java.util.Scanner"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			
			String query="insert into Employee1 values(?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			
			Scanner sc=new Scanner(System.in);
			out.println("Enter Employee name:");
			String name=sc.next();
			out.println("Enter Employee ID:");
			String id=sc.next();
			out.println("Enter Employee department:");
			String dept=sc.next();
			out.println("Enter Employee designation:");
			String desg=sc.next();
			out.println("Enter Employee company:");
			String company=sc.next();
			out.println("Enter Employee Email-id:");
			String emailid=sc.next();
			
			pst.setString(1, name);
			pst.setString(2,id);
			pst.setString(3, dept);
			pst.setString(4, desg);
			pst.setString(5, company);
			pst.setString(6, emailid);
			
			int x=pst.executeUpdate();
			out.println(x+"Record inserted...");
			
			
			
		}
		catch(Exception e) {

	}%>
</body>
</html>