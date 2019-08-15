<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
	$(function() {
		//alert('jquery test');
	})
</script>
</head>
<body>
	<h3>게시글 정보</h3>
	<p></p>
	${content.BRD_NO }
	${content.BRD_CONTENT}
	<p></p>
	<a href="board.do">글 목록</a>
	<p></p>
	<c:if test="${prev != 0 }">
		<a href="boardc.do?no=${prev}">이전 글(MVC)</a>
	</c:if>
	&nbsp;
	<c:if test="${next != 0 }">
		<a href="boardc.do?no=${next}">다음 글(AJAX)</a>
	</c:if>
	<a href="boarde.do?no=${content.BRD_NO }">글수정</a>
</body>
</html>