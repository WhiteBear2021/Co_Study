<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="form-group">
        <h3>본인 확인</h3>
	    <p>회원 정보 확인을 위하여 비밀번호를 입력하세요</p>
	    <p>${sessionScope.user.user_id}</p>
	    <form action="applyQuitUser" method="post">
		    비밀번호 : <input type="password" name="user_pw"><br>
		    <input type="checkbox" id="showPW">비밀번호표시
		    <br>
		    <a href="#">비밀번호 찾기</a><br>
		    <input type="reset" value="cancel">
		    <input type="submit" value="submit">
	    </form>

    </div>
</body>
</html>