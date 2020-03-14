<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
String name1=(String)session.getAttribute("sname");
String password1=(String)session.getAttribute("spassword");
String age1=(String)session.getAttribute("sage");
out.print("Hello user: You have entered the name:"+name1+" "+age1+" "+password1);
%>
</body>
</html>