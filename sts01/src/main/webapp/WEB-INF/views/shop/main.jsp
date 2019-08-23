<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈 화면</title>
</head>
<body>
	<c:if test="${sessionScope.S_ID eq null }">
		<a href="${pageContext.request.contextPath }/mem/login.do">로그인</a>
		<a href="${pageContext.request.contextPath }/mem/join.do">회원 가입</a>
	</c:if>
	
	<c:if test="${sessionScope.S_ID ne null }">
		${sessionScope.S_NA }님 환영합니다.
		<br/>
		<a href="${pageContext.request.contextPath }/mem/logout.do">로그아웃</a>
		<a href="${pageContext.request.contextPath }/mem/edit.do">정보수정</a>
		<a href="${pageContext.request.contextPath }/mem/delete.do">회원탈퇴</a>
	</c:if>	
</body>
</html>