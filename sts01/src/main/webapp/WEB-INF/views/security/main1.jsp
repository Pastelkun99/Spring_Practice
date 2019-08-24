<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>main1</title>
</head>

<body>
	<security:authorize access="isAuthenticated()"> <!-- 로그인 했을 때 -->
		<security:authentication property="name"/> 님 환영합니다 
		<a href="${pageContext.request.contextPath}/logout1.do">로그아웃</a>
	</security:authorize>
	
	<security:authorize access="isAnonymous()"> <!-- 로그인 안했을때 -->
		<a href="${pageContext.request.contextPath}/login1.do">로그인</a>
	</security:authorize>
	
	<a href="${pageContext.request.contextPath}/admin/mypage.do">관리자</a>
	<a href="${pageContext.request.contextPath}/teacher/mypage.do">교사</a>
	<a href="${pageContext.request.contextPath}/student/mypage.do">학생</a>
</body>
</html>