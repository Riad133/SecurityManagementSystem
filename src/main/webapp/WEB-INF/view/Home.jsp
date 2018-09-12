<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h2>Hello world</h2>
<form:form action="${pageContext.request.contextPath}/logout" method="Post">
  <input type="submit" value="Logout"/>
</form:form>

<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting </a>
(Only for Manager people)
<br>
<a href="${pageContext.request.contextPath}/employees">LeaderShip Meeting </a>
(Only for employees )
</body>
</html>