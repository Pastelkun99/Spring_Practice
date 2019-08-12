<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>목록보기</h1>

<c:forEach items="${list2}" var="board">
	${board.bno }, ${board.title }, ${board.writer }, ${board.content },
	<fmt:formatDate value="${board.regdate }" pattern="yyyy-MM-dd"/>,
	<fmt:formatDate value="${board.updateDate }" pattern="yyyy-MM-dd"/>
	<br>
</c:forEach>

</body>
</html>