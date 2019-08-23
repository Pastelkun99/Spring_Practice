<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" pageEncoding="UTF-8"%>
<jsp:include page="bootstrap.jsp"></jsp:include>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:if test="${sessionScope.login_check eq null }">
		<a href="login.do">로그인 화면으로</a>
	</c:if>
	
	<c:if test="${sessionScope.login_check ne null }">
		${sessionScope.login_check } 님 안녕하세요!
		<a href="main.do">단어장</a>
		<br/>
	</c:if>
</body>
</html>
