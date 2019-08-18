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
	<form action="join.do" method="post" enctype="multipart/form-data">
		아이디 : <input type="text" name="mem_id"><br/>
		암호 : <input type="password" name="mem_pw"><br/>
		암호 확인 : <input type="password" name="mem_pw1"><br/>
		이름 : <input type="text" name="mem_name"><br/>
		나이 : <input type="text" name="mem_age"><br/>
		이미지 : <input type="file" name="mem_img1"/><br/>
		<input type="submit" value="회원 가입"/>
	</form>
</body>
</html>