<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../../css/user.css">
<title>Insert title here</title>
</head>
<body>
   	<div class="container">	
   		<ul class="nav navbar-nav navbar-left">
   			<ul>
   			</ul>
   		</ul>
	    <div class="form-group userUpdate">
	        <h3>My Profile</h3>
	        <input type="hidden" name="user_no" value="${user.user_no}">
	        아이디 :  ${user.user_id}
	        <br>
	        생년월일 : ${user.user_birth}
	        <br>
	        이름 : ${user.user_lastName}${user.user_FirstName}
	        <br>
	        휴대전화 번호 :${user.user_phoneNo }
	        <br>
	        우편번호 : ${user.user_post }
	        <br>
	        주소 :	${user.user_address1 }
	        <br>
	        상세주소 : ${user.user_address2 }
	        <br>
	        이메일 주소 : ${user.user_email }
	        <br>
	        가입일 : ${user.user_register_date }
	    </div>
	</div>
</body>
</html>