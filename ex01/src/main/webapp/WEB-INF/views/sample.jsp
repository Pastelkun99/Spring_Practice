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
<img src="http://pds20.egloos.com/pds/201107/26/16/a0005716_4e2df6727609b.jpg"/>
<form action="/sample/ex01" method="get">
	name = <input type="text" id="name" name="name"><br>
	age = <input type="text" id="age" name="age"><br>
	gender = <input type="text" id="gender" name="gender"><br>
	<input type="submit" value="제출"></input>
	<br>
	<br>
	<a href="/sample/sooryong">수령님 사진 보기</a>
</form>
</body>
</html>
