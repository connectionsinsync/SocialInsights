<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include Page</title>
</head>
<body>
<span style="float: centre">

	<a href="${pageContext.request.contextPath}/index.html">Home</a>
    |
	<a href="${pageContext.request.contextPath}/ask-query.html">Ask Query</a>
	|
	<a href="${pageContext.request.contextPath}/my-library.html">My Library</a>
	|
	<a href="${pageContext.request.contextPath}/my-profile.html">My Profile</a>
	|
	<a href="${pageContext.request.contextPath}/innovation.html">Innovation / Ideas</a>
	|
	<a href="${pageContext.request.contextPath}/admin/first.html">First Admin page</a>
	|
	<a href="${pageContext.request.contextPath}/admin/second.html">Second Admin page</a>
</span>
</body>
</html>
