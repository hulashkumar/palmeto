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
List<Employee> list=(List<Employee>)request.getAttribute("list2");
%>
<c:set var="list1" value="${list}"></c:set>
<c:forEach items="${list}" var="u">
<tr><td>${u.getEmpid()}</td><td>${u.getEname()}</td><td>${u.getDesg()}</td><td>${u.getDept()}</td><td>${u.getEmail()}</td></tr>
</c:forEach>
</table>
</body>
</html>