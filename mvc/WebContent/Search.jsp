<%@page import="data.Employee"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="90%">
<tr><th>Empid</th><th>Name</th><th>Desg</th><th>Dept</th><th>Email</th></tr>
<%
Employee list=(Employee)request.getAttribute("emp");
%>
<c:set var="u" value="${list}"></c:set>

<tr><td>${emp.getEmpid()}</td><td>${emp.getEname()}</td><td>${emp.getDesg()}</td><td>${emp.getDept()}</td><td>${emp.getEmail()}</td></tr>

</table>
</body>
</html>