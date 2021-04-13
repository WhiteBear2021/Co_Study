<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="/css/myPage/myPage.css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include> 
	<section id="wrap">
		<aside id="left_side_nav">
			<nav>
	   			<ul>
	                <li><a href="/CoStudy/myPage/studyDiaryListAction.do">공부일기 아이콘1</a></li>
	                <li><a href="/CoStudy/myPage/scheduleListAction.do">일정관리 아이콘2</a></li>
	                <li><a href="#">1:1 채팅목록 아이콘3</a></li>
	                <li><a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹 목록 아이콘4</a></li>
	                <li><a href="/CoStudy/myPage/categoryUpdateFormAction.do">관심 분야 수정 아이콘5</a></li>
	                <li><a href="/CoStudy/myPage/userUpdateFormAction.do">회원 정보 수정 아이콘6</a></li>
	                <li><a href="/CoStudy/myPage/applyQuitUserCheckFormAction.do">회원 탈퇴 신청 아이콘7</a></li>
	   			</ul>
	   		</nav>
	   	</aside>
	   	
	   	
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
	
	<jsp:include page="/view/common/footer.jsp"></jsp:include> 
</body>
</html>