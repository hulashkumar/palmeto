<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
try{
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
PreparedStatement pst=con.prepareStatement("UPDATE   employee Set Ename=?,Job=?,Manager=?,HireDate=?,Salary=?,Commission=?,Department_no=? where Empno=?");
pst.setString(1,Ename);
pst.setString(2,Job);
pst.setString(3,Manager);
pst.setString(4,HireDate);
pst.setString(5,Salary);
pst.setString(6,Commission);
pst.setString(7,Department_no);
pst.setString(8,Empno);

int count=pst.executeUpdate();

if(count==1) {
out.println("<b> Updated Successfull</b>");

}
else {
out.println("<b> Cannot Update</b>");
}


pst.close();
con.close();
out.close();


}
catch(Exception e) {

}
%>
</body>
</html>
