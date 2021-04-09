<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="hold-transition login-page">
	<div class="login-box-body">
		<p class="login-box-msg">로그인 페이지</p>
		<form action="../../user/loginAction" method="post">
			<div class ="form-group has-feedback">
				<input type ="text" name ="userId" placeholder="아이디">
			</div>
			<div class ="form-group has-feedback">
				<input type ="password" name ="userPw" placeholder="비밀번호">
			</div>
			<br><br>
			<div class = "row">
				<div class ="col-xs-4">
					<button type="submit" class="btn btn-primary btn-block btn-flat">
						<i class = "fa fa-sign-up"></i>로그인
					</button>
				</div>
			</div>
		</form>
	</div>
	
</body>
</html>