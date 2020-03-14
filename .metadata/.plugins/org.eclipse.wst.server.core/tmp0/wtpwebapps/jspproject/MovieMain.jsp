<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="jspproject.Details"></jsp:useBean>
<jsp:setProperty property="username" name="u"/>
<jsp:setProperty property="age" name="a"/>
Name: <jsp:getProperty property="username" name="u"/><br>
Age: <jsp:getProperty property="age" name="a"/><br>
<%Integer age=Integer.parseInt(request.getParameter("age")); %>
<%if(age>62){
out.println("Ticket price = $7.00");
}
 else if(age<10){
out.println("Ticket price = $5.00");
}
 else{
out.println("Ticket price = $9.50");
 }
%>
</body>
</html>