<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="mav_select.do" modelAttribute="vo" method="post">
		아이디 : <form:input path="id"/> <br/>
		언어 선택 : <form:select path="lang1" items="${select_list }"></form:select>
		<input type="submit" value="전송"/>
	</form:form>
</body>
</html>