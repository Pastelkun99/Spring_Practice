<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>	
	<title>Home</title>
</head>
<body>
<h1>
우리민족끼리 회원가입 페이지
</h1>
name = <%=request.getParameter("name") %> 
<br>age = <%=request.getParameter("age") %>  
<br>gender = <%=request.getParameter("gender") %>
</body>
</html>
