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
 <form:form action="${pageContext.request.contextPath}/authenticateTheUsers" method="post">
 <p>
   User Name : <input type="text" name="username"/>
 </p>
 
 <p>
   Password : <input type="password" name="password"/>
 </p>
 <p>
   <button type="submit">Login</button>
 </p>
  <c:if test="${param.error!=null }">
  <i style="color: red">Sorry! You entered invalid user name / password </i>
  </c:if>
 </form:form>
</body>
</html>