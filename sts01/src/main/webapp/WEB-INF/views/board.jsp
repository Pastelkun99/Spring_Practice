<!-- views폴더 아래의 board.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 목록</h3>
	<table border="1">
		<c:forEach var="map" items="${list}">
			<tr>
				<td>${map.BRD_NO }</td>
				<td><a href="boardc.do?no=${map.BRD_NO}">${map.BRD_TITLE }</a></td>
				<!-- no 값이 parameter가 된다 -->
				<td>${map.BRD_WRITER }</td>
				<td>${map.BRD_HIT }</td>
				<td>${map.BRD_DATE }</td>
			</tr>		
		</c:forEach>
	</table>
	<a href="boardw.do">게시판 글쓰기</a>
</body>
</html>
