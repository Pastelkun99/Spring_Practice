<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 수정</h3>
	<form action="boarde.do" method="post">
		번호 : <input type="text" name="no" value="${map.BRD_NO }" readonly="readonly"/><br/>
		제목 : <input type="text" name="title" value="${map.BRD_TITLE }"/><br />
		내용 : <textarea row="6" name="content">${map.BRD_CONTENT }</textarea><br />
		작성자 : <input type="text" name="writer" value="${map.BRD_WRITER }"/><br />
		<input type="submit" value="수정"/><br />
	</form>
</body>
</html>