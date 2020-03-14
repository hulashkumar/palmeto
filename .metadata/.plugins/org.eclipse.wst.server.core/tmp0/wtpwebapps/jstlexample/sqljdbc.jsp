<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/cts" user="root" password="root"/>
<c:set var="Studentshtno" value="<%=request.getParameter(\"htno\")%>"/>
<c:set var="Studentsname" value="<%=request.getParameter(\"name\")%>"/>
<c:set var="Studentsbranch" value="<%=request.getParameter(\"branch\")%>"/>
<c:set var="Studentsccode" value="<%=request.getParameter(\"ccode\")%>"/>
<sql:update dataSource="${db}" var="rs">
insert into students values(?,?,?,?);
<sql:param value="${Studentshtno}"></sql:param>
<sql:param value="${Studentsname}"></sql:param>
<sql:param value="${Studentsbranch}"></sql:param>
<sql:param value="${Studentsccode}"></sql:param>
</sql:update>

<sql:query dataSource="${db}" var="rs1">
Select * from Students;
</sql:query>
<table border="2" width="100%">
<tr>
<th>HTNO</th>
<th>NAME</th>
<th>BRANCH</th>
<th>CCODE</th>
</tr>
<c:forEach var="table" items="${rs1.rows}">
<tr>
<td><c:out value="${table.HTNO}"/></td>
<td><c:out value="${table.NAME}"/></td>
<td><c:out value="${table.BRANCH}"/></td>
<td><c:out value="${table.CCODE}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>