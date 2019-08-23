<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Here!</title>
<jsp:include page="bootstrap.jsp"></jsp:include>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
		<div class="container">
			<a class="navbar-brand" href="#">Remembrance Project</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="login.do">로그인</a></li>
					<li class="nav-item"><a class="nav-link" href="register.do">사용자 등록</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<main class="login-form">
	<div class="cotainer">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card">
					<div class="card-header">사용자 회원등록</div>
					<div class="card-body">
					
						<form action="register.do" method="post">
							<div class="form-group row">
								<label for="email_address"
									class="col-md-4 col-form-label text-md-right">사용자 이름</label>
								<div class="col-md-6">
									<input type="text" id="email_address" class="form-control"
										name="user_id" required autofocus>
								</div>
							</div>

							<div class="form-group row">
								<label for="password"
									class="col-md-4 col-form-label text-md-right">비밀번호</label>
								<div class="col-md-6">
									<input type="password" id="password" class="form-control"
										name="user_pw" required>
								</div>
							</div>
							
							<div class="form-group row">
								<label for="password_confirm"
									class="col-md-4 col-form-label text-md-right">비밀번호 확인</label>
								<div class="col-md-6">
									<input type="password" id="password" class="form-control"
										name="user_pw_confirm" required>
								</div>
							</div>
							
							<div class="form-group row">
								<label for="motto"
									class="col-md-4 col-form-label text-md-right">자기소개</label>
								<div class="col-md-6">
									<input type="text" id="motto" class="form-control"
										name="user_motto" required>
								</div>
							</div>

							<!-- <div class="form-group row">
								<div class="col-md-6 offset-md-4">
									<div class="checkbox">
										<label> <input type="checkbox" name="remember">
											Remember Me
										</label>
									</div>
								</div>
							</div> -->

							<div class="col-md-6 offset-md-4">
								<button type="button" class="btn btn-primary" onclick="location:href='login.do'">로그인</button>
							&nbsp;&nbsp;&nbsp;
								<button type="submit" class="btn btn-primary" onclick="register.do">회원등록</button>
							<!-- <a href="#" class="btn btn-link"> Forgot Your Password? </a> -->
							</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</div>

	</main>
</body>
</html>