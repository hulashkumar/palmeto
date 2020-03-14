<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="JSTL Programing"/>
<c:if test="${fn:contains(String,'programming')}">
<p>Found programming string</p>
</c:if>
<b>After contains tag</b>
<c:if test="${fn:contains(String,'programming')}">
<p>Found programming string</p>
</c:if>
<c:if test="${fn:containsIgnoreCase(String,'programming')}">
<p>Found programming string</p>
</c:if>
<c:if test="${fn:endsWith(String,'Programming')}">
<p>String ends with programming</p>
</c:if>
<c:set var="String1" value="It is first String."/>
<c:set var="String2" value="IT IS <xyz>SECOND STRING.<xyz>"/>

<p>Index-1 : ${fn:indexOf(String1,"first")}</p>
<p>Index-2 : ${fn:indexOf(String2,"second")}</p>

<c:set var="str1" value="welcome to jsp     Programing     "/>
<p>String-1 length is  :${fn:length(str1) }</p>
<c:set var="str2" value="${fn:trim(str1)}"/>
<p>String-2 length is ::${fn:length(str2) }</p>
</body>
</html>