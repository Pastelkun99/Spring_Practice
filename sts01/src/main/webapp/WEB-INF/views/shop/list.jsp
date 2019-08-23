<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원목록</title>
	<link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
    
    <script>
        $(function(){
            $("#dt_table").DataTable();
        });
    </script>
</head>

<body>
	<div style="width:600px; margin:0 auto; margin-top:10px">
		<table id="dt_table" class="table table-bordered">
	        <thead>
	            <tr>
	            	<th>아이디</th>
	            	<th>이름</th>
	            	<th>전화번호</th>
	            	<th>가입일자</th>
	            	<th>주소</th>
	            	<th>사용자등급</th>
	            </tr>
	        </thead>
	        <tbody>
	        	<c:forEach var="tmp" items="${list}">
	            	<tr>
	            		<td>${tmp.MEM_ID}</td>
	            		<td>${tmp.MEM_NAME}</td>
	            		<td>${tmp.MEM_PHONE}</td>
	            		<td>${tmp.MEM_DATE}</td>
	            		<td>${tmp.MEM_ADDR}</td>
	            		<td>${tmp.MEM_GRADE }</td>
	            	</tr>
	            </c:forEach>
	        </tbody>
	    </table>
    </div>

</body>
</html>