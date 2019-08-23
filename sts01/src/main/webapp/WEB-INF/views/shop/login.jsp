<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<link href="${pageContext.request.contextPath}/resources/css/login.css"
	rel="stylesheet" />

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>

<body>
	<form action="login.do" method="post">
		<div class="container">
			<div class="row">
				<div class="col-md-offset-5 col-md-3">
					<div class="form-login">
						<h4>Welcome back.</h4>
						<input type="text" name="userName" class="form-control input-sm chat-input" placeholder="username" />
						<br /> 
						<input type="password" name="userPassword" class="form-control input-sm chat-input" placeholder="password" />
						<br />
						<div class="wrapper">
							<span class="group-btn">
								<button type="submit" class="btn btn-primary btn-md">login<i class="fa fa-sign-in"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>