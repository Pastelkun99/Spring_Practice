<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>채팅</title>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="http://127.0.0.1:1005/socket.io/socket.io.js"></script>
	<script>
		$(function(){
			var socket = io.connect("http://211.110.165.201:5005"); // socket.io 서버에 접속
			var userid = 'a'+ Math.floor(Math.random() * 100 + 1);
			socket.on('connect', function(){
				socket.emit('init', {id: userid, msg:'hello'}); // 접속시 아이디를 전달함.
				
				//메시지 받기
				socket.on('subscribe', function(data){
					$('#output').prepend(data.id+"] " + data.msg + "\n");
					$('#output1').html(data.msg);
				});
			});
			
			// 메시지 보내기
			$('#btn_send').click(function(){
				var msg = $('#msg').val();
				socket.emit('publish', {id:userid, msg:msg});
			});
			
		});
	</script>
</head>
<body>
	<input type="text" id="msg" placeholder="메시지 입력"/>
	<input type="button" id="btn_send" value="보내기"/>
	<br/>
	<textarea rows="20" id="output" placeholder="메시지 출력" readonly></textarea>
	<div id="output1" style="width:500px; height:500px; border:1px solid #cccccc"/>
</body>
</html>
