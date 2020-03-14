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
String name=request.getParameter("name");
String id=request.getParameter("id");
String dept=request.getParameter("dept");
String desg=request.getParameter("desg");
String company=request.getParameter("company");
String emailid=request.getParameter("emailid");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
PreparedStatement pst=con.prepareStatement("UPDATE   employee1 Set name=?,dept=?,desg=?,company=?,emailid=? where id=?");
pst.setString(1,name);
pst.setString(2,dept);
pst.setString(3,desg);
pst.setString(4,company);
pst.setString(5,emailid);
pst.setString(6,id);
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
