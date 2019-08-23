<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
<!-- 	<a href="joinSeller.do">판매자 로그인은 여기로!</a> -->
	<br/>
	<form action="join.do" method="post" enctype="multipart/form-data">
		아이디 : <input type="text" name="mem_id"><br/>
		암호 : <input type="password" name="mem_pw"><br/>
		이름 : <input type="text" name="mem_name"><br/>
		전화번호 : <input type="text" name="mem_phone"><br/>
		주소 : <input type="text" name="mem_addr"><br/>
		<br/>
		판매자 구분:
		<select name="mem_grade">
			<option value = "1"> 고객 </option>
			<option value = "9"> 판매자 </option>
		</select>
		<br/>
		<br/>
		<input type="submit" value="회원 가입"/>
		<br/>
		<br/>
	</form>
</body>
</html>
