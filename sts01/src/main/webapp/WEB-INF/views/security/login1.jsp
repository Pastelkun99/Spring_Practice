<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>login1</title>
</head>

<body>
	<form action="login2.do" method="post">
		<input type="text" name="id" placeholder="아이디"/>
		<input type="password" name="pw" placeholder="비밀번호"/>
		<input type="submit" value="로그인"/>
		<a href="${pageContext.request.contextPath }/main1.do">메인으로</a>
	</form>
</body>
</html>