<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 글쓰기</h3>
	<form action="boardw.do" method="post">
		제목 : <input type="text" name="title"/><br />
		내용 : <textarea row="6" name="content"></textarea><br />
		작성자 : <input type="text" name="writer"/><br />
		<input type="submit" value="글쓰기"/><br />
	</form>
</body>
</html>