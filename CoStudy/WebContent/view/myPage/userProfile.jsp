<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../../css/user.css">
<title>Insert title here</title>
</head>
<body>
   	<section class="container">	
   		<nav>
   			<ul>
                <li><a href="../../myPage/studyDiaryListAction">공부일기 아이콘1</a></li>
                <li><a href="../../myPage/scheduleListAction">일정관리 아이콘2</a></li>
                <li><a href="#">1:1 채팅목록 아이콘3</a></li>
                <li><a href="../../myPage/joinGroupListAction">참가 그룹 목록 아이콘4</a></li>
                <li><a href="../../myPage/categoryUpdateFormAction">관심 분야 수정 아이콘5</a></li>
                <li><a href="../../myPage/userUpdateFormAction">회원 정보 수정 아이콘6</a></li>
                <li><a href="../../myPage/applyQuitUserCheckFromAction">회원 탈퇴 신청 아이콘7</a></li>
   			</ul>
   		</nav>
	    <div class="my_profile">
	    
	        <h3>My Profile</h3>

	        아이디 :  ${sessionScope.user.user_id}
	        <br>
	        생년월일 : ${sessionScope.user.user_birth}
	        <br>
	        이름 : ${sessionScope.user.user_lastName}${sessionScope.user.user_firstName}
	        <br>
	        휴대전화 번호 :${sessionScope.user.user_phoneNo }
	        <br>
	        우편번호 : ${sessionScope.user.user_post }
	        <br>
	        주소 :	${sessionScope.user.user_address1 }
	        <br>
	        상세주소 : ${sessionScope.user.user_address2 }
	        <br>
	        이메일 주소 : ${sessionScope.user.user_email }
	        <br>
	        가입일 : ${sessionScope.user.user_register_date }
	    </div>
	</section>
</body>
</html>