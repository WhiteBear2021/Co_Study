<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
<hr><br>
<form action = "../../user/signUpAction" method = "post">
	아이디:<input type="text" name="user_id"><br>
	비밀번호:<input type="text" name="user_pw"><br>
	성:<input type="text" name="user_lastName"><br>
	이름:<input type="text" name="user_firstName"><br>
	전화번호:<input type="text" name="user_phoneNo"><br>
	우편번호:<input type="text" name="user_post"><br>
	간단주소:<input type="text" name="user_address1"><br>
	상세주소:<input type="text" name="user_address2"><br>
	생년월일:<input type="text" name="user_birth"><br>
	이메일:<input type="text" name="user_email"><br>
	관심분야: <input type= "checkbox" name ="category_no" value="IT/컴퓨터">IT/컴퓨터
	<input type= "checkbox" name ="category_no" value="외국어">외국어
	<input type= "checkbox" name ="category_no" value="취업">취업
	<br>
	<input type = "submit" value="회원가입 하기">

</form>

</body>
</html>